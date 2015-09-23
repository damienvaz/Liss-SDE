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
    private LinkedList<Integer> counterJumpStack;   //A stack which will handle the IF/WHILE statement behavior
    private Integer counterJump;                    //A counter for the IF/WHILE statement behavior

    public Mips(){
        this.data = ".data\n";
        this.text = ".text\n  main:\n";
        this.register = new boolean[8];
        for(int i=0; i<this.register.length;i++){
            this.register[i] = false;
        }
        this.registerName = new String[8];
        this.registerName[0] = "$t0";
        this.registerName[1] = "$t1";
        this.registerName[2] = "$t2";
        this.registerName[3] = "$t3";
        this.registerName[4] = "$t4";
        this.registerName[5] = "$t5";
        this.registerName[6] = "$t6";
        this.registerName[7] = "$t7";

        this.counterJump = new Integer(0);
        this.counterJumpStack = new LinkedList<>();

    }


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
            //System.out.println("registerName["+i+"] : "+this.register[i]+" line:"+l+" pos:"+p);
            i++;
        }

        //System.out.println("*END* registerName["+i+"] : "+this.register[i]+" line:"+l+" pos:"+p);

        if(i<this.register.length){
            res = this.registerName[i];
            this.register[i]=true;
        }
        return res;
    }

    public void freeLastRegister(){
        int i = 0;
        while(this.register[i] != false && i<(this.register.length-1)){
            //System.out.println(this.register[i]);
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
        //res[0] = this.registerName[i-2];
        return res;
    }

    public void addDataInstruction(String name, String instruction){
        this.data +="\t"+name+" : "+instruction;
    }

    public void addDataInstruction(String instruction){ this.data += instruction;}

    public void addLineInstruction(String name, String instruction){
        this.text += "  "+name+": \n"+instruction;
    }

    public void addTextInstruction(String instruction){
        this.text += instruction;
    }

    public String storeWordArray(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        String r[] = lastTwoRegisterOccupied();
        resetRegister();
        s.append("\tsw "+r[0]+", "+name+"("+r[1]+")\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String storeWordArrayText(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        String r[] = lastTwoRegisterOccupied();
        resetRegister();
        s.append("\tsw "+r[1]+", "+name+"("+r[0]+")\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String loadWordArray(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
        //String r[] = lastTwoRegisterOccupied();
        String r[] = lastRegisterOccupied();
        //resetRegister();
        //freeLastRegister();
        s.append("\tlw "+r[0]+", "+name+"("+r[0]+")\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String storeWord(String name, int line, int pos){
        StringBuilder s = new StringBuilder();
            String r[] = lastRegisterOccupied();
            resetRegister();
            s.append("\tsw "+r[0]+", "+name+"\t\t# "+line+":"+pos+"\n");
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
            Integer res = value*4;
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
            //s.append(".byte 1\t\t# " + line + ":" + pos + "\n");
            s.append(".word 1\t\t# " + line + ":" + pos + "\n");
        } else if (b == false) {
            //s.append(".byte 0\t\t# " + line + ":" + pos + "\n");
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
            //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textDiv(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tdiv "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textAdd(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tadd "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textSub(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tsub "+r0+", "+r0+", "+r1+"\t# " + line + ":" + pos + "\n");
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

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
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

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
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textOr(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tor " + r0 + ", " + r0 + ", " + r1 + "\t# " + line + ":" + pos + "\n");
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textAnd(int line, int pos){
        StringBuilder s = new StringBuilder();
        String res[] = lastTwoRegisterOccupied();
        String r0 = res[0];
        String r1 = res[1];

        freeLastRegister();
        s.append("\tand " + r0 + ", " + r0 + ", " + r1 + "\t# " + line + ":" + pos + "\n");
        //s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");

        return s.toString();
    }

    public String textNot(int line,int pos){
        StringBuilder s = new StringBuilder();

        //String res[] = lastRegisterOccupied();
        //String r0 = res[0];

        //freeLastRegister();

        //process for calculating the not instruction in MIPS
        //s.append(loadImmediateWord(r0, line, pos));
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
        // s.append(textNot(line,pos));
        //s.append("\tbeqz "+free+", line"+line+"indexoutofbound\t# " + line + ":" + pos + "\n");
        //s.append("\tla $a3, line"+(line+1)+"\t# "+ line + ":" + pos + "\n");
        s.append("\tli $s0, "+line+"\t# "+ line + ":" + pos + "\n");
        s.append("\tbeqz "+free+", indexoutofboundError\t# " + line + ":" + pos + "\n");


        //s.append("\tla $a3, line"+(line+1)+"\t# "+ line + ":" + pos + "\n");
        //s.append("\tbeqz "+free+", indexoutofboundError\t# " + line + ":" + pos + "\n");

        s.append("\t####End of the verification####\n");

        freeLastRegister();
        freeLastRegister();

        return s.toString();
    }

    public String indexOutOfBoundError(int line){
        StringBuilder s = new StringBuilder();

        //s.append("indexoutofboundError: \n");
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
        s.append(exitProgram(line)); //Necessary due to an error of index ! So it must quit !

        return s.toString();
    }

    public String exitProgram(int line){
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

    public String textWhile(String mipsCodeS, int line, int pos){
        StringBuilder s = new StringBuilder();

        if(mipsCodeS != null) {
            this.counterJump++;
            this.counterJumpStack.push(this.counterJump);
            Integer i = this.counterJumpStack.getFirst();

            s.append("  while"+i.toString()+":\t\t# " + line + ":" + pos + "\n");
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

    public String textWhileExit(int line, int pos){
        StringBuilder s = new StringBuilder();

        Integer i = this.counterJumpStack.getFirst();

        s.append("\tj while" + i.toString() + "\t\t# " + line + ":" + pos + "\n");
        s.append("  while_exit"+i.toString()+":\t\t# " + line + ":" + pos + "\n");


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

    public String textWriteMessage(boolean value, int line){
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

    public String textForCondition(boolean inArray, String variable, String array, String mipsCodeS, boolean stepUp, int line, int pos){
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
                s.append(loadWordArray(array, line, pos));
                s.append(storeWord(variable,line,pos));
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

    public String textForSatisfyingEnd(int line, int pos){
        StringBuilder s = new StringBuilder();

        if(this.counterJumpStack.size()>0) {
            Integer i = this.counterJumpStack.getFirst();
            s.append(" satisfying_exit"+i.toString()+":\n");
        }else{
            //Print error of stack empty

        }

        return s.toString();
    }

    public String textForInit(boolean inArray,String variable, String mipsCodeS, int line, int pos){
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
            s.append(storeWord(variable, line, pos));
        }
        s.append("  for_loop" + i.toString()+":\n");
        if(inArray == true) {
            s.append(loadWord("for_var" + i.toString(), line, pos));
        }else {
            s.append(loadWord(variable, line, pos));
        }

        return s.toString();
    }

    public String textForStep(String variable, boolean inArray, boolean stepUp, String stepValue, int line, int pos){
        StringBuilder s = new StringBuilder();

        Integer i = this.counterJumpStack.getFirst();

        if(inArray == true){
            s.append(loadWord("for_var"+i.toString(), line, pos));
            s.append(loadImmediateWord("4", line, pos));
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
                s.append(storeWord(variable, line, pos));
                s.append("\tj for_loop"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            } else if(stepUp == false){
                s.append(loadWord(variable, line, pos));
                s.append(loadImmediateWord(stepValue, line, pos));
                s.append(textSub(line, pos));
                s.append(storeWord(variable,line,pos));
                s.append("\tj for_loop"+i.toString()+"\t\t# " + line + ":" + pos + "\n");
            }
        }
        s.append("  for_exit"+i.toString()+":\n");
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

    public void removeLastStack(){
        if(this.counterJumpStack.size()>0) {
            this.counterJumpStack.pop();
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
                for(String var : vars.keySet()){
                    HashMap<String,Object> info = vars.get(var);
                    Integer res = new Integer(1);
                    for(Integer i : (ArrayList<Integer>) info.get("dimension")){
                        res = res*i;
                    }

                    //System.out.println(res+" wooooooot");
                    String s = (String) dataArray(res, (int) info.get("line"), (int) info.get("pos"));
                    //String s = (String) info.get("mips");
                    addDataInstruction(var, s);
                    /*if(s != null){
                        addDataInstruction(var, s);
                    }else if(s==null){
                        addDataInstruction(var,dataBoolean(false,(int)info.get("line"),(int)info.get("pos")));
                    }*/
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
