package Application.SymbolTable;

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
    private ArrayList<Integer> stackSP;             // It is a stack for saving all the stack pointer (=SP) !!!!
    private ArrayList<Integer> levelstackSP; //This is a structure which tells where do you find the level in the stackSP! for example levelstackSP=[0|2|3]

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

        //The stack pointer initially is 0
        this.stackSP = new ArrayList<Integer>();
        this.levelstackSP = new ArrayList<Integer>();
        this.pushSP(0);
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

    public boolean doesExist(String id){return (this.idTable.get(id) != null)? true : false;}

    public InfoIdentifiersTable getInfoIdentifiersTable(String id){return this.idTable.get(id).getLast();} //Return the last element of the linkedlist

    public LinkedList<InfoIdentifiersTable> getListInfoIdentifiersTable(String id){return this.idTable.get(id);}

    /******************************************* SP instructions***********************************************/
    public Integer getValueSP(Integer actualLevel, String variable){
        //P.-C. : Size of the stackSP + Different level +
        Integer i = 0;
        //Integer levelOfVariable = this.getInfoIdentifiersTable(variable).getLevel();
        Info v = (Var) this.getInfoIdentifiersTable(variable);
        //System.out.println("Variable: "+variable+" Address: "+v.getAddress()+" Level: "+v.getLevel());
        if(!actualLevel.equals(v.getLevel())){
            //Apply algorithms for searching the position on the stack pointer stack
            Integer sp = actualLevel;
            //if(this.stackSP.size()>=sp && sp>=0){
                //System.out.println("Variable: "+variable+" Actual Level: "+sp.toString()+" Address of Actual Level SP : "+this.stackSP.get(sp)+" Variable level: "+v.getLevel()+" Address of Variable Level SP :"+this.stackSP.get(v.getLevel())+" Address Level Variable: "+v.getAddress());
                /************************************************** PREVIOUS **************************************************/
                //i = (this.stackSP.get(sp) - this.stackSP.get(v.getLevel())) + v.getAddress();
                /**************************************************************************************************************/

                //i = (this.stackSP.get(this.stackSP.size()-1) - this.stackSP.get(v.getLevel())) + v.getAddress();
            //}

            if(this.stackSP.size()-1>=this.levelstackSP.get(sp) && sp>=0) {
                Integer getLevelOfStackSP = this.levelstackSP.get(v.getLevel());
                i = (this.stackSP.get(this.stackSP.size() - 1) - this.stackSP.get(getLevelOfStackSP)) + v.getAddress();
            }
        }else {
            /************************************************** PREVIOUS **************************************************/
            //It means that actualLevel == levelOfVariable
            //i = v.getAddress();
            /**************************************************************************************************************/

            //This is the case when specialFunctions are called and they have a state to save but the actuaLevel == levelOfVariable!
            /*if(this.stackSP.size()-1>actualLevel){
                i = (this.stackSP.get(this.stackSP.size()-1) - this.stackSP.get(v.getLevel())) + v.getAddress();
            }else{
                i = v.getAddress();
            }*/

            if (this.levelstackSP.get(actualLevel) == this.stackSP.size()-1) {
                i = v.getAddress();
            } else {
                //i = (this.stackSP.get(this.stackSP.size()-1) - this.stackSP.get(v.getLevel())) + v.getAddress();
                i = (this.stackSP.get(this.stackSP.size() - 1) - this.stackSP.get(this.levelstackSP.get(actualLevel))) + v.getAddress();
            }

        }

        System.out.println("############## STACK SP PRINT getValueSP() ##############");
        System.out.print("levelStackSP: [");
        for (Integer integer : this.levelstackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");

        System.out.print("tackSP: [");
        for (Integer integer : this.stackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");
        System.out.println("Res: "+i);
        System.out.println("#######################################################");

        return i;
    }

    public boolean dimensionOfArraysEquals(Array a1, Array a2){
        boolean res = true;

        if(!a1.getDimension().equals(a2.getDimension())){res = false;}

        return res;
    }

    public boolean limitsOfArraysEquals(Array a1, Array a2){
        boolean res = true;

        ArrayList<Integer> limitsA1 = a1.getLimits();
        ArrayList<Integer> limitsA2 = a2.getLimits();

        if(limitsA1.size()!=limitsA2.size()){
            res = false;
        }else {
            for (int i = 0; i < limitsA1.size() && res; i++) {
                if (!limitsA1.get(i).equals(limitsA2.get(i))) {
                    res = false;
                }
            }
        }

        return res;
    }

    public boolean limitsAndDimensionOfArraysEquals(Array a1, Array a2){
        boolean res = true;

        if(!dimensionOfArraysEquals(a1,a2) || !limitsOfArraysEquals(a1,a2)){res = false;}

        return res;
    }

    public Integer getSizeSP(Integer level){
        Integer res = 0;

        if(this.levelstackSP.get(level)-this.levelstackSP.get(level-1)==1){
            res = this.stackSP.get(this.levelstackSP.get(level)) - this.stackSP.get(this.levelstackSP.get(level-1));
        }else{
            Integer levelSP = this.levelstackSP.get(level);
            Integer levelDownSP = this.levelstackSP.get(level-1);

            res = this.stackSP.get(levelSP);
            for(int i = levelSP-1; i>levelDownSP; i--){
                res = this.stackSP.get(i);
            }
            res = res - this.stackSP.get(levelDownSP+1);

        }

        System.out.println("############## STACK SP PRINT getSizeSP() ##############");
        System.out.print("levelStackSP: [");
        for (Integer integer : this.levelstackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");

        System.out.print("tackSP: [");
        for (Integer integer : this.stackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");
        System.out.println("Res: "+res);
        System.out.println("#######################################################");

        return res;
        //return this.stackSP.get(level)-this.stackSP.get(level-1);

    }



    public void pushSP(Integer savedRegisters){
        if(this.stackSP.size()>0 ){
            this.stackSP.add(this.stackSP.get(this.stackSP.size()-1)+this.address+4); //This address is the amount of information stored in the stack frame, and the 4 is related to the return address
            //It adds the position where the level begins in the levelstackSP
            this.levelstackSP.add(this.stackSP.size()-1);
        }else if(this.stackSP.size() == 0){
            this.stackSP.add(savedRegisters);
            //It adds the position where the level begins in the levelstackSP
            this.levelstackSP.add(savedRegisters);
        }
        System.out.println("############## STACK SP PRINT pushSP() ##############");
        System.out.print("levelStackSP: [");
        for (Integer integer : this.levelstackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");

        System.out.print("tackSP: [");
        for (Integer integer : this.stackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");
        System.out.println("#######################################################");
    }

    public void pushStateRegistersToSP(Integer SavedRegisters){
        //if(!SavedRegisters.equals(0)) {
            if (this.stackSP.size() > 0) {
                this.stackSP.add(this.stackSP.get(this.stackSP.size() - 1) + (SavedRegisters * 4));
            } else if (this.stackSP.size() == 0) {
                this.stackSP.add(SavedRegisters * 4);
            }
        //}
        System.out.println("############## STACK SP SPECIAL FUNCTION ##############");
        for (Integer integer : this.stackSP) {
            System.out.println(integer);
        }
        System.out.println("#######################################################");
    }

    public void popSP(){
        if(this.stackSP.size()>0){
            this.stackSP.remove(this.stackSP.size()-1);

            if(this.levelstackSP.get(this.levelstackSP.size()-1)>this.stackSP.size()-1){
                this.levelstackSP.remove(this.levelstackSP.size()-1);
            }
        }
        System.out.println("############## STACK SP PRINT popSP() ##############");
        System.out.print("levelStackSP: [");
        for (Integer integer : this.levelstackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");

        System.out.print("tackSP: [");
        for (Integer integer : this.stackSP) {
            System.out.print(integer+"|");
        }
        System.out.println("]");
        System.out.println("#######################################################");
    }

    public void printSP(){
        System.out.print("[");
        if(this.stackSP.size()>0) {
            for (Integer i : this.stackSP) {
                System.out.print(i.toString());
                System.out.print(" | ");
            }
        }
        System.out.println("]");

    }
    /******************************************************************************************/

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

                            //this.address = this.address + typeSpace.getSpace();
                            setAddress(this.address + typeSpace.getSpace());
                            i.setAddress(this.address);
                        }else {
                            //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                            if (!this.idTable.get(id).getLast().getLevel().equals(i.getLevel())) {
                                LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                                l.add(i.clone());
                                //this.idTable.put(id,l);

                                //this.address = this.address + typeSpace.getSpace();
                                setAddress(this.address + typeSpace.getSpace());
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

                            //this.address = this.address + typeSpace.getSpace();
                            setAddress(this.address + typeSpace.getSpace());
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

                        //this.address = this.address + (a.getMemorySize() * typeSpace.getSpace());
                        setAddress(this.address + (a.getMemorySize() * typeSpace.getSpace()));
                        System.out.println("ID: "+id+" NEXT ADDRESS: "+getAddress()+" <- NEXT ADDRESS OF ARRAY");
                        a.setAddress(this.address);
                    }else{
                        ArrayList<Integer> arrayDimension = (ArrayList<Integer>) hashmapVar.get(id).get("dimension");
                        a = new Array(new Integer(level), new Integer(arrayDimension.size()), arrayDimension, this.address);
                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(a.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(a.clone());

                            //this.address = this.address + (a.getMemorySize() * typeSpace.getSpace());
                            setAddress(this.address + (a.getMemorySize() * typeSpace.getSpace()));
                            System.out.println("ID: "+id+" NEXT ADDRESS: "+getAddress()+" <- NEXT ADDRESS OF ARRAY");
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

                        //this.address = this.address + typeSpace.getSpace();
                        setAddress(this.address + typeSpace.getSpace());
                        s.setAddress(this.address);
                    }else{
                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(s.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(s.clone());

                            //this.address = this.address + typeSpace.getSpace();
                            setAddress(this.address + typeSpace.getSpace());
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

                        //this.address = this.address + typeSpace.getSpace();
                        setAddress(this.address + typeSpace.getSpace());
                        set.setAddress(this.address);
                    }else{
                        Application.Set s1 = (Application.Set) hashmapVar.get(id).get("set");
                        set = new Set(new Integer(level),s1);

                        //Pre-Condition : Verificar e comparar o nivel da variavel na tabela de identificador e o nivel do identificador
                        if (!this.idTable.get(id).getLast().getLevel().equals(set.getLevel())) {
                            LinkedList<InfoIdentifiersTable> l = this.idTable.get(id);
                            l.add(set.clone());

                            //this.address = this.address + typeSpace.getSpace();
                            setAddress(this.address + typeSpace.getSpace());
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
                        f = new Function(new Integer(level),(String)hashmapVar.get(id).get("return"),(Integer)hashmapVar.get(id).get("numberArguments"),(LinkedList<String>)hashmapVar.get(id).get("typeList"),(Integer)hashmapVar.get(id).get("address"));

                        LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                        l.add(f.clone());
                        this.idTable.put(id, l);

                        //this.address = 0;
                        //System.out.println("Function: "+id+" Passei por aqui1. Address: "+this.address);
                        //f.setAddress(this.address);
                    }else{
                        f = new Function(new Integer(level),(String)hashmapVar.get(id).get("return"),(Integer)hashmapVar.get(id).get("numberArguments"),(LinkedList<String>)hashmapVar.get(id).get("typeList"),(Integer)hashmapVar.get(id).get("address"));

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
                            //LinkedList<InfoIdentifiersTable> l = new LinkedList<InfoIdentifiersTable>();
                            //l.add(f.clone());
                            //this.idTable.put("error"+id, l);
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
