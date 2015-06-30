package SymbolTable;

import Application.TableError;
import Application.ErrorMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.util.LinkedList;

/**
 * <p>
 * IdentifiersTable is a class which creates an identifier table (also known by symbol table).
 * </p>
 * <p>
 * It is based by a HashMap where the key is the identifier and the value is all the information of that identifier.
 * </p>
 *
 * @author damienvaz
 */
public class IdentifiersTable {

    private HashMap<String, LinkedList<InfoIdentifiersTable>> idTable;
    private int address;

    /* *** Constructor *** */

    /**
     *  <p>This constructor creates the identifier table.
     *  Also it add the four primitive data in that table which are : INTEGER, SET, SEQUENCE and BOOLEAN (regarding to the Liss Language).
     *  </p>
     */
    public IdentifiersTable(){
        this.idTable = new HashMap<String, LinkedList<InfoIdentifiersTable>>();
        this.address = 0;

        Type integer = new Type(0,"integer");
        Type set = new Type(0,"set");
        Type seq = new Type(0,"sequence");
        Type bool = new Type(0,"boolean");


        //Put the primitive types to the Identifier Table
        this.idTable.put("integer", new LinkedList<InfoIdentifiersTable>());
        this.idTable.get("integer").add(integer);
        this.idTable.put("set", new LinkedList<InfoIdentifiersTable>());
        this.idTable.get("set").add(set);
        this.idTable.put("sequence", new LinkedList<InfoIdentifiersTable>());
        this.idTable.get("sequence").add(seq);
        this.idTable.put("boolean", new LinkedList<InfoIdentifiersTable>());
        this.idTable.get("boolean").add(bool);

        //this.address = 0;

    }

    /* *** Methods *** */

    /**
     * This method gets the identifier table (also known by symbol table).
     *
     * @return A hashmap where `<b>key</b> = identifier` and <b>value</b> = `{@link InfoIdentifiersTable}`
     */
    public HashMap<String, LinkedList<InfoIdentifiersTable>> getIdentifiersTable() {
        return this.idTable;
    }

    public InfoIdentifiersTable getInfoIdentifiersTable(String id){return this.idTable.get(id).getLast();} //Return the last element of the linkedlist

    public LinkedList<InfoIdentifiersTable> getListInfoIdentifiersTable(String id){return this.idTable.get(id);}

    public void removeLevel(Integer level){
        LinkedList<String> idS = new LinkedList<String>();
        for(String id : this.idTable.keySet()){  //nao se pode remover elementos que sao usados com o foreach (dá erro )
            LinkedList<InfoIdentifiersTable> li = this.idTable.get(id);
            if(li.getLast().getLevel().equals(level) && li.size()>1){
                li.removeLast();
            }else if(li.getLast().getLevel().equals(level) && li.size()==1){
                idS.add(id);
            }
        }
        for(String id : idS){
            this.idTable.remove(id);
        }
    }

    public int getAddress(){
        return this.address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public void add(TableError e, HashMap<String, HashMap<String, Object>> hashmapVar, String type,int level){
        Type typeSpace;


        switch(type) {
            case "integer":
                Int i = new Int(new Integer(level),this.address);
                typeSpace = (Type) this.idTable.get(type).getLast();

                for(String id : hashmapVar.keySet()){
                        if(!this.idTable.containsKey(id)){
                            LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                            l.add(i.clone());
                            this.idTable.put(id, l);

                            this.address = this.address + typeSpace.getSpace();
                            i.setAddress(this.address);
                        }else {
                            //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                            if (!this.idTable.get(id).getLast().getLevel().equals(i.getLevel())) {
                                LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                                l.add(i.clone());
                                //this.idTable.put(id,l);

                                this.address = this.address + typeSpace.getSpace();
                                i.setAddress(this.address);
                            } else {
                                e.addMessage((int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.semantic(id, ErrorMessage.Declarations));
                            }
                        }
                }

                break;
            case "boolean":
                Bool b = new Bool(new Integer(level),this.address);
                typeSpace = (Type) this.idTable.get(type).getLast();

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(b.clone());
                        this.idTable.put(id,l);

                        this.address = this.address + typeSpace.getSpace();
                        b.setAddress(this.address);
                    }else{
                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(b.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(b.clone());

                            this.address = this.address + typeSpace.getSpace();
                            b.setAddress(this.address);
                        } else {
                            e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                        }
                    }
                }

                break;
            case "array":
                Array a ;
                typeSpace = (Type) this.idTable.get("integer").getLast(); //porque os elementos do array sao inteiros

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        ArrayList<Integer> arrayDimension = (ArrayList<Integer>) hashmapVar.get(id).get("dimension");
                        a = new Array(new Integer(level), new Integer(arrayDimension.size()), arrayDimension, this.address);
                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(a.clone());
                        this.idTable.put(id,l);

                        this.address = this.address + (a.getMemorySize() * typeSpace.getSpace());
                        a.setAddress(this.address);
                    }else{
                        ArrayList<Integer> arrayDimension = (ArrayList<Integer>) hashmapVar.get(id).get("dimension");
                        a = new Array(new Integer(level), new Integer(arrayDimension.size()), arrayDimension, this.address);
                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(a.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(a.clone());

                            this.address = this.address + (a.getMemorySize() * typeSpace.getSpace());
                            a.setAddress(this.address);
                        } else {
                            //e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                            e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                        }
                    }
                }

