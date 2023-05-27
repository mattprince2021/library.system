package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
/**
 * This controller functions to take the user to the selected scene appropriate for the function that they are
 * completing. Included are buttons for each scene and a button to exit the program.
 *
 * @author matthewprince
 * @version 1.0
 */
public class HomeScreenController {
    @FXML
    private Label welcomeMessage;
    @FXML
    private Button addBookButton;
    @FXML
    private Button editBookButton;
    @FXML
    private Button addMusicButton;
    @FXML
    private Button editMusicButton;
    @FXML
    private Button addGamesButton;
    @FXML
    private Button editGamesButton;
    @FXML
    private Button addFilmButton;
    @FXML
    private Button editFilmButton;
    @FXML
    private Button addTableButton;
    @FXML
    private Button editTableButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button addUserButton;
    @FXML
    private Button editUserButton;
    /**
     * Routes the user to the Add Book scene
     */
    @FXML
    protected void addBookButtonAction(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBook.fxml"));
        Parent root = loader.load();

        AddBookController addBookController = loader.getController();

        Scene addBookScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addBookButton.getScene().getWindow();

        stage.setScene(addBookScene);
        stage.show();
    }
    /**
     * Routes the user to the Edit Book scene
     */
    @FXML
    protected void editBookButtonAction(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditBook.fxml"));
        Parent root = loader.load();

        EditBookController editBookController = loader.getController();

        Scene editBookScene = new Scene(root, 994, 697);

        Stage stage = (Stage) editBookButton.getScene().getWindow();

        stage.setScene(editBookScene);
        stage.show();
    }
    /**
     * Routes the user to the Add Music scene
     */
    @FXML
    protected void addMusicButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMusic.fxml"));
        Parent root = loader.load();

        AddMusicController addMusicController = loader.getController();

        Scene addMusicScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addMusicButton.getScene().getWindow();

        stage.setScene(addMusicScene);
        stage.show();
    }
    /**
     * Routes the user to the Edit Music scene
     */
    @FXML
    protected void editMusicButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditMusic.fxml"));
        Parent root = loader.load();

        EditMusicController editMusicController = loader.getController();

        Scene editMusicScene = new Scene(root, 994, 697);

        Stage stage = (Stage) editMusicButton.getScene().getWindow();

        stage.setScene(editMusicScene);
        stage.show();
    }
    /**
     * Routes the user to the Add Games scene
     */
    @FXML
    protected void addGamesButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddGames.fxml"));
        Parent root = loader.load();

        AddGamesController addGamesController = loader.getController();

        Scene addGamesScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addGamesButton.getScene().getWindow();

        stage.setScene(addGamesScene);
        stage.show();
    }
    /**
     * Routes the user to the Edit Games scene
     */
    @FXML
    protected void editGamesButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditGames.fxml"));
        Parent root = loader.load();

        EditGamesController editGamesController = loader.getController();

        Scene editGamesScene = new Scene(root, 994, 697);

        Stage stage = (Stage) editGamesButton.getScene().getWindow();

        stage.setScene(editGamesScene);
        stage.show();
    }
    /**
     * Routes the user to the Add Film scene
     */
    @FXML
    protected void addFilmButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddFilm.fxml"));
        Parent root = loader.load();

        AddFilmController addFilmController = loader.getController();

        Scene addFilmScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addFilmButton.getScene().getWindow();

        stage.setScene(addFilmScene);
        stage.show();
    }
    /**
     * Routes the user to the Edit Film scene
     */
    @FXML
    protected void editFilmButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditFilm.fxml"));
        Parent root = loader.load();

        EditFilmController editFilmController = loader.getController();

        Scene editFilmScene = new Scene(root, 994, 697);

        Stage stage = (Stage) editFilmButton.getScene().getWindow();

        stage.setScene(editFilmScene);
        stage.show();
    }
    /**
     * Routes the user to the Add Table scene
     */
    @FXML
    protected void addTableButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddTable.fxml"));
        Parent root = loader.load();

        AddTableController addTableController = loader.getController();

        Scene addTableScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addTableButton.getScene().getWindow();

        stage.setScene(addTableScene);
        stage.show();
    }
    /**
     * Routes the user to the Edit Table scene
     */
    @FXML
    protected void editTableButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditTable.fxml"));
        Parent root = loader.load();

        EditTableController editTableController = loader.getController();

        Scene editTableScene = new Scene(root, 994, 697);

        Stage stage = (Stage) editTableButton.getScene().getWindow();

        stage.setScene(editTableScene);
        stage.show();
    }
    /**
     * Routes the user to the Add User scene
     */
    @FXML
    protected void addUserButtonAction(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddUser.fxml"));
        Parent root = loader.load();

        AddUserController addUserController = loader.getController();

        Scene addUserScene = new Scene(root, 994, 697);

        Stage stage = (Stage) addUserButton.getScene().getWindow();

        stage.setScene(addUserScene);
        stage.show();
    }
    /**
     * Exits the user from the program
     */
    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }
}