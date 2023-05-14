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

public class EditTableController {
    @FXML
    private Label editTableMessage;
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

    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
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
