package Application;

import com.apple.eawt.Application;

/**
 * Created by damienvaz on 4/28/15.
 */
public class BinaryTree {
    private Data identifier;
    private Node head;

    public BinaryTree(String identifier){
        Data id = new Data(identifier);
        this.identifier = id;
        this.head = null;
    }

    public void add(String data){
        if(head == null){
            if(this.identifier.getData().equals(data)){
                this.head = new Node(this.identifier);
            }else {
                Node head = new Node(new Data(data), null, null);
                this.head = head;
            }
        }else if(this.head != null && !this.head.doesLeft() && !this.head.doesRight()  ){
            if(!data.equals(this.identifier.getData())) {
                Node head = new Node(new Data(data), this.head, null);
                this.head = head;
            }else{
                Node head = new Node(this.identifier,this.head,null);
                this.head = head;
            }
        }else if( this.head != null && this.head.doesLeft() && !this.head.doesRight()){
            if(!data.equals(this.identifier.getData())) {
                Node head = new Node(new Data(data));
                this.head.setRight(head);
            }else{
                Node head = new Node(this.identifier);
                this.head.setRight(head);
            }
        }else if(this.head != null && this.head.doesLeft() && this.head.doesRight()){
            if(!data.equals(this.identifier.getData())) {
                Node head = new Node(new Data(data),this.head,null);
                this.head = head;
            }else{
                Node head = new Node(this.identifier, this.head, null);
                this.head = head;
            }
        }
    }

    public void setIdentifier(String identifier){
        this.identifier.setData(identifier);
    }

    public Data getIdentifier(){return this.identifier;}

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
        return s.toString();
    }
}
