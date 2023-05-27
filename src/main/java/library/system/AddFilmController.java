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
 * This controller functions to take the entered data and write to the database. The data entry fields are aligned to
 * the class. Included are a submission button, a button to return to the home screen and a button to exit the program
 *
 * @author matthewprince
 * @version 1.0
 */
public class AddFilmController {
    @FXML
    private Label addFilmMessage;
    @FXML
    private Button homeScreenButton;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField filmBarcodeTextEntry;
    @FXML
    private TextField filmStudioTextEntry;
    @FXML
    private TextField filmFormatTextEntry;
    @FXML
    private TextField filmGenreTextEntry;
    @FXML
    private TextField filmTitleTextEntry;
    @FXML
    private TextArea filmOverviewTextEntry;
    @FXML
    private TextField filmQuantityTextEntry;
    @FXML
    private TextField filmAgeTextEntry;
    /**
     * Exits the user from the program
     */
    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }
    /**
     * Adds the user input data to the database
     */
    @FXML
    protected void addFilmToDBButtonAction(ActionEvent event) {
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
    /**
     * Returns the user to the Home Screen
     */
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
