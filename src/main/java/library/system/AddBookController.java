package library.system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AddBookController {

    @FXML private Label addBookMessage;

    public void receiveInformation(String information)
    {
        addBookMessage.setText(information);
    }
}
