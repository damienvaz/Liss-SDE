package Visual.SplashScreen;/**
 * Created by damienvaz on 13/01/16.
 */

import Visual.SintaxDirectedEditor.SyntaxDirectedEditor;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Get the View of the splashscreen from JavaFX Scene Builder
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("splashscreen.fxml"));
        Parent root = fxmlLoader.load();
        //Parent root = FXMLLoader.load(getClass().getResource("splashscreen.fxml"));
        ImageView i = (ImageView) fxmlLoader.getNamespace().get("splash_logo");
        File f = new File("resources/images/liss.png");
        //System.out.println(f.toURI().toURL().toString());
        Image t = new Image(f.toURI().toURL().toString());
        i.setImage(t);
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
                SyntaxDirectedEditor sde = new SyntaxDirectedEditor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pause.play();
    }
}
