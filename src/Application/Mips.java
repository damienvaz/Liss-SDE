package Application;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by damienvaz on 6/5/15.
 */
public class Mips {
    private String data;
    private String text;
    private boolean[] register;
    private String[] registerName;
    private String[] registerSavedTemporaryName;
    private static int numberOfRegisters = 8;
    private static Integer eachAddressOccupies = 4; // 4 Bytes
    private LinkedList<Integer> counterJumpStack;   //A stack which will handle the IF/WHILE statement behavior
    private Integer counterJump;                    //A counter for the IF/WHILE statement behavior
    private LinkedList<String> functionName;        //It concatenates all the function name, this is due to generate the correct name for the MIPS code.
    private HashMap<String,String> mipsCodeFunctionCache;    //It is a stack which will help the program in producing the mipscode of functions.
    private String functionMipsCode;                //All the code of mipscode Function available here !!!
    private HashMap<String, Integer> mipsCodeSpecialFunctionState; // Structure which explains if a certain function was called by the assembly code. (1) means yes, (0) means no. if it was called at least once time, then it will add to the mips assembly code.


    public Mips(){
        this.data = ".data\n";
        this.text = ".text\n  main:\n";
        this.register = new boolean[numberOfRegisters];
        for(int i=0; i<this.register.length;i++){
            this.register[i] = false;
        }
        this.registerName = new String[numberOfRegisters];
        /*this.registerName[0] = "$t0";
        this.registerName[1] = "$t1";
        this.registerName[2] = "$t2";
        this.registerName[3] = "$t3";
        this.registerName[4] = "$t4";
        this.registerName[5] = "$t5";
        this.registerName[6] = "$t6";
        this.registerName[7] = "$t7";*/
        for(int i = 0; i< numberOfRegisters; i++){
            this.registerName[i] = "$t"+i;
        }
        //Normally it should have 10 "t" registers !! But MIPS has only 8 registers (s0-s7) which are preserved across call ! So we decided to only have, for consistency, 8 "t" registers (which aren't preserved across call !

        this.registerSavedTemporaryName = new String[numberOfRegisters];
        for(int i = 0; i< numberOfRegisters; i++){
            this.registerSavedTemporaryName[i] = "$s"+i;
        }

        this.counterJump = new Integer(0);
        this.counterJumpStack = new LinkedList<>();
        this.functionName = new LinkedList<String>();
        this.mipsCodeFunctionCache = new HashMap<String,String>();

        this.mipsCodeSpecialFunctionState = new HashMap<String,Integer>();
        this.mipsCodeSpecialFunctionState.put("read",0);
        this.mipsCodeSpecialFunctionState.put("indexoutofboundError",0);
        this.mipsCodeSpecialFunctionState.put("write",0);
        this.mipsCodeSpecialFunctionState.put("writeln",0);
        this.mipsCodeSpecialFunctionState.put("cons_sequence",0);
        this.mipsCodeSpecialFunctionState.put("tail_sequence",0);
        this.mipsCodeSpecialFunctionState.put("head_sequence",0);
        this.mipsCodeSpecialFunctionState.put("delete_sequence",0);
        this.mipsCodeSpecialFunctionState.put("is_empty_sequence",0);
        this.mipsCodeSpecialFunctionState.put("length_sequence",0);
        this.mipsCodeSpecialFunctionState.put("member_sequence",0);
        this.mipsCodeSpecialFunctionState.put("copy_sequence",0);
        this.mipsCodeSpecialFunctionState.put("cat_sequence",0);
    }

    public boolean cycleRecursivityFinder(String name){
        boolean res = false;
        int lastIndexNodeLinkedListFunctionName = this.functionName.size()-1;

        for(int i=lastIndexNodeLinkedListFunctionName;i>=0;i--){
            if(this.functionName.get(i).equals(name) && i<lastIndexNodeLinkedListFunctionName){
                res = true;
                i=-1;
            }
        }
        return res;
    }

    public Integer numberOfRegistersInBytes(){ return this.register.length* eachAddressOccupies;    }

    public Integer numberOfBytesForEachAddress(){return eachAddressOccupies;}

    public void resetRegister(){
        int i=0;
        while(this.register[i]==true && (i < (this.register.length-1))){
            this.register[i]=false;
            i++;
        }
    }

    public String nextFreeRegister(){
        String res = null;
        int i = 0;
        while(this.register[i] != false && i< (this.register.length-1)){
            i++;
        }

        if(i<this.register.length){
            res = this.registerName[i];
            this.register[i]=true;
        }
        return res;
    }

    public boolean areSomeRegistersUsed(){
        return this.register[0] == true ? true : false;
    }

    public void freeLastRegister(){
        int i = 0;
        while(this.register[i] != false && i<(this.register.length-1)){
            i++;
        }
        if(i<this.register.length){
            this.register[i-1] = false;
        }
    }

    public int numbersOfRegisteresUsedRightNow(){
        int res = 0;

        for(int i=0; i<this.register.length && this.register[i]==true;i++){
            res++;
        }
        return res;
    }

    public String[] lastTwoRegisterOccupied(){
        String res[] = new String[2];
        int i = 1;
            while(this.register[i]==true && i< (this.register.length-1)){
                i++;
            }
            res[1] = this.registerName[i-1];
            res[0] = this.registerName[i-2];
        return res;
    }

    public String[] lastRegisterOccupied(){
        String res[] = new String[1];
        int i = 0;
        while(this.register[i]==true && i<(this.register.length-1)){
            i++;
        }
        res[0] = this.registerName[i-1];
        return res;
    }

    public void addDataInstruction(String name, String instruction){
        if(name!=null && instruction!=null) {
            this.data += "\t" + name + " : " + instruction;
        }
    }

    public void addDataInstruction(String instruction){ this.data += instruction;}

    public void addLineInstruction(String name, String instruction){
        if(name!=null && instruction!=null) {
            this.text += "  " + name + ": \n" + instruction;
        }
    }

    public void addTextInstruction(String instruction){
        if(instruction!=null){
            this.text += instruction;
        }
    }

    public String storeWordArray(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        String r[] = lastTwoRegisterOccupied();

        s.append("\tsw "+r[0]+", "+name+"("+r[1]+")\t\t# "+line+":"+pos+"\n");

        resetRegister();

        return s.toString();
    }

