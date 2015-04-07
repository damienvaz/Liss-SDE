package Application;

/**
 * Created by damienvaz on 3/31/15.
 */
public class Set extends Var{

    //private String expression;

    public Set(String cat, Integer level, Integer address) {
        super(cat, level, "set", address);
        //this.expression = expression;
    }

    public Set(Set object){
        super(object.getCategory(),object.getLevel(),object.getInfoType(),object.getAddress());
        //this.expression = object.getExpression();
    }

    /*public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }*/

    public Set clone(){return new Set(this);}

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(super.toString());

        return s.toString();
    }
}
