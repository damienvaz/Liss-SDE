package Application;

/**
 * Created by damienvaz on 4/30/15.
 */
public class Data {
    private String data;

    public Data(String data){ this.data = data;}

    public Data(Data d){d.getData();}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Data clone(){return new Data(this);}

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(this.data);
        return s.toString();
    }

}