    public String storeWordArrayText(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        String r[] = lastTwoRegisterOccupied();
        //resetRegister();
        s.append("\tsw "+r[1]+", "+name+"("+r[0]+")\t\t# "+line+":"+pos+"\n");

        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    public String loadWordArray(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        String r[] = lastRegisterOccupied();
        s.append("\tlw "+r[0]+", "+name+"("+r[0]+")\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String storeWord(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
            String r[] = lastRegisterOccupied();

            s.append("\tsw "+r[0]+", "+name+"\t\t# "+line+":"+pos+"\n");

            resetRegister();
        return s.toString();
    }

    public void storeWord(String name, String instruction){
        this.data += name+" : "+instruction;
    }

    public String dataWord(String value, int line, int pos){
        StringBuilder s = new StringBuilder();
            s.append(".word "+value+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String dataArray(Integer value, int line, int pos){
        StringBuilder s = new StringBuilder();
            Integer res = value* eachAddressOccupies;
            s.append(".space "+res.toString()+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String loadImmediateWord(String value,int line, int pos){
        StringBuilder s = new StringBuilder();
            String register = nextFreeRegister();
            s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String loadWord(String value,int line, int pos){
        StringBuilder s = new StringBuilder();
        String register = nextFreeRegister();
        s.append("\tlw "+register+","+value+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String dataBoolean(boolean b, int line, int pos) {
        StringBuilder s = new StringBuilder();
        if (b == true) {
            s.append(".word 1\t\t# " + line + ":" + pos + "\n");
        } else if (b == false) {
            s.append(".word 0\t\t# " + line + ":" + pos + "\n");
        }
        return s.toString();
    }

    public String dataTextOriginal(){
        StringBuilder s = new StringBuilder();

        if(this.mipsCodeSpecialFunctionState.get("indexoutofboundError").equals(1)) {
            s.append("\tindexoutofbound: .asciiz \"Index out of bound. \" \n");
        }
        s.append("\tline: .asciiz \"line: \" \n");
        s.append("\tnewline: .asciiz \"\\n\" \n");

        if(this.mipsCodeSpecialFunctionState.get("read").equals(1)) {
            s.append("\tmessagereadvalue: .asciiz \"Enter integer value:\\n\" \n");
        }
        if(this.mipsCodeSpecialFunctionState.get("tail_sequence").equals(1)) {
            s.append("\talert_tail: .asciiz \"Tail function - Sequence length is inferior of 1.\"\n");
        }
        if(this.mipsCodeSpecialFunctionState.get("head_sequence").equals(1)) {
            s.append("\talert_head: .asciiz \"Head function - Sequence length is inferior of 1.\"\n");
        }
        return s.toString();
    }



    public String textMul(int line, int pos){
        StringBuilder s = new StringBuilder();
            String res[] = lastTwoRegisterOccupied();
            String r0 = res[0];
            String r1 = res[1];

            freeLastRegister();
            s.append("\tmul "+r0+", "+r0+", "+r1+"\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textDiv(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tdiv "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textAdd(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tadd "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textSub(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        //freeLastRegister();
        s.append("\tsub "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");

        freeLastRegister();

        return s.toString();
    }

    /*********************** LOGIC OPERATION ***************************/

    public String loadBoolTrue(int line , int pos){
        return loadImmediateWord("1", line, pos);
    }

    public String loadBoolFalse(int line, int pos){
        return loadImmediateWord("0", line, pos);
    }

    public String textSetOnLessThan(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tslt " + r0 + ", " + r0 + ", " + r1 + "\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    /**
     * Greather than is the reverse of Less than function
     * @param line
     * @param pos
     * @return
     */
    public String textSetOnGreatThan(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tslt "+r0+", "+r1+", "+r0+"\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textOr(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tor " + r0 + ", " + r0 + ", " + r1 + "\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textAnd(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tand " + r0 + ", " + r0 + ", " + r1 + "\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textNot(int line,int pos){
        StringBuilder s = new StringBuilder();

        String t[] = lastRegisterOccupied();
        s.append("\tsltu " + t[0] + ", $zero, " + t[0] + "\t# " + line + ":" + pos + "\n");
        s.append("\txori " + t[0] + ", " + t[0] + ", 1" + "\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textEquals(int line, int pos){
        StringBuilder s = new StringBuilder();

        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];


        //need to test < and then !
        String res2 = nextFreeRegister();
        s.append("\tslt "+res2+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        s.append(textNot(line,pos));
        //need to test > and then !
        String res3 = nextFreeRegister();
        s.append("\tslt "+res3+", "+r1+", "+r0+"\t# " + line + ":" + pos + "\n");
        s.append(textNot(line, pos));
        //finally we must finish by testing and instruction
        s.append(textAnd(line, pos));
        s.append(textMove(res2, r0, line, 0));

        //free last two registers
        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    public String textDifferent(int line, int pos){
        StringBuilder s = new StringBuilder();

        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];


        //need to test < and then !
        String res2 = nextFreeRegister();
        s.append("\tslt "+res2+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");

        //need to test > and then !

        String res3 = nextFreeRegister();
        s.append("\tslt "+res3+", "+r1+", "+r0+"\t# " + line + ":" + pos + "\n");

        //finally we must finish by testing or instruction
        s.append(textOr(line, pos));
        s.append(textMove(res2,r0,line,0));
        //free last two registers
        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    /*****************************************************************/

    public String textLimitsArray(int limit,int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("indexoutofboundError",1);

        s.append("\t####Verify limits of the array####\n");
        s.append(loadImmediateWord("0",line,pos));
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];
        String free = nextFreeRegister();

        //Test if the memory is greater than zero
        s.append("\tslt "+free+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        s.append(textNot(line, pos));
        //s.append("\tbeqz " + free + ", line"+line+"indexoutofbound\t# " + line + ":" + pos + "\n");
        //s.append("\tla $a3, line"+(line+1)+"\t# "+ line + ":" + pos + "\n");
        s.append("\tli $s0, "+line+"\t# "+ line + ":" + pos + "\n"); // line var as second argument ??? shouldn't be limit var ?
        s.append("\tbeqz " + free + ", indexoutofboundError\t# " + line + ":" + pos + "\n");

        freeLastRegister();
        freeLastRegister();

        //Test if the memory is behind the limit.
        s.append(loadImmediateWord(String.valueOf(limit),line,pos));
        res = lastTwoRegisterOccupied();
        r0 = res[0];
        r1 = res[1];
        free = nextFreeRegister();
        s.append("\tslt "+free+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        // We cannot apply not instruction for the maximum limit due to [0,...,n-1] = n elements and the nth elements is the prohibited position !
        s.append("\tli $s0, "+line+"\t# "+ line + ":" + pos + "\n"); // line var as second argument ??? shouldn't be limit var ?
        s.append("\tbeqz "+free+", indexoutofboundError\t# " + line + ":" + pos + "\n");

        s.append("\t####End of the verification####\n");

        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    public String indexOutOfBoundError(){
        StringBuilder s = new StringBuilder();

        s.append("\tli $v0, 4\n");
        s.append("\tla $a0, indexoutofbound\n");
        s.append("\tsyscall\n");
        s.append("\tla $a0, line\n");
        s.append("\tsyscall\n");
        s.append("\tli $v0, 1\n");
        s.append("\tmove $a0, $s0\n");
        s.append("\tsyscall\n");
        s.append("\tli $v0, 4\n");
        s.append("\tla $a0, newline\n");
        s.append("\tsyscall\n");
        s.append(exitProgram()); //Necessary due to an error of index ! So it must quit !

        return s.toString();
    }

    public String exitProgram(){
        StringBuilder s = new StringBuilder();
        s.append("\t####Exit Program####\n");
        s.append("\tli $v0, 10\n");
        s.append("\tsyscall\n");

        return s.toString();
    }

    public String textMove(String r1, String r2, int line, int pos){
        StringBuilder s = new StringBuilder();
        s.append("\tmove "+r2+", "+r1+"\t\t# " + line + ":" + pos + "\n");
        return s.toString();
    }

    /*************************** IF THEN ELSE*****************************/
    public String textIfThenElse( int line, int pos){
        StringBuilder s = new StringBuilder();

        this.counterJump++;
        this.counterJumpStack.push(this.counterJump);
        Integer i = this.counterJumpStack.getFirst();

        String res[] = lastRegisterOccupied();
        String r0 = res[0];
        s.append("\tbne " + r0 + ", 1, else" + i.toString() + "\t\t# " + line + ":" + pos + "\n");

        return s.toString();
    }

    public String textElse(int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            s.append("  else" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
        }

        return s.toString();
    }

    public String textJumpBeforeElse(int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            s.append("\tj l" + i.toString() + "\t\t# " + line + ":" + pos + "\n");
            s.append("  else" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
        }

        return s.toString();
    }

    public String textJumpAfterElse(int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            s.append("  l" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
        }

        return s.toString();
    }

    /*******************************************************************/

    /*************************** WHILE *********************************/

    public String textWhile(boolean functionState,String mipsCodeS, int line, int pos){
        StringBuilder s = new StringBuilder();

        if(mipsCodeS != null) {
            this.counterJump++;
            this.counterJumpStack.push(this.counterJump);
            Integer i = this.counterJumpStack.getFirst();

            if(functionState == false) {
                s.append("  while" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
            }else{
                s.append("      while" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
            }
            s.append("\t########## CONDITION WHILE" + i.toString() + " ##########\n");
            s.append(mipsCodeS);

            String res[] = lastRegisterOccupied();
            String r0 = res[0];
            s.append("\tbne " + r0 + ", 1, while_exit" + i.toString() + "\t\t# " + line + ":" + pos + "\n");
            s.append("\t######## END CONDITION WHILE"+i.toString()+" ########\n");
            freeLastRegister();
        }
        return s.toString();
    }

    public String textWhileExit(boolean functionState, int line, int pos){
        StringBuilder s = new StringBuilder();

        Integer i = this.counterJumpStack.getFirst();

        s.append("\tj while" + i.toString() + "\t\t# " + line + ":" + pos + "\n");
        if(functionState == false) {
            s.append("  while_exit" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("      while_exit" + i.toString() + ":\t\t# " + line + ":" + pos + "\n");
        }


        this.counterJumpStack.pop();

        return s.toString();
    }

    /*******************************************************************/

    /*************************** SUCC OR PRED *********************************/

    public String textSucc(String value,int line, int pos){
        StringBuilder s = new StringBuilder();

        s.append(loadWord(value,line,pos));
        s.append(loadImmediateWord("1", line, pos));
        s.append(textAdd(line, pos));
        s.append(storeWord(value,line,pos));


        return s.toString();
    }

    public String textPred(String value, int line, int pos){
        StringBuilder s = new StringBuilder();

        s.append(loadWord(value,line,pos));
        s.append(loadImmediateWord("1",line,pos));
        s.append(textSub(line, pos));
        s.append(storeWord(value, line, pos));

        return s.toString();
    }

    /**************************************************************************/

    /*************************** WRITE *********************************/

    public String textWrite(String mipsCodeS,boolean write, boolean isAString, int line, int pos){
        StringBuilder s = new StringBuilder();
        if(mipsCodeS != null) {

            s.append(mipsCodeS);

            if(!isAString) {
                String res[] = lastRegisterOccupied();
                String r0 = res[0];

                s.append("\tmove $a0, " + r0 + "\t\t# " + line + ":" + pos + "\n");

                freeLastRegister();
                s.append("\tli $v0, 1\n");
                s.append("\tsyscall\n");
            }else{
                //It means that it is a string!
                s.append("\tli $v0, 4\n");
                s.append("\tsyscall\n");
            }
            if(write == true) {
                this.mipsCodeSpecialFunctionState.put("write",1);
                s.append("\tjal write\t\t# " + line + ":" + pos + "\n");
            }else if(write == false){
                this.mipsCodeSpecialFunctionState.put("writeln",1);
                s.append("\tjal writeln\t\t# " + line + ":" + pos + "\n");
            }
        }
        return s.toString();
    }

    public String textWriteMessage(boolean value){
        // if(value == true) => "write" ! Else "writeln" !
        StringBuilder s = new StringBuilder();

        if(value == false){
            s.append("\tli $v0, 4\n");
            s.append("\tla $a0, newline\n");
            s.append("\tsyscall\n");
        }
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String generateDataStringForWriting(int i,String message){
        StringBuilder s = new StringBuilder();

        s.append("\twritestring"+i+": .asciiz "+message+"\n");

        return s.toString();
    }

    public String loadTextWrite(int i){
        StringBuilder s = new StringBuilder();

        s.append("\tla $a0, writestring"+i+"\n");

        return s.toString();
    }

    /*******************************************************************/

    /*************************** FOR *********************************/

    public String textForCondition(boolean inArray, String variable,Integer variableLevel, Integer positionFromSPvariable, String array, Integer arrayLevel, Integer positionFromSPArray, String mipsCodeS, boolean stepUp, int line, int pos){
        StringBuilder s = new StringBuilder();

        Integer i = this.counterJumpStack.getFirst();

        s.append(mipsCodeS);
        if(stepUp == true){
            //It means stepUp !    var <= Superior Limit
            s.append(textSetOnGreatThan(line, pos));
            s.append(textNot(line, pos));
            String res[] = lastRegisterOccupied();
            String r0 = res[0];
            s.append("\tbne "+r0+", 1, for_exit"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            freeLastRegister();
            //Write code for inArray
            if(inArray == true){
                s.append(loadWord("for_var"+i.toString(),line,pos));
                if(arrayLevel==0) {
                    s.append(loadWordArray(array, line, pos));
                }else if(arrayLevel!=0){
                    //s.append(loadWordSP(positionFromSPArray));
                    s.append(loadWordSP(positionFromSPArray));

                }
                if(variableLevel==0) {
                    s.append(storeWord(variable, line, pos));
                }else if(variableLevel!=0){
                    s.append(storeArgumentsSP(positionFromSPvariable));
                }
            }
        }else if(stepUp == false){
            //It means stepDown !  var >= Superior Limit
            s.append(textSetOnLessThan(line,pos));
            s.append(textNot(line,pos));
            String res[] = lastRegisterOccupied();
            String r0 = res[0];
            s.append("\tbne "+r0+", 1, for_exit"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            freeLastRegister();
        }
        return s.toString();
    }

    public String textForSatisfyingInit(String mipsCodeS, int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            s.append(mipsCodeS);
            String res[] = lastRegisterOccupied();
            String r0 = res[0];
            s.append("\tbne "+r0+", 1, satisfying_exit"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
        }else{
            //Print error of stack empty

        }

        return s.toString();
    }

    public String textForSatisfyingEnd(boolean functionState, int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            if(functionState == false) {
                s.append(" satisfying_exit" + i.toString() + ":\n");
            }else{
                s.append("      satisfying_exit" + i.toString() + ":\n");
            }
        }else{
            //Print error of stack empty

        }

        return s.toString();
    }

    public String textForInit(boolean functionState, boolean inArray, String variable,Integer variableLevel, Integer positionFromSPVariable, String mipsCodeS, int line, int pos){
        StringBuilder s = new StringBuilder();

        this.counterJump++;
        this.counterJumpStack.push(this.counterJump);
        Integer i = this.counterJumpStack.getFirst();

        if(inArray == true) {
            addDataInstruction("for_var"+i.toString(),dataWord("0",line,pos));
        }

        s.append("\t########### INIT FOR_LOOP" + i.toString() + " ###########\n");
        s.append(mipsCodeS);
        if(inArray == true) {
            s.append(storeWord("for_var"+i.toString(),line,pos));
        }else{
            if(variableLevel==0) {
                s.append(storeWord(variable, line, pos));
            }else if (variableLevel!=0){
                s.append(storeWordSP(positionFromSPVariable));
            }
        }
        if(functionState == false) {
            s.append("  for_loop" + i.toString() + ":\n");
        }else{
            s.append("      for_loop" + i.toString() + ":\n");
        }
        if(inArray == true) {
            s.append(loadWord("for_var" + i.toString(), line, pos));
        }else {
            if(variableLevel==0) {
                s.append(loadWord(variable, line, pos));
            }else if(variableLevel!=0){
                s.append(loadWordSP(positionFromSPVariable));
            }
        }

        return s.toString();
    }

    public String textForStep(boolean functionState, String variable, Integer variableLevel, Integer positionFromSP, boolean inArray, boolean stepUp, String stepValue, int line, int pos){
        StringBuilder s = new StringBuilder();

        Integer i = this.counterJumpStack.getFirst();

        if(inArray == true){
            s.append(loadWord("for_var"+i.toString(), line, pos));
            s.append(loadImmediateWord(eachAddressOccupies.toString(), line, pos));
            s.append(textAdd(line, pos));
            String res[] = lastRegisterOccupied();
            s.append("\tsw "+res[0]+", for_var"+i.toString()+"\t\t# "+line+":"+pos+"\n");
            resetRegister();
            s.append("\tj for_loop"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
        }else{
            if(stepUp == true){
                s.append(loadWord(variable, line, pos));
                s.append(loadImmediateWord(stepValue, line, pos));
                s.append(textAdd(line, pos));
                if(variableLevel==0) {
                    s.append(storeWord(variable, line, pos));
                }else if(variableLevel!=0){
                    s.append(storeWordSP(positionFromSP));
                }
                s.append("\tj for_loop"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            } else if(stepUp == false){
                s.append(loadWord(variable, line, pos));
                s.append(loadImmediateWord(stepValue, line, pos));
                s.append(textSub(line, pos));
                if(variableLevel==0){
                    s.append(storeWord(variable, line, pos));
                }else if(variableLevel!=0){
                    s.append(storeWordSP(positionFromSP));
                }
                s.append("\tj for_loop"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            }
        }
        if(functionState == false) {
            s.append("  for_exit" + i.toString() + ":\n");
        }else{
            s.append("      for_exit" + i.toString() + ":\n");
        }
        s.append("\t########### END FOR_LOOP"+i.toString()+" ###########\n");

        this.counterJumpStack.pop();
        return s.toString();
    }

    /*****************************************************************/

    /*************************** READ *********************************/

    public String textRead(String variable, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("read",1);

        s.append("\tjal read\t\t# " + line + ":" + pos + "\n");
        String r0 = nextFreeRegister();
        s.append("\tmove "+r0+", $v0\t\t# " + line + ":" + pos +"\n");
        s.append(storeWord(variable,line,pos));

        return s.toString();
    }

    public String textReadFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\tli $v0,4\n");
        s.append("\tla $a0,messagereadvalue\n");
        s.append("\tsyscall\n");

        s.append("\tli $v0,5\n");
        s.append("\tsyscall\n");
        s.append("\tjr $ra\n");

        return s.toString();
    }

    /******************************************************************/

    /*************************** FUNCTIONS *********************************/

    public String textFunctionCall(String name, int line, int pos, boolean returnBoolean, String argumentsMipsCodeS){
        //This works only for level 0
        StringBuilder s = new StringBuilder();

        if(argumentsMipsCodeS!=null) {
            s.append(argumentsMipsCodeS); //See if this is here where it belongs
        }

        for(int i=0; i<this.registerSavedTemporaryName.length ; i++){
            s.append(textMove(this.registerName[i],this.registerSavedTemporaryName[i],line,pos));
        }

        s.append("\tjal "+name+"\t\t# " + line + ":" + pos + "\n");
        if(returnBoolean==true){
            String r0 = nextFreeRegister();
            s.append(textMove("$v0",r0,line,pos));

        }

        return s.toString();
    }

    public void addNameFunction(String s ){ this.functionName.addLast(s);}

    public void removeNameFunction(){ this.functionName.removeLast();}

    public String getNameFunction(){
        StringBuilder s = new StringBuilder();

        for(String s1 : this.functionName){
            s.append(s1);
        }

        return s.toString();
    }

    public String storeValueSP(String register, Integer positionFromSP){
        StringBuilder s = new StringBuilder();

        s.append("\tsw " + register + ", " + positionFromSP.toString() + "($sp)\t\t \n");// + line + ":" + pos +"\n");

        return s.toString();
    }

    public String storeWordSP(Integer positionFromSP){
        StringBuilder s = new StringBuilder();

        String register = lastRegisterOccupied()[0];
        s.append("\tsw " + register + ", " + positionFromSP.toString() + "($sp)\t\t \n");// + line + ":" + pos +"\n");
        freeLastRegister();

        return s.toString();
    }

    public String loadWordValueSP(String register, Integer positionFromSP){
        StringBuilder s = new StringBuilder();

        s.append("\tlw " + register + ", " + positionFromSP.toString() + "($sp)\t\t\n");

        return s.toString();
    }

    public String loadWordSP(Integer positionFromSP){
        StringBuilder s = new StringBuilder();

        String register = nextFreeRegister();
        s.append("\tlw " + register + ", " + positionFromSP.toString() + "($sp)\t\t\n");

        return s.toString();
    }

    public String jumpReturnAddress(){
        StringBuilder s = new StringBuilder();

        s.append("\tjr $ra\t\t\n");

        return s.toString();
    }

    public Integer valueReturnAddressFunction(int sizeFrameStack){ //Size from Table Identifier of Function (Address)
        return sizeFrameStack- eachAddressOccupies;
    }

    public String increaseStackFrameSP(int size){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -"+size+"\t\t\n");

        return s.toString();
    }

    public String decreaseStackFrameSP(int size){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, "+size+"\t\t\n");

        return s.toString();
    }

    public String saveRegistersAndReturnAddressBeginFunctions(int sizeFrameStack){
        StringBuilder s = new StringBuilder();

        int returnAddress = valueReturnAddressFunction(sizeFrameStack);
        Integer registerNr = numberOfRegisters;

        for(String reg : this.registerSavedTemporaryName){
            s.append(storeValueSP(reg,returnAddress-(registerNr* eachAddressOccupies)));
            registerNr--;
        }

        s.append(storeValueSP("$ra",returnAddress));

        return s.toString();
    }

    public String textBeginFunction(int line,int pos,int sizeFrameStack){
        StringBuilder s = new StringBuilder();


        return s.toString();
    }

    public String textEndFunction(int sizeFrameStack, String returnMipsCode){
        StringBuilder s = new StringBuilder();

        //s.append("\taddi $sp, $sp, "+sizeFrameStack+"\t\t# " + line + ":" + pos +"\n");
        int returnAddress = valueReturnAddressFunction(sizeFrameStack);
        Integer registerNr = numberOfRegisters;

        for(String reg : this.registerSavedTemporaryName){
            s.append(loadWordValueSP(reg,returnAddress-(registerNr* eachAddressOccupies)));
            registerNr--;
        }
        s.append(loadWordValueSP("$ra",sizeFrameStack-this.numberOfBytesForEachAddress()));
        //System.out.println("RETURN2 : "+returnMipsCode);
        if(returnMipsCode!=null){
            s.append(returnMipsCode);
            String[] r = lastRegisterOccupied();
            s.append(textMove(r[0],"$v0",0,0));
            freeLastRegister();
        }
        s.append(this.decreaseStackFrameSP(sizeFrameStack));
        s.append(this.jumpReturnAddress());

        return s.toString();
    }

    public void addMipsCodeFunction(String nameFunction, String mipsCode){
        if(!this.mipsCodeFunctionCache.containsKey(nameFunction)) {
            this.mipsCodeFunctionCache.put(nameFunction,mipsCode);
        }else{
            String s = this.mipsCodeFunctionCache.get(nameFunction)+mipsCode;
            this.mipsCodeFunctionCache.remove(nameFunction);
            this.mipsCodeFunctionCache.put(nameFunction,s);
        }
    }

    public void addIncreaseSFMipsCodeFunction(String nameFunction, String mipsCode){
        if(!this.mipsCodeFunctionCache.containsKey(nameFunction)) {
            this.mipsCodeFunctionCache.put(nameFunction,mipsCode);
        }else{
            String s = mipsCode+this.mipsCodeFunctionCache.get(nameFunction);
            this.mipsCodeFunctionCache.remove(nameFunction);
            this.mipsCodeFunctionCache.put(nameFunction,s);
        }
    }

    public String getMipsCodeFunction(String nameFunction){
        return this.mipsCodeFunctionCache.get(nameFunction);
    }

    public void removeMipsCodeFunction(){
        String name = this.getNameFunction();
        if(this.functionMipsCode == null) {
            this.functionMipsCode = "  " + name + ": \n" + this.getMipsCodeFunction(name);
        }else{
            this.functionMipsCode += "  " + name + ": \n" + this.getMipsCodeFunction(name);
        }
        this.mipsCodeFunctionCache.remove(name);
    }

    /***********************************************************************/

    /******************************TRYING TO FIGURE OUT THE EFFECT OF THE FUNCTIONS DUE TO GITHUB INTELLIJ BUG******************************/

    public String storeValueWordArraySP(int line, int pos) {
        StringBuilder s = new StringBuilder();

        s.append("\tadd "+lastRegisterOccupied()[0]+", "+lastRegisterOccupied()[0]+", $sp\n");

        String[] res = lastTwoRegisterOccupied();
        s.append("\tsw "+res[0]+", ("+res[1]+")\n");

        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    //textFunctionCall -> see if it works well

    public String storeArgumentsSP(Integer i){
        StringBuilder s = new StringBuilder();

        if(this.register[0] != false) {
            String[] res = lastRegisterOccupied();

            s.append("\tsw " + res[0] + ", " + i.toString() + "($sp)\n");

            freeLastRegister();  //test it !!
        }

        return s.toString();
    }

    public String textSuccSF(Integer positionFromSP, int line, int pos){
        StringBuilder s = new StringBuilder();

        s.append(loadWordSP(positionFromSP));
        s.append(loadImmediateWord("1", line, pos));
        s.append(textAdd(line, pos));
        //s.append(storeWord(value,line,pos));
        s.append(storeArgumentsSP(positionFromSP));

        return s.toString();
    }

    public String textPredSF(Integer positionFromSP, int line, int pos){
        StringBuilder s = new StringBuilder();

        s.append(loadWordSP(positionFromSP));
        s.append(loadImmediateWord("1", line, pos));
        s.append(textSub(line, pos));
        //s.append(storeWord(value,line,pos));
        s.append(storeArgumentsSP(positionFromSP));

        return s.toString();
    }

    //textForCondition && textForStep && textForInit

    public String copyArrayArgumentsForFunctions(Integer level, String nameOfArgument,Integer sizeOfArray, Integer addressOfArrayArgumentOnSF, Integer addressOfArrayArgumentsOnSFForLevelGreaterThan0, int line, int pos){
        StringBuilder s = new StringBuilder();



        for(int position=0; position<sizeOfArray; position+=1){
            if(level.equals(0)){
                s.append(loadImmediateWord((position* eachAddressOccupies)+"",line,pos));
                s.append(loadWordArray(nameOfArgument,line,pos));
                //Falta fazer o store agora para o novo
                s.append(storeWordSP(-(addressOfArrayArgumentOnSF-(position* eachAddressOccupies)))); //Might not work due to calcule
            }else{
                //s.append(loadImmediateWord(position+"",line,pos));
                s.append(loadWordSP(-(addressOfArrayArgumentsOnSFForLevelGreaterThan0-(position* eachAddressOccupies))));
                s.append(storeWordSP(-(addressOfArrayArgumentOnSF-(position* eachAddressOccupies)))); //Might not work due to calcule
            }
        }

        return s.toString();
    }

    /***************************************************************************************************************************************/

    /*************************** SEQUENCE *********************************/

    public String textInitSequence(String nameOfSequence,int value,boolean firstElement, boolean lastElement,boolean functionState, int addressInSP, int line, int pos){
        StringBuilder s = new StringBuilder();

        //It puts the address of the sequence to NULL (-1)
        if(functionState==true && firstElement==true){
            String register = nextFreeRegister();
            s.append("\tlw "+register+", " + addressInSP + "($sp)\t\t# " + line + ":" + pos + "\n");
            s.append(loadImmediateWord("-1",line,pos));
            s.append("\tsw "+lastRegisterOccupied()[0]+", ("+register+")\t\t# " + line + ":" + pos + "\n");
            freeLastRegister();
            freeLastRegister();
        }

        //Create the sequence under and their elements also
        if(firstElement==true){
            if(functionState==false){
                s.append("\tlw $s0, " + nameOfSequence + "\t\t# " + line + ":" + pos + "\n");
            }else{
                s.append("\tlw $s0, " + addressInSP + "($sp)\t\t# " + line + ":" + pos + "\n");
            }
        }
        s.append("\tli $s1, "+value+"\t\t# "+line+":"+pos+"\n");
        s.append("\tjal cons_sequence\t\t# "+line+":"+pos+"\n");
        if(lastElement==false){
            s.append("\tmove $s0, $v0\t\t# "+line+":"+pos+"\n");
        }else{
            if(functionState==false) {
                s.append("\tsw $v0, " + nameOfSequence + "\t\t# " + line + ":" + pos + "\n");
            }else{
                s.append("\tsw $v0, " + addressInSP + "($sp)\t\t# " + line + ":" + pos + "\n");
            }
        }
        return s.toString();
    }

    public String textSaveStateBeforeCallingSpecialFunction(int numberOfRegistersUsed){
        StringBuilder s = new StringBuilder();
        //Need to count how many registers are stored
        //int numberOfRegisters = numbersOfRegisteresUsedRightNow();

        if(numberOfRegistersUsed!=0) {
            //need to add sp with the number of registeres *4
            s.append("\taddi $sp, $sp, -" + numberOfRegistersUsed * this.eachAddressOccupies + "\n");

            //need to store the values of those states to the stack
            for (int i = 0; i < numberOfRegistersUsed; i++) {
                s.append("\tsw $t" + i + ", " + i * this.eachAddressOccupies + "($sp)\n");
                freeLastRegister();
            }
        }

        return s.toString();
    }

    public String textRestoreStateAfterEndedCallingSpecialFunction(int numberOfRegistersUsed){
        StringBuilder s = new StringBuilder();

        if(numberOfRegistersUsed!=0) {
            //need to restore those values into the registers
            for (int i = 0; i < numberOfRegistersUsed; i++) {
                s.append("\tlw " + nextFreeRegister() + ", " + i * this.eachAddressOccupies + "($sp)\n");
            }

            //need to substract the sp
            s.append("\taddi $sp, $sp, " + numberOfRegistersUsed * eachAddressOccupies + "\n");
        }
        return s.toString();
    }

    public String textCons(String valueToInsert, String sequence2, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("cons_sequence",1);

        String[] res = lastTwoRegisterOccupied();
        s.append(sequence2);
        s.append(textMove(res[1],"$s0", line, pos));
        s.append(valueToInsert);
        s.append(textMove(res[0], "$s1", line, pos));
        freeLastRegister();
        freeLastRegister();
        s.append("\tjal cons_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textTail(String sequence, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("tail_sequence",1);

        String[] res =lastRegisterOccupied();
        s.append(sequence);
        s.append(textMove(res[0], "$s0", line, pos));
        freeLastRegister();
        s.append("\tjal tail_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textHead(String sequence, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("head_sequence",1);

        String[] res =lastRegisterOccupied();
        s.append(sequence);
        s.append(textMove(res[0], "$s0", line, pos));
        freeLastRegister();
        s.append("\tjal head_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textDelete(String valueToDelete,String sequence, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("delete_sequence",1);

        String[] res = lastTwoRegisterOccupied();
        s.append(sequence);
        s.append(textMove(res[1],"$s0", line, pos));
        s.append(valueToDelete);
        s.append(textMove(res[0], "$s1", line, pos));
        freeLastRegister();
        freeLastRegister();
        s.append("\tjal delete_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textIsEmpty(String sequence, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("is_empty_sequence",1);

        String[] res = lastRegisterOccupied();
        s.append(sequence);
        s.append(textMove(res[0],"$s0", line, pos));
        freeLastRegister();
        s.append("\tjal is_empty_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textLength(String sequence, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("length_sequence",1);

        String[] res = lastRegisterOccupied();
        s.append(sequence);
        s.append(textMove(res[0],"$s0", line, pos));
        freeLastRegister();
        s.append("\tjal length_sequence\n");

        String register = nextFreeRegister();
        s.append(textMove("$v0", register, line, pos));

        return s.toString();
    }

    public String textMember(String integerToSearchMipsCodeS, String nameOfSequence, Integer levelOfSequenceInIdentifierTable, int positionOfSequenceInSF, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("member_sequence",1);

        s.append(integerToSearchMipsCodeS);
        String[] register = lastRegisterOccupied();
        s.append(textMove(register[0],"$s1",line,pos));

        if(levelOfSequenceInIdentifierTable.equals(0)){
            s.append(loadWord(nameOfSequence,line,pos));
            register = lastRegisterOccupied();
            s.append(textMove(register[0],"$s0",line,pos));
        }else{
            s.append(loadWordSP(positionOfSequenceInSF));
            register = lastRegisterOccupied();
            s.append(textMove(register[0],"$s0",line,pos));
        }
        freeLastRegister();
        freeLastRegister();

        s.append("\tjal member_sequence\n");

        String res = nextFreeRegister();
        s.append(textMove("$v0",res,line,pos));


        return s.toString();
    }

    public String textCopy(String nameOfSequence1, Integer levelOfSequence1InIdTH, int positionInSFOfSequence1,String nameOfSequence2, Integer levelOfSequence2InIdTH, int positionInSFOfSequence2, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("copy_sequence",1);

        if(levelOfSequence1InIdTH.equals(0)){
            s.append("\tlw $s0, "+nameOfSequence1+"\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tlw $s0, "+positionInSFOfSequence1+"($sp)\t\t# " + line + ":" + pos + "\n");
        }
        s.append("\tli $s1, -1\t\t# " + line + ":" + pos +"\n");
        s.append("\tjal copy_sequence\n");

        if(levelOfSequence2InIdTH.equals(0)){
            s.append("\tsw $v0, "+nameOfSequence2+"\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tsw $v0, "+positionInSFOfSequence2+"($sp)\t\t# " + line + ":" + pos + "\n");
        }
        s.append("\tli $v0, 0\n");

        return s.toString();
    }

    public String textCat(String nameOfSequence1, Integer levelOfSequence1InIdTH, int positionInSFOfSequence1,String nameOfSequence2, Integer levelOfSequence2InIdTH, int positionInSFOfSequence2, int line, int pos){
        StringBuilder s = new StringBuilder();
        this.mipsCodeSpecialFunctionState.put("cat_sequence",1);

        if(levelOfSequence1InIdTH.equals(0)){
            s.append("\tlw $s0, "+nameOfSequence1+"\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tlw $s0, "+positionInSFOfSequence1+"($sp)\t\t# " + line + ":" + pos + "\n");
        }

        if(levelOfSequence2InIdTH.equals(0)){
            s.append("\tlw $s1, "+nameOfSequence2+"\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tlw $s1, "+positionInSFOfSequence2+"($sp)\t\t# " + line + ":" + pos + "\n");
        }

        s.append("\tjal cat_sequence\n");

        if(levelOfSequence1InIdTH.equals(0)){
            s.append("\tsw $v0, "+nameOfSequence1+"\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tsw $v0, "+positionInSFOfSequence1+"($sp)\t\t# " + line + ":" + pos + "\n");
        }
        s.append("\tli $v0, 0\n");

        return s.toString();
    }

    public String textStoreSequence(String nameVariable, boolean functionState, int addressVariable, int line, int pos){
        StringBuilder s = new StringBuilder();
        if(!functionState){
            s.append("\tsw $v0, " + nameVariable + "\t\t# " + line + ":" + pos + "\n");
        }else{
            s.append("\tsw $v0, " + addressVariable + "($sp)\t\t# " + line + ":" + pos + "\n");
        }

        return s.toString();
    }

    public String textConsFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -12\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $s1, 4($sp)\n");    //#store the value to insert in the sequence
        s.append("\tsw $ra, 8($sp)\n");    //#store the return address to the stack
        s.append("\tj cons_algorithm\n");
        s.append("  cons_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n");   //# load the address of the element pointed in the sequence
        s.append("\tbeq $t0, -1, add_element\n"); //#test if it is NULL (-1)
        s.append("\tlw $s0, 0($t0)\n"); //# load the address of the next element
        s.append("\tlw $s1, 4($sp)\n"); //# load the value to insert
        s.append("\tjal cons_sequence\n");
        s.append("\tlw $t0, 0($sp)\n"); //#load the address of the element pointed
        s.append("\tsw $v0, 0($t0)\n"); //# store the address of the res function (cons_sequence) to the next pointer of the element pointed
        s.append("\tlw $v0, 0($sp)\n"); //# load the address of the actual element pointed
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  add_element:\n");
        s.append("\tli $v0, 9\n"); //#service to allocate into the heap
        s.append("\tli $a0, 8\n");  //#number of bytes to allocate in the heap
        s.append("\tsyscall\n");
        s.append("\tli $t0, -1\n");       //#put the next pointer of the element to -1
        s.append("\tsw $t0, 0($v0)\n");   //#store the pointer to the heap
        s.append("\tlw $t0, 4($sp)\n");   //# load the value to insert in the newest element created
        s.append("\tsw $t0, 4($v0)\n");   //#store the value of the element to the heap!
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String textTailFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -8\n"); // #allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $ra, 4($sp)\n");    //#store the return address to the stack
        s.append("\tj tail_algorithm\n");
        s.append("  tail_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# load the address of the element pointed to the sequence
        s.append("\tbeq $t0, -1, alert_no_tail\n"); //# compare the address to the NULL (-1)
        s.append("\tlw $t0, 0($sp)\n"); //# otherwise load the address of the element pointed in the sequence
        s.append("\tlw $v0, 0($t0)\n"); //# get the address of the next element of the sequence

        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack

        s.append("\tjr $ra\n");
        s.append("  alert_no_tail:\n");
        s.append("\tli $v0, 4\n");
        s.append("\tla $a0,  alert_tail\n");
        s.append("\tsyscall\n");
        s.append("\tla $a0, newline\n");
        s.append("\tsyscall\n");
        s.append("\tli $v0, 10\n");
        s.append("\tsyscall\n");


        return s.toString();
    }

    public String textHeadFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -8\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $ra, 4($sp)\n");    //#store the return address to the stack
        s.append("\tj head_algorithm\n");
        s.append("  head_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# load the address of the element pointed to the sequence
        s.append("\tbeq $t0, -1, alert_no_head\n"); //# compare the address to the NULL (-1)
        s.append("\tlw $t0, 0($sp)\n"); //# otherwise load the address of the element pointed in the sequence
        s.append("\tlw $v0, 4($t0)\n"); //# get the value of the element of the sequence
        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  alert_no_head:\n");
        s.append("\tli $v0, 4\n");
        s.append("\tla $a0,  alert_head\n");
        s.append("\tsyscall\n");
        s.append("\tla $a0, newline\n");
        s.append("\tsyscall\n");
        s.append("\tli $v0, 10\n");
        s.append("\tsyscall\n");

        return s.toString();
    }

    public String textDeleteFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -12\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $s1, 4($sp)\n");    //#store the value to delete
        s.append("\tsw $ra, 8($sp)\n");    //#store the return address to the stack
        s.append("\tj delete_algorithm\n");
        s.append("  delete_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n");   //# load the address of the element pointed in the sequence
        s.append("\tbne $t0, -1, delete_recursivity\n"); //#test if it is NULL (-1)
        s.append("\tlw $v0, 0($sp)\n");

        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  delete_recursivity:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# load the address of the element
        s.append("\tlw $s0, 0($t0)\n"); //# load the address of the next element
        s.append("\tlw $s1, 4($sp)\n"); //# load the value to delete
        s.append("\tjal delete_sequence\n"); //# jump to the function
        s.append("\tlw $t0, 0($sp)\n"); //# load the address element pointed right now
        s.append("\tsw $v0, 0($t0)\n"); //# save the address of the next element to the element pointed right now
        s.append("\tlw $t0, 4($t0)\n"); //# load the value of the element pointed right now
        s.append("\tlw $t1, 4($sp)\n"); //# load the value to delete
        s.append("\tbeq $t0, $t1, element_found\n"); //# compare both values, if they are equals then jump for deleting them

        s.append("\tlw $v0, 0($sp)\n");  //# load the value to return
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  element_found:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# get the address of the element pointed
        s.append("\tlw $v0, 0($t0)\n"); //# get the address of the next element and return it to the res function

        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");


        return s.toString();
    }

    public String textIsEmptyFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -8\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $ra, 4($sp)\n");    //#store the return address to the stack
        s.append("\tj is_empty_algorithm\n");

        s.append("  is_empty_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# load the address of the first element of the sequence
        s.append("\tbeq $t0, -1, is_empty\n"); //# test if it is NULL (-1)
        s.append("\tli $v0, 0\n"); //# load the value 0 to res function (because the sequence isn't empty)

        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  is_empty:\n");
        s.append("\tli $v0, 1\n"); //# load the value 1 to res function (because the sequence is empty)
        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String textLengthFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -8\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $ra, 4($sp)\n");    //#store the return address to the stack
        s.append("\tj length_algorithm\n");
        s.append("  length_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n"); //# load the address of the element pointed
        s.append("\tbeq $t0, -1, count_begins\n"); //# test if it is NULL (-1)
        s.append("\tlw $s0, 0($t0)\n"); //# load the address of the next element in the element pointed right now
        s.append("\tjal length_sequence\n"); //# recursivity of length sequence
        s.append("\taddi $v0, $v0, 1\n"); //# add 1 to the counting variable of lenght sequence
        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");
        s.append("  count_begins:\n");
        s.append("\tli $v0, 0\n"); //# add the result of 0 to the counting variable
        s.append("\tlw $ra, 4($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 8\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String textMemberFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -12\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the sequence to the stack
        s.append("\tsw $s1, 4($sp)\n");    //#store the value to search
        s.append("\tsw $ra, 8($sp)\n");    //#store the return address to the stack
        s.append("\tj member_algorithm\n");

        s.append("  member_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n");
        s.append("\tbeq $t0, -1, check_member_begins\n");
        s.append("\tlw $s0, 0($t0)\n"); //# load the address of the next element in the element pointed right now
        s.append("\tlw $s1, 4($sp)\n");
        s.append("\tjal member_sequence\n"); //# recursivity of length sequence
        s.append("\tbeq $v0, 1, exit_member_algorithm\n");
        s.append("\tlw $t0, 0($sp)\n");
        s.append("\tlw $t0, 4($t0)\n");
        s.append("\tlw $t1, 4($sp)\n");
        s.append("\tbeq $t0, $t1, member_found\n");
        s.append("\tj exit_member_algorithm\n");
        s.append("  member_found:\n");
        s.append("\tli $v0, 1\n");
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        s.append("  check_member_begins:\n");
        s.append("\tli $v0, 0\n"); //# add the result of 0
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        s.append("  exit_member_algorithm:\n");
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String textCatFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -12\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the first sequence to the stack
        s.append("\tsw $s1, 4($sp)\n");    //#store the address of the second sequence to the stack
        s.append("\tsw $ra, 8($sp)\n");    //#store the return address to the stack
        s.append("\tj cat_algorithm\n");

        s.append("  cat_algorithm:\n");
        s.append("\tlw $t0, 4($sp)\n"); //# load the address of the second quence
        s.append("\tbeq $t0, -1, exit_cat\n"); //# test the address of the second sequence ( if it is NULL (-1))

        s.append("\tlw $s0, 0($sp)\n"); //# load the address of the first sequence
        s.append("\tlw $s1, 4($t0)\n"); //# load the address of the second sequence
        s.append("\tjal cons_sequence\n"); //# call the cons function
        s.append("\tsw $v0, 0($sp)\n"); //# get the result of that function and refresh the stack

        s.append("\tlw $s0, 0($sp)\n"); //# load the address of the first sequence
        s.append("\tlw $t0, 4($sp)\n"); //# load the address of the second sequence
        s.append("\tlw $s1, 0($t0)\n"); //# load the address of the next element of the second sequence
        s.append("\tjal cat_sequence\n"); //# recursivity of the function cat
        s.append("\tj exit_cat\n");
        s.append("  exit_cat:\n");
        s.append("\tlw $v0, 0($sp)\n"); //# load the address of the first sequence
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    public String textCopyFunction(){
        StringBuilder s = new StringBuilder();

        s.append("\taddi $sp, $sp, -12\n"); //#allocate space to the stack
        s.append("\tsw $s0, 0($sp)\n");    //#store the address of the first sequence to the stack
        s.append("\tsw $s1, 4($sp)\n");    //#store the address of the second sequence to the stack
        s.append("\tsw $ra, 8($sp)\n");    //#store the return address to the stack
        s.append("\tj copy_algorithm\n");
        s.append("  copy_algorithm:\n");
        s.append("\tlw $t0, 0($sp)\n");
        s.append("\tbeq $t0, -1, exit_copy\n");

        s.append("\tlw $s0, 4($sp)\n");
        s.append("\tlw $t0, 0($sp)\n");
        s.append("\tlw $s1, 4($t0)\n");
        s.append("\tjal cons_sequence\n");
        s.append("\tsw $v0, 4($sp)\n");

        s.append("\tlw $t0, 0($sp)\n");
        s.append("\tlw $s0, 0($t0)\n");
        s.append("\tmove $s1, $v0\n");
        s.append("\tjal copy_sequence\n");
        s.append("\tj exit_copy\n");

        s.append("  exit_copy:\n");
        s.append("\tlw $v0, 4($sp)\n"); //# load the address of the first sequence
        s.append("\tlw $ra, 8($sp)\n");   //#load the return address from the stack position
        s.append("\taddi $sp, $sp, 12\n"); //#remove the space from the stack
        s.append("\tjr $ra\n");

        return s.toString();
    }

    /***********************************************************************/
    public void removeLastStack(){
        if(this.counterJumpStack.size()>0) {
            this.counterJumpStack.pop();
        }
    }

    public void textExitCode(){
        addTextInstructions(exitProgram());
        if(this.functionMipsCode!=null){
            addTextInstruction(this.functionMipsCode);
        }
        if(this.mipsCodeSpecialFunctionState.get("indexoutofboundError").equals(1)) {
            addLineInstruction("indexoutofboundError", indexOutOfBoundError());
        }
        if(this.mipsCodeSpecialFunctionState.get("write").equals(1)) {
            addLineInstruction("write", textWriteMessage(true));
        }
        if(this.mipsCodeSpecialFunctionState.get("writeln").equals(1)) {
            addLineInstruction("writeln", textWriteMessage(false));
        }
        if(this.mipsCodeSpecialFunctionState.get("read").equals(1)) {
            addLineInstruction("read", textReadFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("cons_sequence").equals(1)) {
            addLineInstruction("cons_sequence", textConsFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("tail_sequence").equals(1)) {
            addLineInstruction("tail_sequence", textTailFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("head_sequence").equals(1)) {
            addLineInstruction("head_sequence", textHeadFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("delete_sequence").equals(1)) {
            addLineInstruction("delete_sequence", textDeleteFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("is_empty_sequence").equals(1)) {
            addLineInstruction("is_empty_sequence", textIsEmptyFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("length_sequence").equals(1)) {
            addLineInstruction("length_sequence", textLengthFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("member_sequence").equals(1)) {
            addLineInstruction("member_sequence", textMemberFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("cat_sequence").equals(1)) {
            addLineInstruction("cat_sequence", textCatFunction());
        }
        if(this.mipsCodeSpecialFunctionState.get("copy_sequence").equals(1)) {
            addLineInstruction("copy_sequence", textCopyFunction());
        }
    }

    public void addDataInstructions(HashMap<String, HashMap<String,Object>> vars, String type){

        switch (type){
            case "integer":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);
                    String s = (String) info.get("mips");
                    if(s != null){
                        addDataInstruction(var,s);
                    }else if(s==null){
                        addDataInstruction(var,dataWord("0",(int)info.get("line"),(int)info.get("pos")));
                    }
                }

                break;
            case "boolean":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);
                    String s = (String) info.get("mips");
                    if(s != null){
                        addDataInstruction(var, s);
                    }else if(s==null){
                        addDataInstruction(var,dataBoolean(false, (int) info.get("line"), (int) info.get("pos")));
                    }
                }

                break;
            case "array":
                for(String var : vars.keySet()) {
                    HashMap<String, Object> info = vars.get(var);
                    Integer res = new Integer(1);
                    for (Integer i : (ArrayList<Integer>) info.get("dimension")) {
                        res = res * i;
                    }

                    String s = dataArray(res, (int) info.get("line"), (int) info.get("pos"));
                    addDataInstruction(var, s);

                    String s1 = (String) info.get("mips");
                    if (s1 != null && info.get("accessArray")!=null) { //Testing accessArray means if the variable is an array or not! Why? Because arrays are considered Integer for arithmetic operations ! And instead of being an array, the type is integer ! Not sure if we need to fix this!
                        addTextInstruction(s1);
                    }
                }
                break;
            case "sequence":
                //we need to implement the code here...
                for(String var: vars.keySet()){
                    HashMap<String, Object> info = vars.get(var);


                    String s = dataWord("-1",(int) info.get("line"), (int) info.get("pos"));
                    addDataInstruction(var, s);

                    String s1 = (String) info.get("mips");
                    if (s1 != null) { //Testing accessArray means if the variable is an array or not! Why? Because arrays are considered Integer for arithmetic operations ! And instead of being an array, the type is integer ! Not sure if we need to fix this!
                        addTextInstruction(s1);
                    }
                }

                break;
            default: //We don't need to implement sets normally because they are dinamics structure (not sure)
                break;
        }

    }

    public void addDataFunctionInstructions(HashMap<String, HashMap<String,Object>> vars, String type){
        switch (type){
            case "integer":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);
                    String s = (String) info.get("mips");
                    if(s != null) {
                        //addTextInstruction(s1);
                        addMipsCodeFunction(getNameFunction(),s);
                    }
                }
                break;
            case "boolean":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);
                    String s = (String) info.get("mips");
                    if(s != null) {
                        //addTextInstruction(s1);
                        addMipsCodeFunction(getNameFunction(),s);
                    }
                }
                break;
            case "array":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);

                    String s = (String) info.get("mips");
                    if(s != null) {
                        //addTextInstruction(s1);
                        addMipsCodeFunction(getNameFunction(),s);
                    }

                }
                 break;
            case "sequence":
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);

                    String s = (String) info.get("mips");
                    if(s != null) {
                        //addTextInstruction(s1);
                        addMipsCodeFunction(getNameFunction(),s);
                    }

                }
            default:
                break;
        }
    }

    //public void addTextInstructions(String name, String instruction, String type, int line, int pos){
    public void addTextInstructions(String instruction){
        addTextInstruction(instruction);
    }

    public String getAssemblyCode(){
        return this.data+this.text;
    }

    public void write(){
        try {

            JFileChooser fc = new JFileChooser();

            fc.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    if (f.isDirectory()) {
                        return true;
                    }
                    final String name = f.getName();
                    return name.endsWith(".asm");
                }

                @Override
                public String getDescription() {
                    return "*.asm";
                }
            });
            fc.showDialog(null, "Save");
            File f = fc.getSelectedFile();
            String newfile = null;
            if(f.toString().matches("^.*\\.asm$")){
                newfile = f.toString();
            }else{
                newfile = f+".asm";
            }
            File file = new File(newfile);

            boolean flag = file.createNewFile();

            if(flag==true)
            {
                JOptionPane.showMessageDialog(null, "File created successfully");
                PrintWriter writer = new PrintWriter(newfile, "UTF-8");
                //writer.println("The first line");
                //System.out.println();
                //writer.println(this.assemblyCode.toString());
                writer.println(this.data);
                writer.println(this.text);

                writer.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "File already exists");
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
