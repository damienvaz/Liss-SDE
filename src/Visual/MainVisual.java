package Visual;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Created by damienvaz on 12/01/16.
 */
public class MainVisual extends Application{

    private Pane splashLayout;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void init(){
        ImageView splashImage = new ImageView(new Image(
                MainVisual.class.getResource("/Images/liss.png").toExternalForm()
        ));
        splashLayout = new VBox();
        splashLayout.getChildren().addAll(splashImage);
        /*splashLayout.setStyle(
                "-fx-padding: 5; " +
                        "-fx-background-color: cornsilk; " +
                        "-fx-border-width:5; " +
                        "-fx-border-color: " +
                        "linear-gradient(" +
                        "to bottom, " +
                        "chocolate, " +
                        "derive(chocolate, 50%)" +
                        ");"
        );*/
        splashLayout.setEffect(new DropShadow());
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("LiSS");

        showSplash(primaryStage);
        //Thread.sleep(400);
    }

    private void showSplash(Stage primaryStage){

        Scene splashScene = new Scene(splashLayout);
        final Rectangle2D bounds = Screen.getPrimary().getBounds();
        primaryStage.setScene(splashScene);
        primaryStage.show();
    }
}
