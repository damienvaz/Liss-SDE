package Application;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by damienvaz on 6/5/15.
 */
public class Mips {
    private String data;
    private String text;
    private boolean[] register;
    private String[] registerName;

    public Mips(){
        this.data = ".data\n";
        this.text = ".text\n  main:\n";
        this.register = new boolean[8];
        for(int i=0; i<this.register.length;i++){
            this.register[i] = false;
            //System.out.print(this.register[i]+" ");
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

    }


    public void resetRegister(){
        int i=0;
        while(this.register[i]==true){
            this.register[i]=false;
            i++;
        }
    }

    public String nextFreeRegister(){
        String res = null;
        int i = 0;
        while(this.register[i] != false && i<this.register.length){
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
        while(this.register[i] != false && i<this.register.length){
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
            while(this.register[i]==true && i<this.register.length){
                i++;
            }
            res[1] = this.registerName[i-1];
            res[0] = this.registerName[i-2];
        return res;
    }

    public String[] lastRegisterOccupied(){
        String res[] = new String[1];
        int i = 0;
        while(this.register[i]==true && i<this.register.length){
            i++;
        }
        res[0] = this.registerName[i-1];
        //res[0] = this.registerName[i-2];
        return res;
    }

    public void addDataInstruction(String name, String instruction){
        this.data +="\t"+name+" : "+instruction;
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
            //System.out.println(register+" woot");
            s.append("\tli "+register+","+value+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String loadWord(String value,int line, int pos){
        StringBuilder s = new StringBuilder();
        String register = nextFreeRegister();
        s.append("\tlw "+register+","+value+"\t\t# "+line+":"+pos+"\n");
        return s.toString();
    }

    public String dataBoolean(boolean b, int line, int pos){
        StringBuilder s = new StringBuilder();
            if(b==true) {
                //s.append(".byte 1\t\t# " + line + ":" + pos + "\n");
                s.append(".word 1\t\t# " + line + ":" + pos + "\n");
            }else if(b==false){
                //s.append(".byte 0\t\t# " + line + ":" + pos + "\n");
                s.append(".word 0\t\t# " + line + ":" + pos + "\n");
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
        /*switch (type){
            case "integer":
                addTextInstruction(instruction);
                //addTextInstruction(storeWord(name, line, pos));
                break;
            default:
                break;
        }*/
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
