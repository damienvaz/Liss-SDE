package Application;

/**
 * Created by damienvaz on 3/20/15.
 */
public class Debug {
    public static final String errorDeclarations = "already exists.";
    public static final String errorStatements = "isn't declared.";
    //public static final String errorIndexType = "has a wrong type (It should be 'integer').";
    public static final String errorArrayType = "must be an 'array'.";


    public static void errorSemantic(String var,int line, int pos, String message){
        System.out.println("line "+line+":"+pos+"\t Variable '"+var.toString()+"' "+message.toString());
    }

    public static String createMessageType(String chosenType, String expectedType){
        return " has type '"+chosenType+"',when It should be '"+expectedType+"'.";
    }


}
