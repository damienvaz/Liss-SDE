package SymbolTable;

/**
 * @author damienvaz
 */

public abstract class Var extends Info {
    public Var(Integer level, String infoType, Integer address) {
        super("VAR",level,infoType,address);
    }
}
