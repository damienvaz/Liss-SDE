package Visual.SplashScreen;/**
 * Created by damienvaz on 13/01/16.
 */

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Get the View of the splashscreen from JavaFX Scene Builder
        Parent root = FXMLLoader.load(getClass().getResource("splashscreen.fxml"));
        Scene s = new Scene(root);

        //Get the resolution of the screen PC
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int X = (toolkit.getScreenSize().width);
        int Y = (toolkit.getScreenSize().height);

        //Get the  pixels of the screen middle resolution
        int cX = (toolkit.getScreenSize().width / 2) - ((int)((ImageView) s.lookup("#splash_logo")).getFitWidth())/2;
        int cY = (toolkit.getScreenSize().height / 2) - ((int)((ImageView) s.lookup("#splash_logo")).getFitHeight()/2);

        //Set the position of Stage to middle
        primaryStage.setX(cX);
        primaryStage.setY(cY);


        primaryStage.setScene(s);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);

        //Show the splashscreen to screen
        primaryStage.show();

        //Make a Pause to the splashscreen transition
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            primaryStage.hide();
            Platform.setImplicitExit(false);
            try {
                Visual.SintaxDirectedEditor.Main sde = new Visual.SintaxDirectedEditor.Main();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pause.play();
    }
}
