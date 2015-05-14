package Application;

public class Set {
    private Data identifier;
    private Node head;

    //Pre-Condição : Cria o conjunto de universo
    public Set(){
        Data id = new Data(new String("x"));
        this.identifier = id;
        Node left = new Node(new Data("<"),new Node(new Data("x"),null,null), new Node(new Data("0"),null,null));
        Node right = new Node(new Data(">="),new Node(new Data("x"),null,null), new Node(new Data("0"),null,null));
        this.head = new Node(new Data("&&"), left,right);
    }

    //Pre-Condicao : Cria o conjunto vazio
    public Set(String identifier){
        Data id = new Data(identifier);
        this.identifier = id;
        this.head = null;
    }

    //Pre-Condicao: Cria o conjunto dado
    public Set(String identifier, Node h){
        Data id = new Data(identifier);
        this.identifier = id;
        this.head = h;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setIdentifier(String identifier){
        if(this.identifier!=null){    this.identifier.setData(identifier);};
    }

    public Data getIdentifier(){ return this.identifier; }

    public void isntASet(){this.identifier=null;}

    public String toStringSort(String type){
        StringBuilder s = new StringBuilder();
        if(this.identifier != null && this.head != null) {
            s.append(this.identifier.toString());
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
                s.append(this.identifier);
                s.append(" | ");
                s.append(" }");
            }else{
                s.append("Problem detected with the expression of the Set (not a boolean Expression).");
            }
        return s.toString();
    }
}
