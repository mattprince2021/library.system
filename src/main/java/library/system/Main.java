package library.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login_screen.fxml"));

        Scene scene = new Scene(root,994,697);

        primaryStage.setTitle("Prince Library");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
