package Visual.SintaxDirectedEditor;

import Application.SymbolTable.Int;
import com.sun.org.apache.xpath.internal.operations.Number;
import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.*;
import mars.MarsLaunch;
import netscape.javascript.JSObject;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class SyntaxDirectedEditor {
    private Scene scene;
    private Stage stage;
    private Scene sceneAbout=null;
    private Stage stageAbout=null;
    private final String title = "liss|SDE";
    private final double width = 600;
    private final double height = 400;
    private final double cX = 0.00, cY = 0.00;
    private String pathDirectory = null;


    public SyntaxDirectedEditor() throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sde.fxml"));
        AnchorPane page = fxmlLoader.load();
        scene = new Scene(page);
        scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(stageAbout!=null) {
                    System.out.println("mouse click detected! " + mouseEvent.getSource());
                    stageAbout.close();
                }
            }
        });

        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(this.title);

        //Maximize the menubar width with parent node
        //MenuBar mb = (MenuBar) scene.lookup("#menuBar");
        //mb.prefWidthProperty().bind(stage.widthProperty());

        //Set minimum width and height of the window
        stage.setMinWidth(width);
        stage.setMinHeight(height);

        //Maximize window
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        //Set coordinates of the window
        //stage.setY(cY);
        //stage.setX(cX);


        WebView wv = (WebView) fxmlLoader.getNamespace().get("tree");
        StackPane sp = (StackPane) fxmlLoader.getNamespace().get("code_editor");

        //Add Html file to WebEngine and set the context menu of the HTML file false
        File f = new File("resources/html/index.html");
        WebEngine we = wv.getEngine();
        we.setJavaScriptEnabled(true);

        //Add the RichText plugin to JavaFx application
        CodeArea codeArea = new CodeArea();
        //Add our proper css style to the codeArea
        File css = new File("resources/html/liss.css");
        codeArea.getStylesheets().add(css.toURI().toURL().toExternalForm());

        //Set Number to the CodeArea
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setEditable(false);
        codeArea.setStyle("-fx-font-size:15;");
        sp.getChildren().add(codeArea);
        codeArea.replaceText("undefined");
        codeArea.setStyleClass(0, 9, "warning");

        LissProgramVisual l = new LissProgramVisual(codeArea);
        //Creating a bridge for WebEngine to Java code application
        we.documentProperty().addListener((observable, oldValue, newValue) -> {
            //Comment about this piece of code: When a user want to create a new liss file, we must add this piece of code into the function addListener function.
            JSObject jsobj = (JSObject) we.executeScript("window");
            jsobj.setMember("liss", l);
        });

        we.load(f.toURI().toURL().toString());
        //we.executeScript("document.newTree");
        wv.setContextMenuEnabled(false);


        //When the "new menuitem" is clicked, then it must create
        MenuItem newMenuItem = (MenuItem) fxmlLoader.getNamespace().get("new");
        newMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+N")
        );
        newMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                pathDirectory = null;
                final WebEngine webEngine = wv.getEngine();
                webEngine .reload();
                webEngine.getLoadWorker().stateProperty().addListener(
                    new ChangeListener<Worker.State>() {
                        public void changed(ObservableValue ov, Worker.State oldState, Worker.State newState) {
                            if (newState == Worker.State.SUCCEEDED) {
                                JSObject jsobj = (JSObject) we.executeScript("window");
                                jsobj.setMember("liss", l);
                                //l.clear();
                                l.getTextArea().replaceText("undefined");
                                codeArea.setStyleClass(0, 9, "warning");
                            }
                        }
                    }
                );
            }
        });


        //When "load menuitem" is clicked, then it exits the program
        MenuItem loadMenuItem = (MenuItem) fxmlLoader.getNamespace().get("load");
        loadMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+L")
        );
        loadMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //System.out.println("Load button clicked...");

                //View for loading file
                DirectoryChooser chooser = new DirectoryChooser();
                chooser.setTitle("Open Project");
                File f = chooser.showDialog(stage);

                if(f!=null && f.isDirectory()){
                    pathDirectory = f.getAbsolutePath();
                    File build = new File(f.getAbsolutePath()+File.separator+f.getName()+".build");
                    //System.out.println(build.toString());
                    if(build.exists()){
                        try{
                            String res = "";
                            List<String> collect = Files.lines(build.toPath()).collect(Collectors.toList());
                            if(collect.size()==2){
                                int num = Integer.valueOf(collect.remove(0));
                                for (String s : collect) {
                                    res+=s;
                                }
                                l.setStateJsonLiss(num);//,tab);
                                we.executeScript("getStateJson()");
                                l.setJsonLiss(res);
                                //System.out.println(l.getJSON());

                                //wv.getEngine().reload();
                                JSObject jsobj = (JSObject) we.executeScript("window");
                                jsobj.setMember("liss", l);
                                we.executeScript("loadTreeJSON()");
                            }
                        }catch (IOException i){
                            i.printStackTrace();
                        }
                    }
                }
            }
        });

        //When "save menuitem" is clicked, then it exits the program
        MenuItem saveMenuItem = (MenuItem) fxmlLoader.getNamespace().get("save");
        saveMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+S")
        );
        saveMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String jsonString = (String) we.executeScript("saveTreeJSON()");
                String lissProgramString = (String) we.executeScript("getProgramLiss()");

                try {
                    if(pathDirectory==null || (!new File(pathDirectory).isDirectory())){
                        FileChooser saveFile = new FileChooser();
                        saveFile.setTitle("Save Project");
                        File f = saveFile.showSaveDialog(stage);
                        if(f!=null) {
                            File directory = new File(f.getAbsolutePath());
                            directory.mkdir();
                            pathDirectory = directory.getAbsolutePath();
                            Path pathBuild = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + f.getName() + ".build");
                            Path pathLiss = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + f.getName() + ".liss");

                            List<String> lines = Arrays.asList(jsonString);
                            Files.write(pathBuild, lines, Charset.forName("UTF-8"));
                            lines = Arrays.asList(lissProgramString);
                            Files.write(pathLiss, lines, Charset.forName("UTF-8"));
                        }
                    }else {
                        File directory = new File(pathDirectory);
                        Path pathBuild = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".build");
                        Path pathLiss = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".liss");

                        List<String> lines = Arrays.asList(jsonString);
                        Files.write(pathBuild, lines, Charset.forName("UTF-8"));
                        lines = Arrays.asList(lissProgramString);
                        Files.write(pathLiss, lines, Charset.forName("UTF-8"));
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });


        //When "quit menuitem" is clicked, then it exits the program
        MenuItem quitMenuItem = (MenuItem) fxmlLoader.getNamespace().get("quit");
        quitMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+Q")
        );
        quitMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Platform.exit();
            }
        });

        TextArea errorsTextArea = (TextArea)  fxmlLoader.getNamespace().get("errors_textarea");
        errorsTextArea.setWrapText(true);
        final int errorsTab = 0;
        TextArea outputTextArea = (TextArea)  fxmlLoader.getNamespace().get("compiler_textarea");
        final int compilerTab = 1;
        TabPane tabpane = (TabPane) fxmlLoader.getNamespace().get("tabpane");


        //When "run compiler menuitem" is clicked, then it runs the outputTextArea
        MenuItem runCompilerMenuItem = (MenuItem) fxmlLoader.getNamespace().get("run_compiler");
        runCompilerMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+SHIFT+C")
        );
        runCompilerMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                boolean validateLissProgram = (boolean) we.executeScript("validatingProgramLiss()");
                if(validateLissProgram){
                    outputTextArea.clear();
                    LocalTime hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String syntaxValidity = "Syntax validity : valid.\n";
                    String compilerMessage = "["+hour+"] "+syntaxValidity;
                    String messageRunningCompiler = "Running compiler...\n";
                    compilerMessage += "["+hour+"] "+messageRunningCompiler;
                    //Choose tab and add message.
                    if(tabpane.getSelectionModel().getSelectedIndex()==compilerTab){
                        outputTextArea.appendText(compilerMessage);
                    }else{
                        tabpane.getSelectionModel().select(compilerTab);
                        outputTextArea.appendText(compilerMessage);
                    }
                    try{
                        //create a temp file
                        File temp = File.createTempFile("temporaryLissFile", ".liss");
                        //System.out.println(temp.getAbsolutePath());
                        FileWriter fw = new FileWriter(temp.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);
                        // write in file
                        bw.write(l.getText());
                        // close connection
                        bw.close();

                        Application.Main m = new Application.Main();
                        String[] args = new String[1];
                        args[0] = temp.getAbsolutePath();
                        m.compile(args);
                        File tempAssembly = null;
                        if(!m.getTableError().toStringSDE().equals("")) {    //<----- checkar aqui
                            errorsTextArea.clear();
                            tabpane.getSelectionModel().select(errorsTab);
                            errorsTextArea.appendText(m.getTableError().toStringSDE());
                            hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                            String semanticError = "Compiler stopped. Verify informations in Errors tab of SDE.\n";
                            compilerMessage = "["+hour+"] "+semanticError;
                            outputTextArea.appendText(compilerMessage);
                        }else{
                            hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                            String compilerDone = "Compiler executed successfully.\n";
                            compilerMessage = "["+hour+"] "+compilerDone;
                            outputTextArea.appendText(compilerMessage);
                            //Save .asm file in directory. and output the message to
                            if(pathDirectory!=null){
                                File directory = new File(pathDirectory);
                                Path pathAsm = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".asm");

                                tempAssembly = pathAsm.toFile();

                                List<String> lines = Arrays.asList(m.getMips().getAssemblyCode());
                                Files.write(pathAsm, lines, Charset.forName("UTF-8"));

                                //Write output message to the Output Tab.
                                String savedAssemblyMessage = "Assembly file saved under the project:"+pathAsm.toString()+" .";
                                compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                outputTextArea.appendText(compilerMessage);
                            }else{
                                //PathDirectory is not set and FileChooserDialog must appear for saving purpose.
                                FileChooser saveFile = new FileChooser();

                                //Set extension Filter
                                FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ASM files (*.asm)", "*.asm");
                                saveFile.getExtensionFilters().add(extFilter);
                                saveFile.setTitle("Save Mips assembly code");

                                File f = saveFile.showSaveDialog(stage);
                                if(f!=null) {
                                    Path pathAsm = f.toPath();
                                    tempAssembly = pathAsm.toFile();

                                    List<String> lines = Arrays.asList(m.getMips().getAssemblyCode());
                                    Files.write(pathAsm, lines, Charset.forName("UTF-8"));

                                    //Write output message to the Output Tab.
                                    String savedAssemblyMessage = "Assembly file saved to this path: "+pathAsm.toString()+" .";
                                    compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                    outputTextArea.appendText(compilerMessage);
                                }
                            }
                        }

                    }catch(IOException exception){
                        exception.printStackTrace();

                    }


                }else{
                    LocalTime hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String syntaxValidity = "Syntax validity : invalid.\n";
                    String errorMessage = "["+hour+"] "+syntaxValidity;
                    hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String messageErrorNotCompletedLissProgram = "Liss program isn't complete, some \"undefined\" are left. Please, fix it.\n";
                    errorMessage += "["+hour+"] "+messageErrorNotCompletedLissProgram;
                    if(tabpane.getSelectionModel().getSelectedIndex()==errorsTab){
                        errorsTextArea.appendText(errorMessage);
                    }else{
                        tabpane.getSelectionModel().select(errorsTab);
                        errorsTextArea.appendText(errorMessage);
                    }
                }
            }
        });

        //When "run compilerandrunTextArea menuitem" is clicked, then it runs the outputTextArea
        MenuItem runProjectMenuItem = (MenuItem) fxmlLoader.getNamespace().get("run_project");
        runProjectMenuItem.setAccelerator(
                KeyCombination.keyCombination("SHORTCUT+SHIFT+R")
        );
        runProjectMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                boolean validateLissProgram = (boolean) we.executeScript("validatingProgramLiss()");
                if(validateLissProgram){
                    outputTextArea.clear();
                    LocalTime hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String syntaxValidity = "Syntax validity : valid.\n";
                    String compilerMessage = "["+hour+"] "+syntaxValidity;
                    String messageRunningCompiler = "Running compiler...\n";
                    compilerMessage += "["+hour+"] "+messageRunningCompiler;
                    //Choose tab and add message.
                    if(tabpane.getSelectionModel().getSelectedIndex()==compilerTab){
                        outputTextArea.appendText(compilerMessage);
                    }else{
                        tabpane.getSelectionModel().select(compilerTab);
                        outputTextArea.appendText(compilerMessage);
                    }
                    try{
                        //create a temp file
                        File temp = File.createTempFile("temporaryLissFile", ".liss");
                        //System.out.println(temp.getAbsolutePath());
                        FileWriter fw = new FileWriter(temp.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);
                        // write in file
                        bw.write(l.getText());
                        // close connection
                        bw.close();

                        Application.Main m = new Application.Main();
                        String[] args = new String[1];
                        args[0] = temp.getAbsolutePath();
                        m.compile(args);
                        File tempAssembly = null;
                        if(!m.getTableError().toStringSDE().equals("")) {    //<----- checkar aqui
                            errorsTextArea.clear();
                            tabpane.getSelectionModel().select(errorsTab);
                            errorsTextArea.appendText(m.getTableError().toStringSDE());
                            hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                            String semanticError = "Compiler stopped. Verify informations in Errors tab of SDE.\n";
                            compilerMessage = "["+hour+"] "+semanticError;
                            outputTextArea.appendText(compilerMessage);
                        }else{
                            hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                            String compilerDone = "Compiler executed successfully.\n";
                            compilerMessage = "["+hour+"] "+compilerDone;
                            outputTextArea.appendText(compilerMessage);

                            //Save .asm file in directory. and output the message to
                            if(pathDirectory!=null){
                                File directory = new File(pathDirectory);
                                Path pathAsm = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".asm");

                                tempAssembly = pathAsm.toFile();

                                List<String> lines = Arrays.asList(m.getMips().getAssemblyCode());
                                Files.write(pathAsm, lines, Charset.forName("UTF-8"));

                                //Write output message to the Output Tab.
                                String savedAssemblyMessage = "Assembly file saved to this path:"+pathAsm.toString()+" .\n";
                                compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                outputTextArea.appendText(compilerMessage);

                                //Write output message to the Output Tab
                                String executingMessage = "Executing program...\n";
                                compilerMessage = "["+hour+"] "+executingMessage;
                                outputTextArea.appendText(compilerMessage);

                                File marsSimulator = new File("resources/mars_simulator/Mars4_5.jar");
                                if(marsSimulator.exists() && temp.exists()){
                                    String output="";
                                    try {
                                         Process p = Runtime.getRuntime().exec(new String[]{"java","-jar",marsSimulator.getAbsolutePath(),tempAssembly.getAbsolutePath()});
//Testing an example of the outputstream with sending the number 3 to the file readInt.liss
//                                        OutputStream os = p.getOutputStream();

                                        //We need to make a window for the user to input those values !!!
//                                        os.write("3\n4\n".getBytes()); //See if it does work on windows !!!! probably \n\r or \r\n
//                                        os.flush();
//
//
//                                        p.waitFor();
                                        //p.getOutputStream();
//                                        InputStream is = p.getInputStream();
//
//
//
//                                        byte b[] = new byte[is.available()];
//                                        is.read(b, 0, b.length); // probably try b.length-1 or -2 to remove "new-line(s)"
//
//                                        output = new String(b);
//
//                                        is.close();
//                                        os.close();

                                        //Working under
                                        //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
                                        //BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

//                                        out.write("3\n"); // we need to put \n for every input asked
//                                        out.write("2\n");
//                                        out.flush();

//                                        String res;
//                                        String s = JOptionPane.showInputDialog("Hello:");
                                        /*while (( res = in.readLine())!=null) {
                                            //out.write("3\n");
                                            String s = JOptionPane.showInputDialog("Hello:");
                                            out.write(s+"\n");
                                            outputTextArea.appendText(res+"\n");
                                            //output += res+"\n";
                                            System.out.println(res);
                                        }*/




                                        //out.flush();

//                                        p.waitFor();

//                                     ##########################
//                                        InputStream inStream = p.getInputStream();
//                                        OutputStream ouStream = p.getOutputStream();

//                                        new Thread(new StreamGobbler("in", outputTextArea, inStream)).start();

//                                        ouStream.write("3\n".getBytes()); // we need to put \n for every input asked
//                                        ouStream.write("2\n".getBytes());
//                                        ouStream.flush();

//                                        out = new PrintStream(new BufferedOutputStream(ouStream));


//                                        p.waitFor();
//                                     #####################################################
                                        //TESTING MARS SIMULATOR

//                                        String answer = JOptionPane.showInputDialog(new JFrame("showInputDialog() Test"),
//                                                "What's you name?",
//                                                "Input Dialog Box", JOptionPane.INFORMATION_MESSAGE);
                                       // String test1= JOptionPane.showInputDialog("Please input mark for test 1: ");

//                                        String assemblyFile = tempAssembly.getAbsolutePath();
//                                        String[] argsMars = new String[]{assemblyFile};

                                        //Working actually
//                                        TextOutputStream out = new TextOutputStream(outputTextArea);
//                                        PrintStream p = new PrintStream(out);
//                                        System.setOut (p);
                                        //Not working...
                                        //TextInputStream in = new TextInputStream();
                                        //System.setIn(in);



                                        // 1. create the pipes
//                                        PipedInputStream inPipe = new PipedInputStream();
//                                        PipedInputStream outPipe = new PipedInputStream();

                                        // 2. set the System.in and System.out streams
//                                        System.setIn(inPipe);
//                                        System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));
//
//                                        PrintWriter inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);
//                                        console(outputTextArea,outPipe,inWriter);


                                        //This thread is used for calling the mars simulator !!! Otherwise it will block the main program !
//                                        Thread t = new Thread(new Runnable(){
//                                            public void run(){
//                                                MarsLaunch mars = new MarsLaunch(argsMars);
//                                            }
//                                        });
//                                        t.start();
//                                        if(!t.isAlive()){
//                                            t.join();
//                                            p.close();
//                                        }




                                        //Close System.in and System.out



                                        //It is working but quit the program..... Probably it is due to the command line !!! SOLVED !!!!!! FUCK YOU !!!!

//                                        MarsLaunch mars = new MarsLaunch(argsMars);

                                        //This code works like a charm
                                        //Thread t = new Thread(new Runnable(){
                                        //    public void run(){
                                        //        String test1 = JOptionPane.showInputDialog("Hello");
                                        //    }
                                        //});
                                        //t.start();
//                                        System.out.println(answer);
                                        //#################################################################################
                                        // The Observable object allowing to send the input lines to my external process
                                        ObservableStream out = new ObservableStream();
// Observer that simply sends to my external process line by line what we put in
// the variable output
                                        PrintWriter writer = new PrintWriter(p.getOutputStream(), true);
                                        out.addObserver(
                                                (o, arg) -> {
                                                    ObservableStream stream = (ObservableStream) o;
                                                    String line;
                                                    while ((line = stream.nextLine()) != null) {
                                                        writer.println(line);
                                                    }
                                                }
                                        );

                                        ObservableStream input = new ObservableStream();

                                        input.addObserver(
                                                (o, arg) -> {
                                                    ObservableStream stream = (ObservableStream) o;
                                                    String line;
                                                    while ((line = stream.nextLine()) != null) {
                                                        outputTextArea.appendText(line+"\n");
                                                    }
                                                }
                                        );

                                        // The thread that reads the standard output stream of the external process
// and put the lines into my variable input
                                        new Thread(
                                                () -> {
                                                    try (BufferedReader reader = new BufferedReader(
                                                            new InputStreamReader(p.getInputStream()))
                                                    ) {
                                                        String line;
                                                        while ((line = reader.readLine()) != null) {
                                                            input.addLine(line);
                                                        }
                                                    } catch (IOException e1) {
                                                        e1.printStackTrace();
                                                    }
                                                }
                                        ).start();


                                        new Thread(
                                                ()->{
                                                    while(p.isAlive()){
                                                        String res = input.getLine();
                                                        if(res!=null && res.equals("Enter integer value:")) {
//                                                            System.out.println("BLABLABLA> " + res);
                                                            //out.addLine("1");
                                                            boolean integerIsRequested=true;
                                                            Thread t=null;
                                                            while(integerIsRequested){
                                                                if(t==null) {
                                                                    t = new Thread(new Runnable() {
                                                                        public void run() {
                                                                            System.out.println("entrei aqui na thread do showinputdialog");
                                                                            String test1 = JOptionPane.showInputDialog("Enter Integer value:");
                                                                            while(!test1.matches("^\\d+$")){
                                                                                test1 = JOptionPane.showInputDialog("Enter a correct Integer value:");
                                                                            }
                                                                            Integer i = Integer.valueOf(test1);

                                                                            if (i != null) {
                                                                                System.out.println(test1);
                                                                                out.addLine(test1);
                                                                                System.out.println("passei por aqui");
                                                                                //return;
                                                                            }else{

                                                                            }
                                                                            System.out.println("acabei isto");
                                                                        }
                                                                    });
                                                                    t.start();

//                                                                    System.out.println(t.getState());

                                                                }
                                                                if(!t.isAlive()){
                                                                    integerIsRequested=false;
//                                                                    System.out.println("A thread morreu"+integerIsRequested);
                                                                }
//                                                                System.out.println("supostamente deveria ter um loop aqui...");
                                                            }
                                                        }
                                                    }
                                                    outputTextArea.appendText("Program executed\n");
//                                                    System.out.println("sai da thred");
                                                }
                                        ).start();



                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }
                                    //System.out.println(res);
                                    outputTextArea.appendText(output+"\n");

                                }else{
                                    //File doesnt exist  throw message!!
                                }
                            }else{
                                //PathDirectory is not set and FileChooserDialog must appear for saving purpose.
                                FileChooser saveFile = new FileChooser();

                                //Set extension Filter
                                FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ASM files (*.asm)", "*.asm");
                                saveFile.getExtensionFilters().add(extFilter);
                                saveFile.setTitle("Save Mips assembly code");

                                File f = saveFile.showSaveDialog(stage);
                                if(f!=null) {
                                    Path pathAsm = f.toPath();
                                    tempAssembly = pathAsm.toFile();

                                    List<String> lines = Arrays.asList(m.getMips().getAssemblyCode());
                                    Files.write(pathAsm, lines, Charset.forName("UTF-8"));

                                    //Write output message to the Output Tab.
                                    String savedAssemblyMessage = "Assembly file saved to this path: "+pathAsm.toString()+" .\n";
                                    compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                    outputTextArea.appendText(compilerMessage);

                                    //Write output message to the Output Tab
                                    String executingMessage = "Executing program...\n";
                                    compilerMessage = "["+hour+"] "+executingMessage;
                                    outputTextArea.appendText(compilerMessage);

                                    File marsSimulator = new File("resources/mars_simulator/Mars4_5.jar");
                                    if(marsSimulator.exists() && temp.exists()){
                                        String res="";
                                        try {
                                            Process p = Runtime.getRuntime().exec(new String[]{"java","-jar",marsSimulator.getAbsolutePath(),tempAssembly.getAbsolutePath()});
                                            p.waitFor();

                                            InputStream is = p.getInputStream();

                                            byte b[] = new byte[is.available()];
                                            is.read(b, 0, b.length); // probably try b.length-1 or -2 to remove "new-line(s)"

                                            res = new String(b);

                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }
                                        //System.out.println(res);
                                        outputTextArea.appendText(res+"\n");


                                    }else{
                                        //File doesnt exist !!
                                    }
                                }
                            }
                        }

                    }catch(IOException exception){
                        exception.printStackTrace();

                    }


                }else{
                    LocalTime hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String syntaxValidity = "Syntax validity : invalid.\n";
                    String errorMessage = "["+hour+"] "+syntaxValidity;
                    hour = ZonedDateTime.now().toLocalTime().truncatedTo(ChronoUnit.SECONDS);
                    String messageErrorNotCompletedLissProgram = "Liss program isn't complete, some \"undefined\" are left. Please, fix it.\n";
                    errorMessage += "["+hour+"] "+messageErrorNotCompletedLissProgram;
                    if(tabpane.getSelectionModel().getSelectedIndex()==errorsTab){
                        errorsTextArea.appendText(errorMessage);
                    }else{
                        tabpane.getSelectionModel().select(errorsTab);
                        errorsTextArea.appendText(errorMessage);
                    }
                }
            }
        });

        //When "overviewmenuitem" is clicked, then it show a Pane
        MenuItem overviewMenuItem = ( MenuItem) fxmlLoader.getNamespace().get("overview");
        overviewMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FXMLLoader fxmlLoaderAbout = new FXMLLoader(getClass().getResource("Overview.fxml"));
                AnchorPane anchorPane = null;

                try {
                    anchorPane = fxmlLoaderAbout.load();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                if(anchorPane != null){
                    Scene s = new Scene(anchorPane);
                    Stage st = new Stage();
                    st.setTitle("Overview");
                    st.setScene(s);
                    st.show();
                }
            }
        });

        //When "aboutmenuitem" is clicked, then it show a Pane
        MenuItem aboutMenuItem = (MenuItem) fxmlLoader.getNamespace().get("about_liss_sde");
        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e) {
               FXMLLoader fxmlLoaderAbout = new FXMLLoader(getClass().getResource("about.fxml"));
               Pane pagePane = null;
               try {
                   pagePane = fxmlLoaderAbout.load();
               } catch (IOException e1) {
                   e1.printStackTrace();
               }
               if(sceneAbout==null && stageAbout==null) {
                   ImageView i = (ImageView) fxmlLoaderAbout.getNamespace().get("liss_sde_logo");
                   File f = new File("resources/images/about.png");
                   //System.out.println(f.toURI().toURL().toString());
                   Image t = null;
                   try {
                       t = new Image(f.toURI().toURL().toString());
                   } catch (MalformedURLException e1) {
                       e1.printStackTrace();
                   }
                   i.setImage(t);
                   sceneAbout = new Scene(pagePane);
                   stageAbout = new Stage();
                   stageAbout.initStyle(StageStyle.UNDECORATED);
                   stageAbout.setScene(sceneAbout);
                   stageAbout.show();
                   //Add click event on the scene for closing the whole scene
                   sceneAbout.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                       @Override
                       public void handle(MouseEvent mouseEvent) {
                           System.out.println("mouse click detected! " + mouseEvent.getSource());
                           stageAbout.close();
                       }
                   });
               }else{
                   stageAbout.show();
               }
           }
        });

        stage.show();
    }

    public static void console(TextArea t, final InputStream out, final PrintWriter in) {
        final TextArea area = t;

        // handle "System.out"
        new SwingWorker<Void, String>() {
            @Override protected Void doInBackground() throws Exception {
                Scanner s = new Scanner(out);
                while (s.hasNextLine()) publish(s.nextLine() + "\n");
                return null;
            }
            @Override protected void process(List<String> chunks) {
                for (String line : chunks) area.appendText(line);
            }
        }.execute();

        // handle "System.in"
        /*area.setOnKeyPressed(new EventHandler<KeyEvent>() {
            private StringBuffer line = new StringBuffer();
            @Override
            public void handle(KeyEvent keyEvent) {
                String c = keyEvent.getCharacter();
                if (keyEvent.getCode() == KeyCode.ENTER)  {
                    //String text = area.getText();
                    System.out.println("GAY");
                    //in.println(line);
                    //line.setLength(0);
                    // do your thing...

                    // clear text
                    //area.setText("");
                }
            }
        });*/


        /*area.addKeyListener(new KeyAdapter() {
            private StringBuffer line = new StringBuffer();
            @Override public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == KeyEvent.VK_ENTER) {
                    in.println(line);
                    line.setLength(0);
                } else if (c == KeyEvent.VK_BACK_SPACE) {
                    line.setLength(line.length() - 1);
                } else if (!Character.isISOControl(c)) {
                    line.append(e.getKeyChar());
                }
            }
        });*/
    }
}

class ObservableStream extends Observable {
    private final Queue<String> lines = new ConcurrentLinkedQueue<>();

    public void addLine(String line) {
        lines.add(line);
        setChanged();
        notifyObservers();
    }

    public String nextLine() {
        return lines.poll();
    }

    public String getLine(){return lines.peek();}
}