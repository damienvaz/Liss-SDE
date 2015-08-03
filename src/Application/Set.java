package Application;

import SymbolTable.Array;
import SymbolTable.IdentifiersTable;
import SymbolTable.Int;


import java.util.ArrayList;

/**
 * Created by damienvaz on 7/15/15.
 */
public class Set {
    private ArrayList<Node> identifier;
    private Node head;

    //Pre-Condição : Cria o conjunto de universo
    public Set(){
        Node id = new Node(new String("x"),null,null);
        ArrayList<Node> n = new ArrayList<Node>();
        n.add(id);
        this.identifier = n;
        Node left = new Node(new String("<"),this.identifier.get(0), new Node(new String("0"),null,null));
        Node right = new Node(new String(">="),this.identifier.get(0), new Node(new String("0"),null,null));
        this.head = new Node(new String("&&"), left,right);
    }

    //Pre-Condicao : Cria o conjunto vazio
    public Set(String identifier){
        Node id = new Node(identifier);
        ArrayList<Node> n = new ArrayList<Node>();
        n.add(id);
        this.identifier = n;
        this.head = null;
    }

    //Pre-Condicao: Cria o conjunto dado
    /*public Set(String identifier, Node h){
        Node id = new Node(identifier);
        ArrayList<Node> n = new ArrayList<Node>();
        n.add(id);
        this.identifier = n;
        this.head = h;
    }*/

