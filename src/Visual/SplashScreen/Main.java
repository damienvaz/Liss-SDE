package Visual.SplashScreen;/**
 * Created by damienvaz on 13/01/16.
 */

import Visual.SintaxDirectedEditor.SyntaxDirectedEditor;
import com.sun.xml.internal.ws.api.ResourceLoader;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.Console;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class Main extends Application {

    public static void main(String[] args){
        //Check if the application is called by console or not.
        if(System.console()!=null){
            System.out.println("Please, do not use the console for launching the application.");
            Platform.exit();
            System.exit(0);
        }else {
            launch(args);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Double versionOfJava=null;
        try{
            versionOfJava = getVersionOfJava();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        //Check link for vesion of java: http://www.oracle.com/technetwork/java/javase/jdk7-naming-418744.html
        if(versionOfJava==null || versionOfJava<1.8065){
            System.out.println("Version: "+versionOfJava);

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Java version");
            alert.setContentText("Please, update to the latest java version!");
            alert.showAndWait();

            Platform.exit();
            System.exit(0);

        }else {
            //Get the View of the splashscreen from JavaFX Scene Builder
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("splashscreen.fxml"));
            Parent root = fxmlLoader.load();
            //Parent root = FXMLLoader.load(getClass().getResource("splashscreen.fxml"));
            ImageView i = (ImageView) fxmlLoader.getNamespace().get("splash_logo");

            Image t = new Image("/images/liss.png");
            i.setImage(t);

            Scene s = new Scene(root);

            //Get the resolution of the screen PC
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            int X = (toolkit.getScreenSize().width);
            int Y = (toolkit.getScreenSize().height);

            //Get the  pixels of the screen middle resolution
            int cX = (toolkit.getScreenSize().width / 2) - ((int) ((ImageView) s.lookup("#splash_logo")).getFitWidth()) / 2;
            int cY = (toolkit.getScreenSize().height / 2) - ((int) ((ImageView) s.lookup("#splash_logo")).getFitHeight() / 2);

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

    private Double getVersionOfJava(){
        String[] arrayVersionOfJava = System.getProperty("java.version").split("(\\.|\\_)");
        String temporaryVersionOfJava = new String();
        for (int i = 0; i < arrayVersionOfJava.length; i++) {
            if(i==1){
                temporaryVersionOfJava += "."+arrayVersionOfJava[i];
            }else{
                temporaryVersionOfJava += arrayVersionOfJava[i];
            }
        }

        return Double.valueOf(temporaryVersionOfJava);
    }
}
