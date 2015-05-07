package SymbolTable;

/**
 * @author damienvaz
 */

public class Int extends Var {

    public Int(Integer level,Integer address) {
        super(level, "integer", address);
    }

    public Int(Int object){
        super(object.getLevel(),object.getInfoType(),object.getAddress());
    }

    public Int clone(){
        return new Int(this);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append("\n");

        return s.toString();
    }
}
