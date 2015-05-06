package SymbolTable;

/**
 * @author damienvaz
 */

public abstract class Var extends InfoType {

    private String infoType;
    private Integer address;

    public Var(Integer level, String infoType, Integer address) {
        super("VAR",level,infoType);
        this.infoType = infoType;
        this.address = address;
    }

    /*public Var(InfoIdentifiersTable object, String infoType, Integer address) {
        super(object,infoType);
        this.infoType = infoType;
        this.address = address;
    }*/

    public String getInfoType() {
        return this.infoType;
    }

    public Integer getAddress(){ return this.address;}

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public void setAddress(Integer address){ this.address = address;}


    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());

        /*if(this.address.equals(-1)){
            s.append(String.format("%-20s%-20s%-20s", "", this.infoType, "NULL"));
        }else {
            s.append(String.format("%-20s%-20s%-20s", "", this.infoType, this.address));
        }*/
        if(this.address.equals(-1)){
            s.append(String.format("%-20s","NULL"));
        }else{
            s.append(String.format("%-20s",this.address));
        }

        //s.append("Type: "+this.infoType+"\t");

        return s.toString();
    }
}