                break;
            case "sequence":
                Sequence s = new Sequence(new Integer(level),this.address,"integer");
                typeSpace = (Type) this.idTable.get(type).getLast();

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(s.clone());
                        this.idTable.put(id,l);

                        this.address = this.address + typeSpace.getSpace();
                        s.setAddress(this.address);
                    }else{
                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(s.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(s.clone());

                            this.address = this.address + typeSpace.getSpace();
                            s.setAddress(this.address);
                        } else {
                            //e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                            e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                        }
                    }
                }

                break;
            case "set":
                Set set = null;
                typeSpace = (Type) this.idTable.get(type).getLast();

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        Application.Set s1 = (Application.Set) hashmapVar.get(id).get("set");
                        set = new Set(new Integer(level),s1);

                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(set.clone());
                        this.idTable.put(id,l);

                        this.address = this.address + typeSpace.getSpace();
                        set.setAddress(this.address);
                    }else{
                        Application.Set s1 = (Application.Set) hashmapVar.get(id).get("set");
                        set = new Set(new Integer(level),s1);

                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(set.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(set.clone());

                            this.address = this.address + typeSpace.getSpace();
                            set.setAddress(this.address);
                        } else {
                            e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                        }
                    }
                }

                break;
            case "function":
                Function f = null;
                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        //Application.Set s1 = (Application.Set) hashmapVar.get(id).get("set");
                        f = new Function(new Integer(level),(String)hashmapVar.get(id).get("return"),(Integer)hashmapVar.get(id).get("numberArguments"),(LinkedList<String>)hashmapVar.get(id).get("typeList"));

                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(f.clone());
                        this.idTable.put(id, l);

                        //this.address = 0;
                        //System.out.println("Function: "+id+" Passei por aqui1. Address: "+this.address);
                        //f.setAddress(this.address);
                    }else{
                        f = new Function(new Integer(level),(String)hashmapVar.get(id).get("return"),(Integer)hashmapVar.get(id).get("numberArguments"),(LinkedList<String>)hashmapVar.get(id).get("typeList"));

                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(f.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(f.clone());

                            //typeSpace = (Type) this.idTable.get(type).getLast();

                            //this.address = this.idTable.get((LinkedList<String>) hashmapVar.get(id).get("typeList")).getFirst()).;
                            //this.address = 0;
                            //System.out.println("Function: "+id+" Passei por aqui2. Address: "+this.address);
                            //f.setAddress(this.address);
                        } else {
                            //this.address = 0;
                            //Como sei que a funçao nao pode ser inserido, criar um "errorFuncao" na tabela so para verificar
                            LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                            l.add(f.clone());
                            this.idTable.put("error"+id, l);
                            e.addMessage((int) hashmapVar.get(id).get("line"),(int) hashmapVar.get(id).get("pos"),ErrorMessage.semantic(id,ErrorMessage.Declarations));
                        }
                    }
                }
                break;
            default:
                System.out.println("This type doesn't exist");
                break;
        }

    }




    /**
     * This method creates a String which will append all the information available from the identifier table.
     * It creates a nice looking table for a  better vision of the table.
     *
     * @return The identifier table also called symbol table in a String format.
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(String.format("%-20s%-20s%-8s%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Identifier","Category","Level","Space","Type","Address","Dimension","Limits","Elements_Type","Tree_Allocated","Nº Arguments","Type List Arguments"));
        s.append(String.format("==============================================================================================================================================================================================================================\n"));

        //Algorithm for sorting the Category table by each type : "TYPE" | "VAR"
        LinkedList<String> type = new LinkedList<String>();
        LinkedList<String> function = new LinkedList<String>();
        LinkedList<String> sortCategory = new LinkedList<String>();
        for(String id : this.idTable.keySet()) {
            if(this.idTable.get(id).getLast().getCategory().equals("TYPE")){
                //sortCategory.addFirst(id);
                type.add(id);
            }
            else if(this.idTable.get(id).getLast().getCategory().equals("FUNCTION")){//sortCategory.addLast(id);}
                function.addLast(id);
            }else{
                function.addFirst(id);
            }
        }

        //LinkedList<String> sortCategory = new LinkedList<String>();
        sortCategory.addAll(type);
        sortCategory.addAll(function);

        //Printing the table
        for(String id : sortCategory) {
            for(InfoIdentifiersTable i : this.idTable.get(id)){
                s.append(String.format("%-20s", id));
                s.append(i.toString());
            }
        }
        return s.toString();
    }
}