    public Set(Set s1, Set s2, String operator){

        Node n = new Node(operator);
        n.setLeft(s1.getHead());
        n.setRight(s2.getHead());

        ArrayList<Node> a = new ArrayList<Node>();

        for(Node n1 : s1.getIdentifier()){
            n1.setData("x");
            n1.setLeft(null);
            n1.setRight(null);
            a.add(n1);
        }

        for(Node n2 : s2.getIdentifier()){
            n2.setData("x");
            n2.setLeft(null);
            n2.setRight(null);
            a.add(n2);
        }
        this.identifier = a;
        this.head = n;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setIdentifier(Node identifier){
        if(this.identifier!=null && this.head != null){
            for(Node n : this.identifier) {
                n.setData(identifier.getData());
                n.setLeft(identifier.getLeft());
                n.setRight(identifier.getRight());
            }
        }
    }

    public ArrayList<Node> getIdentifier(){ return this.identifier; }

    public void isntASet(){this.identifier=null;}

    public String mipsCode(IdentifiersTable id, Mips m,int line){
        String res = "" ;

        Node n = this.head;
        m.resetRegister();
        res += "\t##### Initialize Set (line "+line+")#####\n";
        res = search(res,id, m, n, line);
        res += "\t#######################################\n";
        //System.out.println(res);
        return res;
    }

    private String search(String res, IdentifiersTable id, Mips m, Node n, int line){
        //MIPS CODE
        if(n != null) {
            if (n.getData().matches("^array$")) {
                System.out.println(n.getData());

                String name = n.getLeft().getData();
                n = n.getRight();
                if(id.doesExist(name)) {
                    if (id.getInfoIdentifiersTable(name) instanceof Array) {        //A confirmar
                        Array a = (Array) id.getInfoIdentifiersTable(name);
                        Integer dimension = a.getDimension();
                        ArrayList<Integer> limits = a.getLimits();
                        int i = 0;
                        if(n != null){
                            while (n != null) {
                                res = search(res, id, m, n.getLeft(), line);
                                if(i<(dimension-1)) {
                                    int r = 1; //need to calculate the position of the array
                                    for (int j = i + 1; j < dimension; j++) {
                                        r = r * limits.get(j);
                                    }
                                    String s = m.loadImmediateWord(String.valueOf(r),line,0);
                                    String s1 = m.textMul(line,0);
                                    res = res + s + s1;
                                }
                                if(i>0 && i<dimension){
                                    String s = m.textAdd(line,0);
                                    res = res + s;
                                }
                                n = n.getRight();
                                i++;
                            }
                        }
                        String s = m.loadImmediateWord("4",line,0);
                        String s1 = m.textMul(line,0);
                        String s2 = m.loadWordArray(name,line,0);
                        res = res + s + s1 + s2;
                    }
                }
            } else if(n.getData().matches("^[0-9]+$")){
                System.out.println(n.getData());
                String s = m.loadImmediateWord(n.getData(), line, 0);
                System.out.println(s);
                res = res + s;
            } else if(n.getData().matches("^[A-Za-z0-9]+$")) {
                if(id.doesExist(n.getData())){
                   if(id.getInfoIdentifiersTable(n.getData()) instanceof Int){
                       String s = m.loadWord(n.getData(), line, 0);
                       System.out.println(s);
                       res = res + s;
                   }
                }
            }else{
                if (n.doesLeft()) { res = search(res, id, m, n.getLeft(), line); }
                if (n.doesRight()) { res = search(res, id, m, n.getRight(), line); }

                System.out.println(n.getData()+" WOOT");
                if (n.getData().matches("^[+]$")) {
                    String s = m.textAdd(line, 0);
                    System.out.println(s);
                    res = res + s;
                } else if (n.getData().matches("^[-]$")) {
                    String s = m.textSub(line, 0);
                    System.out.println(s);
                    res = res + s;                } else if (n.getData().matches("^[*]$")) {
                    String s = m.textMul(line, 0);
                    System.out.println(s);
                    res = res + s;
                } else if (n.getData().matches("^[/]$")) {
                    String s = m.textDiv(line, 0);
                    System.out.println(s);
                    res = res + s;
                } else if(n.getData().matches("^[<]$")){
                    String s = m.textSetOnLessThan(line,0);
                    System.out.println(s);
                    res = res + s;
                } else if (n.getData().matches("^[>]$")){
                    String s = m.textSetOnGreatThan(line, 0);
                    System.out.println(s);
                    res = res + s;
                } else if (n.getData().matches("^([+][+])|([|][|])$")){
                    String s = m.textOr(line, 0);
                    System.out.println(s);
                    res = res + s;
                } else if (n.getData().matches("^([*][*])|([&][&])$")){
                    String s = m.textAnd(line,0);
                    System.out.println(s);
                    res = res + s;
                } else if(n.getData().matches("^[!][=]$")){
                    // != -> (< || >)
                    /*String s = m.textSetOnLessThan(line,0);
                    System.out.println(s);
                    String s1 = m.textSetOnGreatThan(line,0);
                    System.out.println(s1);
                    String s2 = m.textOr(line,0);
                    System.out.println(s2);*/
                    String s = m.textDifferent(line,0);
                    res = res + s ;
                } else if (n.getData().matches("^[<][=]$")){
                    // <= -> !>
                    String s = m.textSetOnGreatThan(line,0);
                    System.out.println(s);
                    String s1 = m.textNot(line,0);
                    System.out.println(s1);
                    res = res + s + s1;
                } else if(n.getData().matches("^[>][=]$")){
                    //>= -> !<
                    String s = m.textSetOnLessThan(line,0);
                    String s1 = m.textNot(line, 0);
                    System.out.println(s);
                    System.out.println(s1);
                    res = res + s +s1;
                } else if(n.getData().matches("^[=][=]$")){
                    // == -> (!<) && (!>)
                    /*String s = m.textSetOnLessThan(line, 0);
                    s = s + m.textNot(line,0);
                    System.out.println(s);
                    String s1 = m.textSetOnGreatThan(line,0);
                    s1 = s1 + m.textNot(line,0);
                    System.out.println(s1);
                    String s2 = m.textAnd(line,0);
                    System.out.println(s2);*/
                    String s = m.textEquals(line,0);
                    res = res + s;
                }
            }
        }else{
            //Means that the set is empty
            String s = m.loadImmediateWord("0",line,0);
            res = res + s;
        }

        return res;
    }


    public String toStringSort(String type){
        StringBuilder s = new StringBuilder();
        if(this.identifier != null && this.head != null) {
            s.append(this.identifier.get(0).toStringSort(type));
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
            s.append(this.identifier.get(0).toStringSort("infix"));
            s.append(" | ");
            s.append(" }");
        }else{
            s.append("Problem detected with the expression of the main.Set (not a boolean Expression).");
        }
        return s.toString();
    }
}
