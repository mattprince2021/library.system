package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * This controller functions to take the entered data and write to the database. The data entry fields are aligned to
 * the class. Included are a submission button, a button to return to the home screen and a button to exit the program
 *
 * @author matthewprince
 * @version 1.0
 */
public class AddTableController {
    @FXML
    private Label addTableMessage;
    @FXML
    private Button homeScreenButton;
    @FXML
    private Button logoutButton;
    @FXML
    private TextField tablesSizeTextEntry;
    @FXML
    private TextField tablesPlayersTextEntry;
    @FXML
    private TextField tablesQuantityTextEntry;
    /**
     * Adds the user input data to the database
     */
    @FXML
    protected void addTableToDBButtonAction(ActionEvent event) {
        Tables tablesToAdd = new Tables();
        tablesToAdd.setTablesSize(tablesSizeTextEntry.getText());
        tablesToAdd.setTablesPlayers(Integer.parseInt(tablesPlayersTextEntry.getText()));
        tablesToAdd.setTablesQuantity(Integer.parseInt(tablesQuantityTextEntry.getText()));

        TablesDatabaseConnection.addTablesToDatabase(tablesToAdd);
        tablesSizeTextEntry.setText("");
        tablesPlayersTextEntry.setText("");
        tablesQuantityTextEntry.setText("");
    }
    /**
     * Exits the user from the program
     */
    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
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

