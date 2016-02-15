package Visual.SintaxDirectedEditor;

import javafx.scene.control.TextArea;
import org.fxmisc.richtext.CodeArea;

/**
 * Created by damienvaz on 01/02/16.
 */
public class LissProgram {
    private CodeArea textArea;

    public LissProgram(CodeArea t){
        this.textArea = t;
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

    public void debugger(String s){
        System.out.println(s);
    }

    public void consoleLog(){
        System.out.println(this.textArea.getText());
    }

}
