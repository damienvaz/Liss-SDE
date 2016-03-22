package Application.SymbolTable;

/**
 * Created by damienvaz on 3/18/15.
 */
public class Sequence extends Var {
    private String typeElements;

    public Sequence(Integer level, Integer address, String typeElements) {
        super(level,"sequence", address);
        this.typeElements = typeElements;
    }

    /*public Sequence(InfoIdentifiersTable object, Integer address, String typeElements) {
        super(object,"sequence", address);
        this.typeElements = typeElements;
    }*/

    public Sequence(Sequence object){
        super(object.getLevel(), object.getInfoType(), object.getAddress());
        this.typeElements = object.getTypeElements();
    }

    public String getTypeElements() {
        return typeElements;
    }

    public void setTypeElements(String typeElements) {
        this.typeElements = typeElements;
    }

    public Sequence clone(){
        return new Sequence(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append(String.format("%-20s%-20s","",""));
        s.append(String.format("%-20s",this.typeElements));
        s.append("\n");

        return s.toString();
    }


}
