package Visual.SintaxDirectedEditor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * Created by damienvaz on 13/01/16.
 */
public class Controller {

    public final Parent getParent() throws Exception{
        return FXMLLoader.load(getClass().getResource("sde.fxml"));
    }
}
