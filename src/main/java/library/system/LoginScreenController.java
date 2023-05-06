package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginScreenController
{
    @FXML private Text actionTarget;
    @FXML private Button loginButton;

    @FXML private TextField userNameEntry;

    @FXML
    protected void loginButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        Parent root = loader.load();

        HomeScreenController homeScreenController = loader.getController();

        Scene changedSceneHome = new Scene(root, 994,697);

        Stage stage = (Stage) loginButton.getScene().getWindow();

        stage.setScene(changedSceneHome);
        stage.show();

    }
}