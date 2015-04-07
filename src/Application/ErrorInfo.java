package Application;

/**
 * Created by damienvaz on 4/7/15.
 */
public class ErrorInfo {
    private String identifier;
    private int line;
    private int pos;

    public ErrorInfo(String identifier, int line, int pos){
        this.identifier = identifier;
        this.line = line;
        this.pos = pos;
    }

    public ErrorInfo(ErrorInfo e){
        this.identifier = e.getIdentifier();
        this.line = e.getLine();
        this.pos = e.getPos();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public ErrorInfo clone(){
        return new ErrorInfo(this);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Identifier: "+this.identifier);
        s.append(" line: "+this.line);
        s.append(" pos: "+this.pos);
        s.append("\n");

        return s.toString();
    }
}
