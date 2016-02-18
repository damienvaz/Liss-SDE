package Visual.SintaxDirectedEditor;

import javafx.scene.control.TextArea;
import org.fxmisc.richtext.CodeArea;

/**
 * Created by damienvaz on 01/02/16.
 */
public class LissProgram {
    private CodeArea textArea;
    private String jsonLiss;

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

    public void setJsonLiss(String s){
        this.jsonLiss = s;
    }

    public String getJSON(){
        return this.jsonLiss;
        //return "[{\"id\":\"liss\",\"text\":\"liss\",\"icon\":true,\"li_attr\":{\"id\":\"liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"#\"},{\"id\":\"program_liss\",\"text\":\"program\",\"icon\":true,\"li_attr\":{\"id\":\"program_liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"program \",\"id\":\"program_liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"liss\"},{\"id\":\"identifier_liss\",\"text\":\"cr5f67\",\"icon\":true,\"li_attr\":{\"id\":\"identifier_liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal edit correct\",\"program\":\"\",\"expressionregularrule\":\"ID\",\"id\":\"identifier_liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":true,\"disabled\":false},\"data\":{},\"parent\":\"liss\"},{\"id\":\"body\",\"text\":\"body\",\"icon\":true,\"li_attr\":{\"id\":\"body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"body_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"liss\"}]";
        //return "[{\"id\":\"liss\",\"text\":\"liss\",\"icon\":true,\"li_attr\":{\"id\":\"liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"#\"},{\"id\":\"program_liss\",\"text\":\"program\",\"icon\":true,\"li_attr\":{\"id\":\"program_liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"program \",\"id\":\"program_liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"liss\"},{\"id\":\"identifier_liss\",\"text\":\"d234\",\"icon\":true,\"li_attr\":{\"id\":\"identifier_liss\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal edit correct\",\"program\":\"\",\"expressionregularrule\":\"ID\",\"id\":\"identifier_liss_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"liss\"},{\"id\":\"body\",\"text\":\"body\",\"icon\":true,\"li_attr\":{\"id\":\"body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"body_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"liss\"},{\"id\":\"parenthesis_open_body\",\"text\":\"{\",\"icon\":true,\"li_attr\":{\"id\":\"parenthesis_open_body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"{\\n\",\"id\":\"parenthesis_open_body_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"body\"},{\"id\":\"declarations_body\",\"text\":\"declarations\",\"icon\":true,\"li_attr\":{\"id\":\"declarations_body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"    declarations\\n\",\"id\":\"declarations_body_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"body\"},{\"id\":\"declarations\",\"text\":\"declarations\",\"icon\":true,\"li_attr\":{\"id\":\"declarations\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"declarations_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"body\"},{\"id\":\"declaration\",\"text\":\"declaration*\",\"icon\":true,\"li_attr\":{\"id\":\"declaration\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"declaration_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"declarations\"},{\"id\":\"variable_declaration2\",\"text\":\"variable_declaration\",\"icon\":true,\"li_attr\":{\"id\":\"variable_declaration2\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"variable_declaration2_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"declaration\"},{\"id\":\"int3\",\"text\":\"12456689\",\"icon\":true,\"li_attr\":{\"id\":\"int3\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal edit correct\",\"program\":\"        \",\"expressionregularrule\":\"NBR\",\"id\":\"int3_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":true,\"disabled\":false},\"data\":{},\"parent\":\"variable_declaration2\"},{\"id\":\"variable_declaration0\",\"text\":\"variable_declaration\",\"icon\":true,\"li_attr\":{\"id\":\"variable_declaration0\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"variable_declaration0_anchor\"},\"state\":{\"loaded\":true,\"opened\":true,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"declaration\"},{\"id\":\"int1\",\"text\":\"1234\",\"icon\":true,\"li_attr\":{\"id\":\"int1\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal edit correct\",\"program\":\"        \",\"expressionregularrule\":\"NBR\",\"id\":\"int1_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"variable_declaration0\"},{\"id\":\"statements_body\",\"text\":\"statements\",\"icon\":true,\"li_attr\":{\"id\":\"statements_body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"    statements \\n\",\"id\":\"statements_body_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"body\"},{\"id\":\"statements\",\"text\":\"statements\",\"icon\":true,\"li_attr\":{\"id\":\"statements\"},\"a_attr\":{\"href\":\"#\",\"class\":\"non-terminal\",\"id\":\"statements_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":false},\"data\":{},\"parent\":\"body\"},{\"id\":\"parenthesis_close_body\",\"text\":\"}\",\"icon\":true,\"li_attr\":{\"id\":\"parenthesis_close_body\"},\"a_attr\":{\"href\":\"#\",\"class\":\"terminal\",\"program\":\"}\",\"id\":\"parenthesis_close_body_anchor\"},\"state\":{\"loaded\":true,\"opened\":false,\"selected\":false,\"disabled\":true},\"data\":{},\"parent\":\"body\"}]";
    }

    public void debugger(String s){
        System.out.println(s);
    }

    public void consoleLog(){
        System.out.println(this.textArea.getText());
    }

}
