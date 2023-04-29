package library.system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeScreenController
{
    @FXML private Label welcomeMessage;

    public void receiveInformation(String information)
    {
        welcomeMessage.setText(information);
    }
}