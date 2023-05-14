package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable {
    @FXML
    private TextField firstNameTextEntry;
    @FXML
    private TextField lastNameTextEntry;
    @FXML
    private PasswordField pinEntry;
    @FXML
    private Button loginButton;
    @FXML
    private Button cancelLoginButton;


    @FXML
    protected void cancelLoginButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) cancelLoginButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void loginButtonAction(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        Parent root = loader.load();

        HomeScreenController homeScreenController = loader.getController();

        Scene changedSceneHome = new Scene(root, 994, 697);

        Stage stage = (Stage) loginButton.getScene().getWindow();

        stage.setScene(changedSceneHome);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
//    public void validateLogin(){
//        DatabaseConnection connectNow = new DatabaseConnection();
//        Connection connectDB = connectNow.getConnection();
//
//        String verifyLogin = "SELECT count(1) FROM user WHERE firstName = '" + firstNameTextEntry.getText()
//                + "' AND lastName = '" + lastNameTextEntry.getText() + "' AND passwordPIN = '" + pinEntry + "'";
//    }

}