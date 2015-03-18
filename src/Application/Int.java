package Application;

/**
 * @author damienvaz
 */

public class Int extends Var{

    public Int(String cat, Integer level,Integer address) {
        super(cat, level, "integer", address);
    }

    public Int(Int object){
        super(object.getCategory(),object.getLevel(),object.getInfoType(),object.getAddress());
    }

    public Int clone(){
        return new Int(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append("\n");

        return s.toString();
    }
}
