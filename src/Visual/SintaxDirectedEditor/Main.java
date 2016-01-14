package Visual.SintaxDirectedEditor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

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


    public Main() throws Exception{
        scene = new Scene(FXMLLoader.load(getClass().getResource("sde.fxml")));
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(this.title);

        //Maximize the menubar width with parent node
        MenuBar mb = (MenuBar) scene.lookup("#menuBar");
        mb.prefWidthProperty().bind(stage.widthProperty());

        //Set minimum width and height of the window
        stage.setMinWidth(width);
        stage.setMinHeight(height);

        //Set coordinates of the window
        stage.setY(cY);
        stage.setX(cX);

        stage.show();
    }

}
