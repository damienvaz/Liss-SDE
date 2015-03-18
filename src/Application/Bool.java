package Application;

/**
 * @author damienvaz
 */

public class Bool extends Var{

    public Bool(String cat, Integer level, Integer address) {
        super(cat, level, "boolean",address);
    }

    public Bool(Bool object){
        super(object.getCategory(),object.getLevel(),object.getInfoType(), object.getAddress());
    }

    public Bool clone(){
        return new Bool(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append("\n");

        return s.toString();
    }
}
