package Application;

import Application.SymbolTable.InfoIdentifiersTable;

import java.util.HashMap;

public class TypeChecking {

    public static boolean semantic(HashMap<String, InfoIdentifiersTable> idT, String id){
        boolean bool=false;

        if(!idT.containsKey(id)){
            bool = true;
        }
        else {

        }

        return bool;
    }


}
