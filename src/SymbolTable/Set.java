package SymbolTable;

/**
 * Created by damienvaz on 3/31/15.
 */
public class Set extends Var {

    //private Node head; //Binary Tree

    public Set(Integer level/*, Node head*/) {
        super(level, "set",-1);
        //this.head = head;
        //this.expression = expression;
    }

    public Set(Set object){
        super(object.getLevel(),object.getInfoType(),object.getAddress());
        //this.expression = object.getExpression();
        //this.head = object.getHead();
    }

    /*public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }*/

    public Set clone(){return new Set(this);}

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());
        s.append("\n");

        return s.toString();
    }
}
