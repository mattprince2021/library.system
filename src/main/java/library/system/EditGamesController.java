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
public class EditGamesController {
    @FXML
    private Label editGamesMessage;
    @FXML
    private Button homeScreenButton;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField gamesBarcodeTextEntry;
    @FXML
    private TextField gamesTitleTextEntry;
    @FXML
    private TextField gamesAgesTextEntry;
    @FXML
    private TextField gamesMinPlayersTextEntry;
    @FXML
    private TextField gamesGenreTextEntry;
    @FXML
    private TextArea gamesOverviewTextEntry;
    @FXML
    private TextField gamesQuantityTextEntry;

    @FXML
    protected void addGamesToDBButtonAction(ActionEvent event) {
        Games gamesToAdd = new Games();
        gamesToAdd.setGamesBarcode(gamesBarcodeTextEntry.getText());
        gamesToAdd.setGamesTitle(gamesTitleTextEntry.getText());
        gamesToAdd.setGamesAges(gamesAgesTextEntry.getText());
        gamesToAdd.setGamesMinPlayers(gamesMinPlayersTextEntry.getText());
        gamesToAdd.setGamesGenre(gamesGenreTextEntry.getText());
        gamesToAdd.setGamesOverview(gamesOverviewTextEntry.getText());
        gamesToAdd.setGamesQuantity(Integer.parseInt(gamesQuantityTextEntry.getText()));

        GamesDatabaseConnection.addGamesToDatabase(gamesToAdd);
        gamesBarcodeTextEntry.setText("");
        gamesTitleTextEntry.setText("");
        gamesAgesTextEntry.setText("");
        gamesMinPlayersTextEntry.setText("");
        gamesGenreTextEntry.setText("");
        gamesOverviewTextEntry.setText("");
        gamesQuantityTextEntry.setText("");
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

    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }

}
