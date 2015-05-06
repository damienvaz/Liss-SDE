package SymbolTable;

/**
 * Created by damienvaz on 5/6/15.
 */
public abstract class InfoType extends InfoIdentifiersTable{
    private String infoType;

    public InfoType(String category,Integer level ,String infoType){
        super(category,level);
        this.infoType = infoType;
    }

    public InfoType(InfoIdentifiersTable info, String infoType){
        super(info);
        this.infoType = infoType;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(super.toString());
        s.append(String.format("%-20s%-20s", "", this.infoType));

        return s.toString();
    }
}
