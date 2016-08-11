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
    public static final String LimitsArray = "has a problem with his limits.";

    public static String semantic(String var, String message){
        return new String("Expression '"+var.toString()+"' "+message.toString());
    }

    public static String semanticSubProgram(String var, String message){
        return new String("Function '"+var.toString()+"' "+message.toString());
    }

    public static String semanticVariableMissing(String var){
        return new String("Variable '"+var+"' isn't declared.");
    }

    //essa funçao nao é para remover, apenas é preciso ver se o argumento int line da função , é mesmo necessario ?
    public static String semanticAssignment(int line){
        return new String("Incompatible types in an Assignment.");
    }

    public static String type(String chosenType, String expectedType){
        return " has type '"+chosenType+"',when It should be '"+expectedType+"'.";
    }

    public static String returnType(String chosenType, String expectedType){
        return " has return type '"+chosenType+"',when It should be '"+expectedType+"'.";
    }

    public static String returnTypePossible(){
        return " return type must be 'integer' || 'boolean'.";
    }

    public static String warningRecursivityFunction(){
        return "has an infinite cycle.";
    }

    public static String typeExpression(String leftChosenType,String operator, String rightChosenType, String leftExpectedType, String rightExpectedType){
        return " has type '"+leftChosenType+" "+operator+" "+rightChosenType+"',required type '"+leftExpectedType+" "+operator+" "+rightExpectedType+"'.";
    }

    public static String dimensionArray(Integer chosenDimension, Integer expectedDimension){
        return " has dimension '"+chosenDimension.toString()+"',when It should be equal to '"+expectedDimension.toString()+"'.";
    }

    public static String forEachStep(){
        return " stepUp or stepDown expression, not valid with \"inArray\" operation.";
    }

    public static String forEachSatisfying(){
        return " satisfying expression, not valid with \"inArray\" operation.\"";
    }

    public static String functionDoesntExist(){
        return " does not exist.";
    }

    public static String limitsAndDimensionsNotEqualForBothArrays(){
        return " doesn't have the same limits or dimensions.";
    }

}
