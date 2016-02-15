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
        parser.liss(idT);


        //persons.stream().var
        //persons.stream().filter(person->{person.getName().length()>15}).collect(Collectors.toList());
        //.forEach(x-> System.out.println(x)) <=> .forEach(System.out::println);




        //Type st = new Type(new Integer(0),new Integer(1));
        /*System.out.println("Category: "+st.getCategory()+"\t");
        System.out.println("Level: "+st.getLevel()+"\t");
        System.out.println("Space: "+st.getSpace()+"\t");*/

        //Type st1 = st.clone();


        //System.out.println(st.toString()+"|"+st1.toString());

        //idT.addIdentifiersTable(new String("INTEGER"),st);


        //System.out.println(idT.toString());

        //ArrayList<Integer> array = new ArrayList<Integer>();
        //array.add(new Integer(4));
        //array.add(new Integer(2));

        //Array aL = new Array(new String("VAR"),new Integer("0"),new Integer(2),array);
        //idT.addIdentifiersTable(new String("array1"),aL);



        System.out.println(idT.toString());

        //Int i = new Int("VAR",0,0);
        //i.setAddress();



        /*InfoIdentifiersTable i = new InfoIdentifiersTable("var2",new Integer(0));

        System.out.println(i.toString());

        idT.addIdentifiersTable(new String("INTEGER"),st);

        System.out.println(idT.toString());*/

        long total_memory = Runtime.getRuntime().totalMemory();    // Total available now (bytes)
        long free_memory = Runtime.getRuntime().freeMemory();      // Free memory now   (bytes)
        long max_memory = Runtime.getRuntime().maxMemory();        //  (bytes)
        long mb= (2^20);

        System.out.println("TOTAL_MEMORY: "+total_memory +" B");
        System.out.println("FREE_MEMORY: "+(free_memory)+" B");
        System.out.println("MAX_MEMORY: "+(max_memory)+" B\n");

        System.out.println("TOTAL_MEMORY: "+total_memory/mb +" MB");
        System.out.println("FREE_MEMORY: "+(free_memory/mb)+" MB");
        System.out.println("MAX_MEMORY: "+(max_memory/mb)+" MB");

    }
}
