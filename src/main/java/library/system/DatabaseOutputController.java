package library.system;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DatabaseOutputController {
    @FXML
    private Text databaseContentText;
    @FXML private TextField bookISBNTextEntry;
    @FXML private TextField bookTitleTextEntry;
    @FXML private TextField bookAuthorTextEntry;
    @FXML private TextField bookFormatTextEntry;
    @FXML private TextField bookGenreTextEntry;
    @FXML private TextField bookOverviewTextEntry;
    @FXML private TextField bookQuantityTextEntry;
}
