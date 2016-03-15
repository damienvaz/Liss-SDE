package Application;

/**
 * @author damienvaz
 */

import SymbolTable.IdentifiersTable;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.lang.String;
import java.io.IOException;


public class Main {
    private TableError tableError;
    private Mips mips;
    private IdentifiersTable idt;

    public Main(){
        this.idt = new IdentifiersTable();
        this.tableError = new TableError();
        this.mips = new Mips();
    }

    public IdentifiersTable getIdth() {
        return idt;
    }

    public TableError getTableError() {
        return tableError;
    }

    public Mips getMips() {
        return mips;
    }

    public void compile(String[] args){
        //TODO Meter em ingles os println
        CharStream stream;
        if(args.length == 1){
            try {
                stream = new ANTLRFileStream(args[0]);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler o ficheiro \"" + args[0] + "\".");
                e.printStackTrace();
                return;
            }
        } else{
            try {
                stream = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler do stdin.");
                e.printStackTrace();
                return;
            }
        }

        System.out.println(stream.toString());

        LissLexer lexer = new LissLexer(stream);
        TokenStream token = new CommonTokenStream(lexer);
        LissParser parser = new LissParser(token);
        parser.liss(this.idt,this.tableError,this.mips);
    }

    public static void main(String[] args) {

        //TODO Meter em ingles os println
        CharStream stream;
        if(args.length == 1){
            try {
                stream = new ANTLRFileStream(args[0]);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler o ficheiro \"" + args[0] + "\".");
                e.printStackTrace();
                return;
            }
        } else{
            try {
                stream = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler do stdin.");
                e.printStackTrace();
                return;
            }
        }

        System.out.println(stream.toString());

        LissLexer lexer = new LissLexer(stream);
        TokenStream token = new CommonTokenStream(lexer);
        LissParser parser = new LissParser(token);

        //create identifier table
        IdentifiersTable idT = new IdentifiersTable();
        TableError e = new TableError();
        Mips m = new Mips();
        parser.liss(idT, e, m);

        System.out.println(idT.toString());

        /*long total_memory = Runtime.getRuntime().totalMemory();    // Total available now (bytes)
        long free_memory = Runtime.getRuntime().freeMemory();      // Free memory now   (bytes)
        long max_memory = Runtime.getRuntime().maxMemory();        //  (bytes)
        long mb= (2^20);

        System.out.println("TOTAL_MEMORY: "+total_memory +" B");
        System.out.println("FREE_MEMORY: "+(free_memory)+" B");
        System.out.println("MAX_MEMORY: "+(max_memory)+" B\n");

        System.out.println("TOTAL_MEMORY: "+total_memory/mb +" MB");
        System.out.println("FREE_MEMORY: "+(free_memory/mb)+" MB");
        System.out.println("MAX_MEMORY: "+(max_memory/mb)+" MB");*/

    }
}
