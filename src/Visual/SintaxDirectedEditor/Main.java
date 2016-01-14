package Visual.SintaxDirectedEditor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by damienvaz on 14/01/16.
 */
public class Main {
    private Scene scene;
    private Stage stage;


    public Main() throws Exception{
        scene = new Scene(FXMLLoader.load(getClass().getResource("sde.fxml")));
        stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
