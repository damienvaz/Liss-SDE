package Visual.SintaxDirectedEditor;

import javafx.scene.control.TextArea;
import org.fxmisc.richtext.CodeArea;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by damienvaz on 01/02/16.
 */
public class LissProgram {
    private CodeArea textArea;
    private String jsonLiss;
    private int num;

    public LissProgram(CodeArea t){
        this.textArea = t;
        this.jsonLiss=null;
        this.num = 0;
    }
    public void setTextArea(CodeArea t){
        this.textArea = t;
    }

    public CodeArea getTextArea(){return this.textArea;}

    public void setText(String s) {
        this.textArea.clear();
        this.textArea.replaceText(s);

        String undefined = "undefined";
        Pattern word = Pattern.compile(undefined);
        Matcher match = word.matcher(s);

        while(match.find()){
            this.textArea.setStyleClass(match.start(), match.end(), "warning");
        }
    }

    public void clear(){
        this.textArea.clear();
    }

    public String getText(){return this.textArea.getText();}

    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append(this.textArea.getText());

        return s.toString();
    }

    public void setJsonLiss(String s){
        this.jsonLiss = s;
    }

    public void setStateJsonLiss(int num){//}, int tab){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void resetStateNew(){
        this.jsonLiss = null;
        this.num = 0;
    }

    public String getJSON(){
        return this.jsonLiss;
    }

    public void debugger(String s){
        System.out.println(s);
    }

    public void consoleLog(){
        System.out.println(this.textArea.getText());
    }

}
