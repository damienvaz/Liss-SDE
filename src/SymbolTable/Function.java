package SymbolTable;

/**
 * Created by damienvaz on 5/7/15.
 */
public class Function extends InfoType {

    public Function(Integer level, String infotype ){
        super("FUNCTION",level,infotype);
    }

    public Function(Function f){
        super(f.getCategory(),f.getLevel(),f.getInfoType());
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());

        return s.toString();
    }
}
