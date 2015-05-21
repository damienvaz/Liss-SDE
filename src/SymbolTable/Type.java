package SymbolTable;

/**
 * @author damienvaz
 */

public class Type extends InfoIdentifiersTable {
    private Integer space;

    /* *** Constructor *** */
    public Type( Integer level, String type){
        super("TYPE",level);
        switch (type) {
            case "integer":
                this.space = new Integer(1);
                break;
            case "set":
                this.space = new Integer(0);
                break;
            case "sequence":
                this.space = new Integer(1);
                break;
            case "boolean":
                this.space = new Integer(1);
                break;
            default:
                System.out.println("This type isn't recognized !");
                break;
        }
    }

    public Type(Type st){
        super(st.getCategory(),st.getLevel());
        this.space = st.getSpace();
    }

    /* *** Methods *** */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer spaceType) {
        this.space = spaceType;
    }


    public Type clone(){
        return new Type(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append(String.format("%-10s\n",this.space));

        return s.toString();
    }



}
