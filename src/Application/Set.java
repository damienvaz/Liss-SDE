package Application;

/**
 * Created by damienvaz on 7/15/15.
 */
public class Set {
    private Node identifier; //vl
    private Node head;

    //Pre-Condição : Cria o conjunto de universo
    public Set(){
        Node id = new Node(new String("x"),null,null);
        this.identifier = id;
        Node left = new Node(new String("<"),this.identifier, new Node(new String("0"),null,null));
        Node right = new Node(new String(">="),this.identifier, new Node(new String("0"),null,null));
        this.head = new Node(new String("&&"), left,right);
    }

    //Pre-Condicao : Cria o conjunto vazio
    public Set(String identifier){
        Node id = new Node(identifier);
        this.identifier = id;
        this.head = null;
    }

    //Pre-Condicao: Cria o conjunto dado
    public Set(String identifier, Node h){
        Node id = new Node(identifier);
        this.identifier = id;
        this.head = h;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setIdentifier(Node identifier){
        if(this.identifier!=null){
            //this.identifier = identifier;
            this.identifier.setData(identifier.getData());
            this.identifier.setLeft(identifier.getLeft());
            this.identifier.setRight(identifier.getRight());
        }
    }

    public Node getIdentifier(){ return this.identifier; }

    public void isntASet(){this.identifier=null;}

    public String toStringSort(String type){
        StringBuilder s = new StringBuilder();
        if(this.identifier != null && this.head != null) {
            s.append(this.identifier.toStringSort(type));
            s.append(" | ");
            s.append(this.head.toStringSort(type));
        }
        return s.toString();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        if(this.identifier != null && this.head != null) {
            s.append(this.toStringSort("infix"));
        }
        else if(this.identifier!=null && this.head==null) {
            s.append("{");
            s.append(this.identifier.toStringSort("infix"));
            s.append(" | ");
            s.append(" }");
        }else{
            s.append("Problem detected with the expression of the main.Set (not a boolean Expression).");
        }
        return s.toString();
    }
}
