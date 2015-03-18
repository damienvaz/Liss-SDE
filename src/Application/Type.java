package Application;

/**
 * @author damienvaz
 */

public class Type extends InfoIdentifiersTable {
    private Integer space;

    /* *** Constructor *** */
    public Type( Integer level, Integer spaceType){
        super("TYPE",level);
        this.space = spaceType;
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
        s.append(String.format("%-20s\n",this.space));

        return s.toString();
    }



}
