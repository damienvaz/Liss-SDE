package Application.SymbolTable;

/**
 * Created by damienvaz on 3/31/15.
 */
public class Set extends Var {

    //private Node head; //Binary Tree
    private Application.Set set;


    public Set(Integer level, Application.Set s) {
        super(level, "set",-1);
        this.set = s;
        //this.head = head;
        //this.expression = expression;
    }

    public Set(Set object){
        super(object.getLevel(),object.getInfoType(),object.getAddress());
        this.set = object.getSet();
        //this.expression = object.getExpression();
        //this.head = object.getHead();
    }

    public Application.Set getSet() {
        return set;
    }

    public void setSet(Application.Set set) {
        this.set = set;
    }

    public Set clone(){return new Set(this);}

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        if(this.set.getIdentifier()!=null){
            s.append(String.format("%-20s%-20s%-20s%-20s","","","","[X]"));
            //s.append("[X]");
        }else{
            s.append(String.format("%-20s%-20s%-20s%-20s","","","","[ ]"));
            //s.append("[ ]");
        }
        s.append("\n");

        return s.toString();
    }
}
