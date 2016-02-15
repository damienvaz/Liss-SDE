package Visual.SintaxDirectedEditor;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

/**
 * Created by damienvaz on 14/01/16.
 */
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

        //scene = new Scene(FXMLLoader.load(getClass().getResource("sde.fxml")));
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

        //Add the RichText plugin to JavaFx application
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setEditable(false);
        codeArea.setStyle("-fx-font-size:15;");
        sp.getChildren().add(codeArea);

        //ap.setLeftAnchor(codeArea,0.00);



        String url = getClass().getResource("index.html").toExternalForm();
        WebEngine we = wv.getEngine();
        we.setJavaScriptEnabled(true);
        we.load(url);

        //Creating a bridge for WebEngine to Java code application
        JSObject jsobj = (JSObject) we.executeScript("window");
        jsobj.setMember("liss",new LissProgram(codeArea));


        stage.show();
    }

}


