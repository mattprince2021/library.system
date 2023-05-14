package library.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BookDatabaseOutputController {
    @FXML
    private Text databaseContentText;
    @FXML
    private TextField bookAuthorTextEntry;
    @FXML
    private TextField bookTitleTextEntry;
    @FXML
    private TextField bookISBNTextEntry;
    @FXML
    private TextField bookFormatTextEntry;
    @FXML
    private TextField bookGenreTextEntry;
    @FXML
    private TextField bookOverviewTextEntry;
    @FXML
    private TextField bookQuantityTextEntry;

    @FXML
    protected void addBookButtonClicked(ActionEvent event) {
        int bookISBNEntered = Integer.parseInt(bookISBNTextEntry.getText());

        Book bookToAdd = new Book();
        bookToAdd.setBookISBN(bookISBNTextEntry.getText());
        bookToAdd.setBookAuthor(bookAuthorTextEntry.getText());
        bookToAdd.setBookFormat(bookFormatTextEntry.getText());
        bookToAdd.setBookGenre(bookGenreTextEntry.getText());
        bookToAdd.setBookTitle(bookTitleTextEntry.getText());
        bookToAdd.setBookOverview(bookOverviewTextEntry.getText());
        bookToAdd.setBookQuantity(Integer.parseInt(bookQuantityTextEntry.getText()));
    }
}
