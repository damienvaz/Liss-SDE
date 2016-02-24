package Visual.SintaxDirectedEditor;

import javafx.scene.control.TextArea;
import org.fxmisc.richtext.CodeArea;

/**
 * Created by damienvaz on 01/02/16.
 */
public class LissProgram {
    private CodeArea textArea;
    private String jsonLiss;
    private int num;
    private int tab;

    public LissProgram(CodeArea t){
        this.textArea = t;
        this.jsonLiss=null;
        this.num = 0;
        this.tab = 0;
    }
    public void setTextArea(CodeArea t){
        this.textArea = t;
    }

    public CodeArea getTextArea(){return this.textArea;}

    public void setText(String s){
        this.textArea.replaceText("");
        this.textArea.replaceText(s);
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

    public void setStateJsonLiss(int num, int tab){
        this.num = num;
        this.tab = tab;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public void resetStateNew(){
        this.jsonLiss = null;
        this.tab = 0;
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
