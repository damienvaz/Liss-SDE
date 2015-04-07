package Application;

/**
 * Created by damienvaz on 3/20/15.
 */
public class ErrorMessage {
    public static final String errorDeclarations = "already exists.";
    public static final String errorStatements = "isn't declared.";
    public static final String errorArrayType = "must be an 'array'.";


    public static void errorSemantic(String var,int line, int pos, String message){
        System.out.println("line "+line+":"+pos+"\t Expression '"+var.toString()+"' "+message.toString());
    }

    public static String semantic(String var, String message){
        return new String("Expression '"+var.toString()+"' "+message.toString());
    }

    public static void errorSemanticAssignment(int line){
        System.out.println("line "+line+"\t Incompatible types in an Assignment.");
    }

    public static String type(String chosenType, String expectedType){
        return " has type '"+chosenType+"',when It should be '"+expectedType+"'.";
    }

    public static String createMessageDimensionArray(Integer chosenDimension, Integer expectedDimension){
        return " has dimension '"+chosenDimension.toString()+"',when It should be equal to '"+expectedDimension.toString()+"'.";
    }


}
