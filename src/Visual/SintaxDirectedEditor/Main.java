package Visual.SintaxDirectedEditor;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import java.io.File;

public class Main {
    private Scene scene;
    private Stage stage;
    private final String title = "liss | SDE";
    private final double width = 600;
    private final double height = 400;
    private final double cX = 0.00, cY = 0.00;


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
        File f = new File("ressources/html/index.html");
        WebEngine we = wv.getEngine();
        we.setJavaScriptEnabled(true);
        we.load(f.toURI().toURL().toString());
        wv.setContextMenuEnabled(false);

        //Add the RichText plugin to JavaFx application
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setEditable(false);
        codeArea.setStyle("-fx-font-size:15;");
        sp.getChildren().add(codeArea);

        //Creating a bridge for WebEngine to Java code application
        we.documentProperty().addListener((observable, oldValue, newValue) -> {
            //Comment about this piece of code: When a user want to create a new liss file, we must add this piece of code into the function addListener function.
            JSObject jsobj = (JSObject) we.executeScript("window");
            LissProgram l = new LissProgram(codeArea);
            jsobj.setMember("liss", l);
        });

        //When "close menuitem" is clicked, then it exits the program
        MenuItem closeMenuItem = (MenuItem) fxmlLoader.getNamespace().get("close");
        closeMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Platform.exit();
            }
        });

        //When the "new menuitem" is clicked, then it must create
        MenuItem newMenuItem = (MenuItem) fxmlLoader.getNamespace().get("new");
        newMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                wv.getEngine().reload();
                codeArea.replaceText("");
            }
        });


        stage.show();
    }

}


