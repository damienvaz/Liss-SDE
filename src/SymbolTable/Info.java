package SymbolTable;

/**
 * Created by damienvaz on 5/6/15.
 */
public abstract class Info extends InfoIdentifiersTable{
    private String infoType;
    private Integer address;

    public Info(String category, Integer level, String infoType,Integer address){
        super(category,level);
        this.infoType = infoType;
        this.address = address;
    }

    public Info( Info i ){
        super(i.getCategory(),i.getLevel());
        this.infoType = i.getInfoType();
        this.address = i.getAddress();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(String.format("%-10s%-20s", "", this.infoType));
        if(this.address.equals(-1)){
            s.append(String.format("%-20s","NULL"));
        }else{
            s.append(String.format("%-20s",this.address));
        }


        return s.toString();
    }
}
