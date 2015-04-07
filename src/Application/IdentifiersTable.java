package Application;

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

    private HashMap<String, InfoIdentifiersTable> idTable;
    private int address;

    /* *** Constructor *** */

    /**
     *  <p>This constructor creates the identifier table.
     *  Also it add the four primitive data in that table which are : INTEGER, SET, SEQUENCE and BOOLEAN (regarding to the Liss Language).
     *  </p>
     */
    public IdentifiersTable(){
        this.idTable = new HashMap<String, InfoIdentifiersTable>();

        Type integer = new Type(0,1);
        Type set = new Type(0,0);
        Type seq = new Type(0,1);
        Type bool = new Type(0,1);


        //Put the primitive types to the Identifier Table
        this.idTable.put("integer",integer);
        this.idTable.put("set",set);
        this.idTable.put("sequence",seq);
        this.idTable.put("boolean",bool);

        this.address = 0;

    }

    /* *** Methods *** */

    /**
     * This method gets the identifier table (also known by symbol table).
     *
     * @return A hashmap where `<b>key</b> = identifier` and <b>value</b> = `{@link InfoIdentifiersTable}`
     */
    public HashMap<String, InfoIdentifiersTable> getIdentifiersTable() {
        return this.idTable;
    }

    public int getAddress(){
        return this.address;
    }

    /**
     *
     * This method add all the information of {@link InfoIdentifiersTable} to the referred identifier.
     *
     *
     * @param identifier The name of the identifier.
     * @param infoIdTbl Information of the identifier.
     * @see InfoIdentifiersTable
     */
    public void addIdentifiersTable(String identifier, InfoIdentifiersTable infoIdTbl){
        this.idTable.put(identifier,infoIdTbl);
    }

    public void addElementsIdentifiersTables( HashMap<String, HashMap<String, Object>> hashmapVar, String type,int level){
        Type typeSpace;


        switch(type) {
            case "integer":
                Int i = new Int(new String("VAR"),new Integer(level),this.address);
                typeSpace = (Type) this.idTable.get(type);

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                        if(!this.idTable.containsKey(id)) {
                            this.idTable.put(id, i.clone());

                            this.address = this.address + typeSpace.getSpace();
                            i.setAddress(this.address);
                        }else{
                            ErrorMessage.errorSemantic(id, (int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.errorDeclarations);
                        }

                }

                break;
            case "boolean":
                Bool b = new Bool(new String("VAR"),new Integer(level),this.address);
                typeSpace = (Type) this.idTable.get(type);

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        this.idTable.put(id, b.clone());

                        this.address = this.address + typeSpace.getSpace();
                        b.setAddress(this.address);
                    }else{
                        ErrorMessage.errorSemantic(id, (int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.errorDeclarations);
                    }
                }
                break;
            case "array":
                Array a ;
                typeSpace = (Type) this.idTable.get("integer"); //porque os elementos do array sao inteiros

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        ArrayList<Integer> arrayDimension = (ArrayList<Integer>) hashmapVar.get(id).get("dimension");
                        a = new Array(new String("VAR"), new Integer(level), new Integer(arrayDimension.size()), arrayDimension, this.address);
                        this.idTable.put(id, a.clone());

                        this.address = this.address + (a.getMemorySize() * typeSpace.getSpace());
                        a.setAddress(this.address);
                    }else{
                        ErrorMessage.errorSemantic(id, (int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.errorDeclarations);
                    }
                }

                break;
            case "sequence":
                Sequence s = new Sequence(new String("VAR"),new Integer(level),this.address,"integer");
                typeSpace = (Type) this.idTable.get(type);

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {

                        this.idTable.put(id, s.clone());

                        this.address = this.address + typeSpace.getSpace();
                        s.setAddress(this.address);
                    }else{
                        ErrorMessage.errorSemantic(id, (int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.errorDeclarations);
                    }
                }
                break;
            case "set":
                Set set = new Set(new String("VAR"), new Integer(level), this.address);
                typeSpace = (Type) this.idTable.get(type);

                for(String id : hashmapVar.keySet()){
                    //Pré-Condição : Verificar se as variaveis (do HashMap) ja existem na tabela de identificadores
                    if(!this.idTable.containsKey(id)) {
                        set.setAddress(-1);
                        this.idTable.put(id, set.clone());

                        this.address = this.address + typeSpace.getSpace();

                    }else{
                        ErrorMessage.errorSemantic(id, (int) hashmapVar.get(id).get("line"), (int) hashmapVar.get(id).get("pos"), ErrorMessage.errorDeclarations);
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

        s.append(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Identifier","Category","Level","Space","Type","Address","Dimension","Limits","Elements_Type"));
        s.append(String.format("======================================================================================================================================================================================\n"));

        //Algorithm for sorting the Category table by each type : "TYPE" | "VAR"
        LinkedList<String> sortCategory = new LinkedList<String>();
        for(String id : this.idTable.keySet()) {
            if(this.idTable.get(id).getCategory().equals("TYPE")){
                sortCategory.addFirst(id);
            }
            else{sortCategory.addLast(id);}

        }

        //Printing the table
        for(String id : sortCategory) {
            s.append(String.format("%-20s",id));
            s.append(this.idTable.get(id).toString());
        }
        return s.toString();
    }
}
