package library.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * This program functions Stocking a variety of media, including books, music CDs, TV and film DVDs and Blu-rays, the
 * library requires a digitised stock management system to integrate with a front-end UI. In addition, user accounts
 * are also to be digitised to enable loan assignments against user accounts.
 *
 * @author matthewprince
 * @version 1.0
 */
public class Main extends Application {
    public static List<Stage> stageval = new ArrayList<Stage>();
    public static List<String> fxmlval = new ArrayList<String>();

    /**
     * Initiates the Login Screen
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login_screen.fxml"));

        Scene scene = new Scene(root, 994, 697);

        primaryStage.setTitle("Prince Library");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
