package Application;


import java.util.TreeMap;

/**
 * Created by damienvaz on 4/7/15.
 */
public class TableError {
    //         |  line    |  pos  |  error message |
    private TreeMap<Integer,TreeMap<Integer,String>> tableError;

    public TableError(){
        this.tableError = new TreeMap<Integer, TreeMap<Integer, String>>();
    }

    public void addMessage(int line, int pos, String message){
        TreeMap<Integer,String> v = this.tableError.get(line);
        if(v == null){
            TreeMap<Integer, String> v2 = new TreeMap<Integer,String>();
            v2.put(pos,message);
            this.tableError.put(line,v2);
        }
        else{
            v.put(pos,message);
            this.tableError.put(line, v);
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("\n");
        s.append("TABLE ERROR:\n");
        for( Integer line : this.tableError.keySet()){
            TreeMap<Integer,String> v = this.tableError.get(line);
            for(Integer pos : v.keySet()){
                s.append("line: "+line);
                if(pos == -1) { // -1 significa que é um tipo assignment !
                    s.append("\t" + v.get(pos));
                    s.append("\n");
                }else{
                    s.append(":" + pos);
                    s.append("\t" + v.get(pos));
                    s.append("\n");
                }
            }
        }
        return s.toString();
    }
}
