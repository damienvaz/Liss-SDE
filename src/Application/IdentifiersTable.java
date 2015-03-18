package Application;

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

        this.idTable.put("integer",integer);
        this.idTable.put("set",set);
        this.idTable.put("sequence",seq);
        this.idTable.put("boolean",bool);

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
