package Application;


import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by damienvaz on 4/7/15.
 */
public class ErrorTable {
    //         |  line    |  pos  |  error message |
    //private TreeMap<Integer,TreeMap<Integer,String>> errorTable;
    private TreeMap<Integer,TreeMap<Integer,ArrayList<String>>> errorTable;

    public ErrorTable(){
        this.errorTable = new TreeMap<Integer, TreeMap<Integer, ArrayList<String>>>();
    }

    public void addMessage(int line, int pos, String message){
        TreeMap<Integer,ArrayList<String>> v = this.errorTable.get(line);
        if(v == null){
            ArrayList<String> messages = new ArrayList<String>();
            messages.add(message);
            TreeMap<Integer, ArrayList<String>> v2 = new TreeMap<Integer,ArrayList<String>>();
            v2.put(pos,messages);
            this.errorTable.put(line,v2);
        }
        else{
            ArrayList<String> messages = v.get(pos);
            if(messages == null){
                messages = new ArrayList<String>();
            }
            messages.add(message);
            v.put(pos, messages);
            this.errorTable.put(line, v);
        }
    }

    public boolean isNull(){
        return this.errorTable.isEmpty();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("\n");
        s.append("TABLE ERROR:\n");
        for( Integer line : this.errorTable.keySet()){
            TreeMap<Integer,ArrayList<String>> v = this.errorTable.get(line);
            for(Integer pos : v.keySet()){
                ArrayList<String> messages = v.get(pos) ;
                for(String message : messages) {
                    s.append("line: " + line);
                    if (pos == -1) { // -1 significa que é um tipo assignment !
                        //s.append("\t" + v.get(pos));
                        s.append("\t"+ message);
                        s.append("\n");
                    } else {
                        s.append(":" + pos);
                        //s.append("\t" + v.get(pos));
                        s.append("\t" + message);
                        s.append("\n");
                    }
                }
            }
        }
        return s.toString();
    }

    public String toStringSDE(){
        StringBuilder s = new StringBuilder();
        LocalTime hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);

        if(this.errorTable.keySet().size()>0) {
            s.append("[" + hour + "] Semantics errors found:\n");
            for (Integer line : this.errorTable.keySet()) {
                TreeMap<Integer, ArrayList<String>> v = this.errorTable.get(line);
                for (Integer pos : v.keySet()) {
                    ArrayList<String> messages = v.get(pos);
                    for (String message : messages) {
                        s.append("[" + hour + "] ");
                        s.append("line: " + line);
                        if (pos == -1) { // -1 significa que é um tipo assignment !
                            //s.append("\t" + v.get(pos));
                            s.append("  " + message);
                            s.append("\n");
                        } else {
                            s.append(":" + pos);
                            //s.append("\t" + v.get(pos));
                            s.append("  " + message);
                            s.append("\n");
                        }
                    }
                }
            }
        }
        return s.toString();
    }
}
