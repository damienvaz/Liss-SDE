package Application;

import org.antlr.v4.runtime.*;

import java.io.IOException;

/**
 * Created by damienvaz on 26/01/16.
 */
public class MainAntlrRepresentation {
    public static void main(String[] args) {

//TODO Meter em ingles os println
        CharStream stream;
        if (args.length == 1) {
            try {
                stream = new ANTLRFileStream(args[0]);

            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler o ficheiro \"" + args[0] + "\".");
                e.printStackTrace();
                return;
            }
        } else {
            try {
                stream = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler do stdin.");
                e.printStackTrace();
                return;
            }
        }

        //System.out.println(stream.toString());

        AntlrRepresentationLexer lexer = new AntlrRepresentationLexer(stream);
        TokenStream token = new CommonTokenStream(lexer);
        AntlrRepresentationParser parser = new AntlrRepresentationParser(token);

        //create identifier table
        parser.grammarContextFree();
    }
}
