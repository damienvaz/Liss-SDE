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

    public void freeLastRegister(){
        int i = 0;
        while(this.register[i] != false && i<(this.register.length-1)){
            i++;
        }
        if(i<this.register.length){
            this.register[i-1] = false;
        }
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
        resetRegister();
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

        s.append("\tindexoutofbound: .asciiz \"Index out of bound. \" \n");
        s.append("\tline: .asciiz \"line: \" \n");
        s.append("\tnewline: .asciiz \"\\n\" \n");

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
        s.append("\tli $s0, "+line+"\t# "+ line + ":" + pos + "\n");
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
        s.append("\tli $s0, "+line+"\t# "+ line + ":" + pos + "\n");
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

    public String textWrite(String mipsCodeS,boolean write, int line, int pos){
        StringBuilder s = new StringBuilder();
        if(mipsCodeS != null) {
            s.append(mipsCodeS);

            String res[] = lastRegisterOccupied();
            String r0 = res[0];

            s.append("\tmove $a0, " + r0 + "\t\t# " + line + ":" + pos + "\n");
            if(write == true) {
                s.append("\tjal write\t\t# " + line + ":" + pos + "\n");
            }else if(write == false){
                s.append("\tjal writeln\t\t# " + line + ":" + pos + "\n");
            }
            freeLastRegister();
        }
        return s.toString();
    }

    public String textWriteMessage(boolean value){
        // if(value == true) => "write" ! Else "writeln" !
        StringBuilder s = new StringBuilder();

        s.append("\tli $v0, 1\n");
        s.append("\tsyscall\n");
        if(value == false){
            s.append("\tli $v0, 4\n");
            s.append("\tla $a0, newline\n");
            s.append("\tsyscall\n");
        }
        s.append("\tjr $ra\n");

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

        s.append("\tjal read\t\t# " + line + ":" + pos + "\n");
        String r0 = nextFreeRegister();
        s.append("\tmove "+r0+", $v0\t\t# " + line + ":" + pos +"\n");
        s.append(storeWord(variable,line,pos));

        return s.toString();
    }

    public String textReadFunction(){
        StringBuilder s = new StringBuilder();

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
        addLineInstruction("indexoutofboundError",indexOutOfBoundError());
        addLineInstruction("write",textWriteMessage(true));
        addLineInstruction("writeln",textWriteMessage(false));
        addLineInstruction("read",textReadFunction());
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
            default: //We don't need to implement sequences and sets normally because they are dinamics structure (not sure)
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
