package Visual.SintaxDirectedEditor;

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
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.*;
import netscape.javascript.JSObject;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SyntaxDirectedEditor {
    private Scene scene;
    private Stage stage;
    private Scene sceneAbout=null;
    private Stage stageAbout=null;
    private final String title = "liss | SDE";
    private final double width = 600;
    private final double height = 400;
    private final double cX = 0.00, cY = 0.00;
    private String pathDirectory = null;


    public SyntaxDirectedEditor() throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sde.fxml"));
        AnchorPane page = (AnchorPane) fxmlLoader.load();
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


        //When "run outputTextArea menuitem" is clicked, then it runs the outputTextArea
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
                                String savedAssemblyMessage = " Assembly file saved under the project:"+pathAsm.toString()+" .";
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
                                    String savedAssemblyMessage = " Assembly file saved to this path: "+pathAsm.toString()+" .";
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
                                String savedAssemblyMessage = " Assembly file saved under the project:"+pathAsm.toString()+" .\n";
                                compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                outputTextArea.appendText(compilerMessage);

                                File marsSimulator = new File("resources/mars_simulator/Mars4_5.jar");
                                if(marsSimulator.exists() && temp.exists()){
                                    String res="";

                                    try {
                                        Process p = Runtime.getRuntime().exec("java -jar "+marsSimulator.getAbsolutePath()+" "+tempAssembly.getAbsolutePath());
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
                                    String savedAssemblyMessage = " Assembly file saved to this path: "+pathAsm.toString()+" .\n";
                                    compilerMessage = "["+hour+"] "+savedAssemblyMessage;
                                    outputTextArea.appendText(compilerMessage);


                                    File marsSimulator = new File("resources/mars_simulator/Mars4_5.jar");
                                    if(marsSimulator.exists() && temp.exists()){
                                        String res="";

                                        try {
                                            Process p = Runtime.getRuntime().exec("java -jar "+marsSimulator.getAbsolutePath()+" "+tempAssembly.getAbsolutePath());
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

        //When "run compilerandrunTextArea menuitem" is clicked, then it runs the outputTextArea
        MenuItem aboutMenuItem = (MenuItem) fxmlLoader.getNamespace().get("about_liss_sde");
        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent e) {
               FXMLLoader fxmlLoaderAbout = new FXMLLoader(getClass().getResource("about.fxml"));
               Pane pagePane = null;
               try {
                   pagePane = (Pane) fxmlLoaderAbout.load();
               } catch (IOException e1) {
                   e1.printStackTrace();
               }
               if(sceneAbout==null && stageAbout==null) {
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

}


