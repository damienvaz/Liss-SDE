package Visual.SintaxDirectedEditor;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private Scene scene;
    private Stage stage;
    private final String title = "liss | SDE";
    private final double width = 600;
    private final double height = 400;
    private final double cX = 0.00, cY = 0.00;
    private String pathDirectory = null;


    public Main() throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sde.fxml"));
        AnchorPane page = (AnchorPane) fxmlLoader.load();
        scene = new Scene(page);

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
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setEditable(false);
        codeArea.setStyle("-fx-font-size:15;");
        sp.getChildren().add(codeArea);

        LissProgram l = new LissProgram(codeArea);
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
                wv.getEngine().reload();
                JSObject jsobj = (JSObject) we.executeScript("window");
                //LissProgram l = new LissProgram(codeArea);
                jsobj.setMember("liss", l);
                codeArea.replaceText("");
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
                            if(collect.size()==3){
                                int num = Integer.valueOf(collect.remove(0));
                                int tab = Integer.valueOf(collect.remove(0));
                                for (String s : collect) {
                                    res+=s;
                                }
                                l.setStateJsonLiss(num,tab);
                                we.executeScript("getStateJson()");
                                l.setJsonLiss(res);
                                System.out.println(l.getJSON());

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
                            Path pathLiss = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + f.getName() + ".liss");   //pathJson = pathJson.resolveSibling(pathJson.getFileName() + ".json");

                            List<String> lines = Arrays.asList(jsonString);
                            Files.write(pathBuild, lines, Charset.forName("UTF-8"));
                            lines = Arrays.asList(lissProgramString);
                            Files.write(pathLiss, lines, Charset.forName("UTF-8"));
                        }
                    }else {
                        File directory = new File(pathDirectory);
                        Path pathBuild = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".build");
                        Path pathLiss = directory.toPath().resolveSibling(directory.toPath().toString() + File.separator + directory.getName() + ".liss");   //pathJson = pathJson.resolveSibling(pathJson.getFileName() + ".json");

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
                //System.setProperty("apple.eawt.quitStrategy", "CLOSE_ALL_WINDOWS");
            }
        });


        stage.show();
    }

}


