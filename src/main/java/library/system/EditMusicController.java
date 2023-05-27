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
/**
 * This controller is currently a placeholder for edit functionality due to be delivered in future release
 * @author matthewprince
 * @version 1.0
 */
public class EditMusicController {
    @FXML
    private Label addBookMessage;
    @FXML
    private Button homeScreenButton;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField musicArtistTextEntry;
    @FXML
    private TextField musicTitleTextEntry;
    @FXML
    private TextField musicGenreTextEntry;
    @FXML
    private TextField musicFormatTextEntry;
    @FXML
    private TextArea musicOverviewTextEntry;
    @FXML
    private TextField musicBarcodeTextEntry;
    @FXML
    private TextField musicQuantityTextEntry;

    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void addMusicToDBButtonAction(ActionEvent event) {
        Music musicToAdd = new Music();
        musicToAdd.setMusicBarcode(musicBarcodeTextEntry.getText());
        musicToAdd.setMusicArtist(musicArtistTextEntry.getText());
        musicToAdd.setMusicFormat(musicFormatTextEntry.getText());
        musicToAdd.setMusicGenre(musicGenreTextEntry.getText());
        musicToAdd.setMusicTitle(musicTitleTextEntry.getText());
        musicToAdd.setMusicOverview(musicOverviewTextEntry.getText());
        musicToAdd.setMusicQuantity(Integer.parseInt(musicQuantityTextEntry.getText()));

        MusicDatabaseConnection.addMusicToDatabase(musicToAdd);
        musicBarcodeTextEntry.setText("");
        musicArtistTextEntry.setText("");
        musicFormatTextEntry.setText("");
        musicGenreTextEntry.setText("");
        musicTitleTextEntry.setText("");
        musicOverviewTextEntry.setText("");
        musicQuantityTextEntry.setText("");
    }


    @FXML
    protected void homeScreenButtonAction(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScreen.fxml"));
        Parent root = loader.load();

        HomeScreenController homeScreenController = loader.getController();

        Scene changedSceneHome = new Scene(root, 994, 697);

        Stage stage = (Stage) homeScreenButton.getScene().getWindow();

        stage.setScene(changedSceneHome);
        stage.show();

    }
}