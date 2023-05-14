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

public class EditBookController {
    @FXML
    private Label addBookMessage;
    @FXML
    private Button homeScreenButton;
    @FXML
    private Button logoutButton;
    @FXML TextField bookIDTextEntry;
    @FXML
    private TextField bookAuthorTextEntry;
    @FXML
    private TextField bookTitleTextEntry;
    @FXML
    private TextField bookGenreTextEntry;
    @FXML
    private TextField bookFormatTextEntry;
    @FXML
    private TextArea bookOverviewTextEntry;
    @FXML
    private TextField bookISBNTextEntry;
    @FXML
    private TextField bookQuantityTextEntry;

    @FXML
    protected void logoutButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void editBookToDBButtonAction(ActionEvent event) {
        Book bookToAdd = new Book();
        bookToAdd.setBookID(Integer.parseInt(bookIDTextEntry.getText()));
        bookToAdd.setBookISBN(bookISBNTextEntry.getText());
        bookToAdd.setBookAuthor(bookAuthorTextEntry.getText());
        bookToAdd.setBookFormat(bookFormatTextEntry.getText());
        bookToAdd.setBookGenre(bookGenreTextEntry.getText());
        bookToAdd.setBookTitle(bookTitleTextEntry.getText());
        bookToAdd.setBookOverview(bookOverviewTextEntry.getText());
        bookToAdd.setBookQuantity(Integer.parseInt(bookQuantityTextEntry.getText()));

        BookDatabaseConnection.addBookToDatabase(bookToAdd);
        bookIDTextEntry.setText("");
        bookISBNTextEntry.setText("");
        bookAuthorTextEntry.setText("");
        bookFormatTextEntry.setText("");
        bookGenreTextEntry.setText("");
        bookTitleTextEntry.setText("");
        bookOverviewTextEntry.setText("");
        bookQuantityTextEntry.setText("");
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
