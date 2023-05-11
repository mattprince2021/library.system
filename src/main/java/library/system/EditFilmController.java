package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class EditFilmController {
    @FXML private Label editFilmMessage;


    @FXML
    private Button addBookButton, editBookButton, addMusicButton, editMusicButton, addGamesButton,
            editGamesButton, addFilmButton, addTableButton, editTableButton;
    @FXML
    protected void addBookButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBook.fxml"));
        Parent root = loader.load();

        AddBookController addBookController = loader.getController();

        Scene addBookScene = new Scene(root, 994,697);

        Stage stage = (Stage) addBookButton.getScene().getWindow();

        stage.setScene(addBookScene);
        stage.show();
    }

    @FXML
    protected void editBookButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditBook.fxml"));
        Parent root = loader.load();

        EditBookController editBookController = loader.getController();

        Scene editBookScene = new Scene(root, 994,697);

        Stage stage = (Stage) editBookButton.getScene().getWindow();

        stage.setScene(editBookScene);
        stage.show();
    }
    @FXML
    protected void addMusicButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMusic.fxml"));
        Parent root = loader.load();

        AddMusicController addMusicController = loader.getController();

        Scene addMusicScene = new Scene(root, 994,697);

        Stage stage = (Stage) addMusicButton.getScene().getWindow();

        stage.setScene(addMusicScene);
        stage.show();
    }
    @FXML
    protected void editMusicButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditMusic.fxml"));
        Parent root = loader.load();

        EditMusicController editMusicController = loader.getController();

        Scene editMusicScene = new Scene(root, 994,697);

        Stage stage = (Stage) editMusicButton.getScene().getWindow();

        stage.setScene(editMusicScene);
        stage.show();
    }
    @FXML
    protected void addGamesButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddGames.fxml"));
        Parent root = loader.load();

        AddGamesController addGamesController = loader.getController();

        Scene addGamesScene = new Scene(root, 994,697);

        Stage stage = (Stage) addGamesButton.getScene().getWindow();

        stage.setScene(addGamesScene);
        stage.show();
    }
    @FXML
    protected void editGamesButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditGames.fxml"));
        Parent root = loader.load();

        EditGamesController editGamesController = loader.getController();

        Scene editGamesScene = new Scene(root, 994,697);

        Stage stage = (Stage) editGamesButton.getScene().getWindow();

        stage.setScene(editGamesScene);
        stage.show();
    }

    @FXML
    protected void addFilmButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddFilm.fxml"));
        Parent root = loader.load();

        AddFilmController addFilmController = loader.getController();

        Scene addFilmScene = new Scene(root, 994,697);

        Stage stage = (Stage) addFilmButton.getScene().getWindow();

        stage.setScene(addFilmScene);
        stage.show();
    }

    @FXML
    protected void addTableButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddTable.fxml"));
        Parent root = loader.load();

        AddTableController addTableController = loader.getController();

        Scene addTableScene = new Scene(root, 994,697);

        Stage stage = (Stage) addTableButton.getScene().getWindow();

        stage.setScene(addTableScene);
        stage.show();
    }
    @FXML
    protected void editTableButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditTable.fxml"));
        Parent root = loader.load();

        EditTableController editTableController = loader.getController();

        Scene editTableScene = new Scene(root, 994,697);

        Stage stage = (Stage) editTableButton.getScene().getWindow();

        stage.setScene(editTableScene);
        stage.show();
    }



}
