package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddFilmController {
    @FXML private Label addFilmMessage;
    @FXML private Button addBookButton;
    @FXML private Button editBookButton;
    @FXML private Button addMusicButton;
    @FXML private Button editMusicButton;
    @FXML private Button addBoardgamesButton;
    @FXML private Button editBoardgamesButton;
    @FXML private Button editFilmButton;
    @FXML private Button addTableButton;
    @FXML private Button editTableButton;
    @FXML private TextField filmBarcodeTextEntry;
    @FXML private TextField filmStudioTextEntry;
    @FXML private TextField filmFormatTextEntry;
    @FXML private TextField filmGenreTextEntry;
    @FXML private TextField filmTitleTextEntry;
    @FXML private TextArea filmOverviewTextEntry;
    @FXML private TextField filmQuantityTextEntry;
    @FXML private TextField filmAgeTextEntry;
    @FXML protected void addFilmToDBButtonAction(ActionEvent event)
    {
        Film filmToAdd = new Film();
        filmToAdd.setFilmBarcode(filmBarcodeTextEntry.getText());
        filmToAdd.setFilmStudio(filmStudioTextEntry.getText());
        filmToAdd.setFilmFormat(filmFormatTextEntry.getText());
        filmToAdd.setFilmGenre(filmGenreTextEntry.getText());
        filmToAdd.setFilmAge(filmAgeTextEntry.getText());
        filmToAdd.setFilmTitle(filmTitleTextEntry.getText());
        filmToAdd.setFilmOverview(filmOverviewTextEntry.getText());
        filmToAdd.setFilmQuantity(Integer.parseInt(filmQuantityTextEntry.getText()));

        FilmDatabaseConnection.addFilmToDatabase(filmToAdd);
        filmBarcodeTextEntry.setText("");
        filmStudioTextEntry.setText("");
        filmFormatTextEntry.setText("");
        filmGenreTextEntry.setText("");
        filmAgeTextEntry.setText("");
        filmTitleTextEntry.setText("");
        filmOverviewTextEntry.setText("");
        filmQuantityTextEntry.setText("");
    }

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
    protected void addBoardgamesButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBoardgames.fxml"));
        Parent root = loader.load();

        AddBoardgamesController addBoardgamesController = loader.getController();

        Scene addBoardgamesScene = new Scene(root, 994,697);

        Stage stage = (Stage) addBoardgamesButton.getScene().getWindow();

        stage.setScene(addBoardgamesScene);
        stage.show();
    }
    @FXML
    protected void editBoardgamesButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditBoardgames.fxml"));
        Parent root = loader.load();

        EditBoardgamesController editBoardgamesController = loader.getController();

        Scene editBoardgamesScene = new Scene(root, 994,697);

        Stage stage = (Stage) editBoardgamesButton.getScene().getWindow();

        stage.setScene(editBoardgamesScene);
        stage.show();
    }

    @FXML
    protected void editFilmButtonAction(ActionEvent event) throws Exception
    {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditFilm.fxml"));
        Parent root = loader.load();

        EditFilmController editFilmController = loader.getController();

        Scene editFilmScene = new Scene(root, 994,697);

        Stage stage = (Stage) editFilmButton.getScene().getWindow();

        stage.setScene(editFilmScene);
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
