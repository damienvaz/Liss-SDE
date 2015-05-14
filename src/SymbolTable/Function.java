package SymbolTable;

/**
 * Created by damienvaz on 5/7/15.
 */
public class Function extends InfoType {

    // meter adress e o numero argumentos
    private Integer address;
    private Integer numberArguments;

    public Function(Integer level, String infotype, Integer address, Integer numberArguments ){
        super("FUNCTION",level,infotype); this.address = address; this.numberArguments = numberArguments;
    }

    public Function(Function f){
        super(f.getCategory(),f.getLevel(),f.getInfoType()); this.address = f.getAddress(); this.numberArguments = f.getNumberArguments();
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

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(String.format("%-20s%-20s%-20s%-20s%-20s", this.address,"","","",this.numberArguments)); //Address | Dimension | Limits | Elements_Type | NumberArguments
        s.append("\n");

        return s.toString();
    }
}
