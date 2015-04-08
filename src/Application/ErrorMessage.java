package Application;

/**
 * Created by damienvaz on 3/20/15.
 */
public class ErrorMessage {

    //Remover esta função derivado ao sistema novo de linguagem natural feito através desta classe
    public static final String errorDeclarations = "already exists.";
    public static final String errorStatements = "isn't declared.";
    public static final String errorArrayType = "must be an 'array'.";

    public static final String Declarations = "already exists.";
    public static final String Statements = "isn't declared.";
    public static final String ArrayType = "must be an 'array'.";


    //Remover esta função derivado ao sistema novo de linguagem natural feito através desta classe
    public static void errorSemantic(String var,int line, int pos, String message){
        System.out.println("line "+line+":"+pos+"\t Expression '"+var.toString()+"' "+message.toString());
    }

    public static String semantic(String var, String message){
        return new String("Expression '"+var.toString()+"' "+message.toString());
    }

    //Remover esta função derivado ao sistema novo de linguagem natural feito através desta classe
    public static void errorSemanticAssignment(int line){
        System.out.println("line "+line+"\t Incompatible types in an Assignment.");
    }

    //essa funçao nao é para remover, apenas é preciso ver se o argumento int line da função , é mesmo necessario ?
    public static String semanticAssignment(int line){
        return new String("Incompatible types in an Assignment.");
    }

    public static String type(String chosenType, String expectedType){
        return " has type '"+chosenType+"',when It should be '"+expectedType+"'.";
    }

    //Remover esta função derivado ao sistema novo de linguagem natural feito através desta classe
    public static String createMessageDimensionArray(Integer chosenDimension, Integer expectedDimension){
        return " has dimension '"+chosenDimension.toString()+"',when It should be equal to '"+expectedDimension.toString()+"'.";
    }

    public static String dimensionArray(Integer chosenDimension, Integer expectedDimension){
        return " has dimension '"+chosenDimension.toString()+"',when It should be equal to '"+expectedDimension.toString()+"'.";
    }


}
