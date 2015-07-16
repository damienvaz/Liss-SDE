package Application;

/**
 * Created by damienvaz on 7/15/15.
 */
public class Node {
    private String data;
    private Node left;
    private Node right;

    public Node(String data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(String data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(Node n){
        this.data = n.getData();
        this.left = n.getLeft();
        this.right = n.getRight();
    }

    public String getData() {return data;}

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public boolean doesLeft(){
        return (this.left != null) ? true : false;
    }

    public boolean doesRight(){
        return (this.right != null) ? true : false;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node clone(){
        return new Node(this);
    }

    public String toStringSort(String type){
        StringBuilder s = new StringBuilder();

        if(type.equals("prefix")) {
            s.append(this.data.toString());
            if(this.left != null){s.append(this.left.toStringSort("prefix"));}
            if(this.right != null){s.append(this.right.toStringSort("prefix"));}
        }
        else if(type.equals("infix")){
            if(this.left != null){s.append("("+this.left.toStringSort("infix"));}
            s.append(this.data.toString()+" ");
            if(this.right != null){s.append(this.right.toStringSort("infix")+")");}
        }
        else if(type.equals("postfix")){
            if(this.left != null){s.append(this.left.toStringSort("postfix"));}
            if(this.right != null){s.append(this.right.toStringSort("postfix"));}
            s.append(this.data.toString());
        }
        return s.toString();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(this.data.toString());

        return s.toString();
    }
}
