package SymbolTable;

import java.util.LinkedList;

/**
 * Created by damienvaz on 5/7/15.
 */
public class Function extends InfoType {
    private Integer address;
    private Integer numberArguments;
    private LinkedList<String> type;

    public Function(Integer level, String infotype, Integer numberArguments, LinkedList<String> type){
        super("FUNCTION",level,infotype); this.address = 0; this.numberArguments = numberArguments; this.type = type;
    }

    public Function(Function f){
        super(f.getCategory(),f.getLevel(),f.getInfoType()); this.address = f.getAddress(); this.numberArguments = f.getNumberArguments(); this.type = f.getType();
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getNumberArguments() {
        return numberArguments;
    }

    public void setNumberArguments(Integer numberArguments) {
        this.numberArguments = numberArguments;
    }

    public LinkedList<String> getType() {
        return type;
    }

    public void setType(LinkedList<String> type) {
        this.type = type;
    }

    public Function clone(){return new Function(this);}

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", this.address,"","","","",this.numberArguments,this.type.toString())); //Address | Dimension | Limits | Elements_Type | NumberArgument
        s.append("\n");

        return s.toString();
    }
}
