package Application;

import java.util.ArrayList;

/**
 * @author damienvaz
 */

public class Array extends Var {
    private Integer dimension;
    private ArrayList<Integer> limits;

    public Array(String cat, Integer level, Integer dimension, ArrayList<Integer> limits, Integer address) {
        super(cat, level,"array",address);
        this.dimension = dimension;
        this.limits = limits;
    }

    public Array(Array object){
        super(object.getCategory(),object.getLevel(),object.getInfoType(),object.getAddress());
        this.dimension = object.getDimension();
        this.limits = object.getLimits();
    }


    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public ArrayList<Integer> getLimits() {
        return limits;
    }

    public void setLimits(ArrayList<Integer> limits) {
        this.limits = limits;
    }

    public Integer getMemorySize(){
        Integer size=1;
        for(Integer i : this.limits){
            size = size*i;
        }
        return size;
    }

    public Array clone(){
        return new Array(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        int i=0,sizeA;

        s.append(super.toString());
        s.append(String.format("%-20s",this.dimension));

        s.append("[");
        sizeA = this.limits.size();
        for(Integer element : this.limits){
            if(i<(sizeA-1)) { s.append(element+"|"); }
            else {s.append(element);}
            i++;
        }
        s.append("]");
        s.append("\n");

        return s.toString();
    }
}
