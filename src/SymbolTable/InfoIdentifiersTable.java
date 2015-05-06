package SymbolTable;

//TODO verificar se o javadoc está certo
//TODO adicionar no javadoc da class, os restantes class (set,sequence, ....)

/**
 *
 * <p>
 * InfoIdentifiersTable is an abstract class where explains the category and level of that identifier.
 * It is used and created for hierarchy purpose. See child: {@link Type}, {@link Array}, {@link Bool}, {@link Int}.
 * </p>
 * <p>
 * The category defines if it is a <b>VAR</b> or a <b>TYPE</b> identifier.
 * The level data defines the level scope of that identifier.
 * </p>
 *
 * @author damienvaz
 */
public abstract class InfoIdentifiersTable {

    private String category;
    private Integer level;

    /* *** Constructor *** */

    /**
     * This constructor creates the object with category and level set up.
     * @param cat Related to the category of the identifier.
     * @param level Related to the category of the level.
     */
    public InfoIdentifiersTable(String cat,Integer level) {
        this.category = cat;
        this.level = level;
    }

    /**
     * This constructor creates an InfoIdentifiersTable object by cloning the object passed as argument.
     * @param object An InfoIdentifiersTable object.
     */
    public InfoIdentifiersTable(InfoIdentifiersTable object){
        this.category = object.getCategory();
        this.level = object.getLevel();
    }

    /* *** Methods *** */

    /**
     * This method returns the value of that category identifier.
     * @return The category of that identifier.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     *  This method returns the level scope of that identifier.
     * @return The level scope of that identifier.
     */
    public Integer getLevel(){
        return this.level;
    }

    /**
     * This method sets the category of that identifier.
     * @param category The category of the identifier
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method sets the level of that identifier.
     * @param level The level of that identifier
     */
    public void setLevel(Integer level){
        this.level = level;
    }

    /*public InfoIdentifiersTable clone(){
        return new InfoIdentifiersTable(this);
    }*/

    /**
     * This method creates the string for representing the data of the identifier table. In this case, it add , only, the category and level information.
     * @return The category and level data in a String format.
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(String.format("%-20s%-20s",this.category,this.level.toString()));
        //s.append("Category: "+this.category+"\t");
        //s.append("Level: "+this.level.toString()+"\t");

        return s.toString();
    }
}
