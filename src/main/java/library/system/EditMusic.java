package library.system;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Optional;

public class EditMusic {

    private String result;

    public String getResult() {
        return this.result;
    }

    public EditMusic() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Edit Music");
        dialog.setHeaderText("Edit Music");

        ButtonType confirm = new ButtonType("Edit");
        dialog.getDialogPane().getButtonTypes().add(confirm);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20,150,10,10));

        TextField artist = new TextField();
        artist.setPromptText("Artist");

        TextField title = new TextField();
        title.setPromptText("Title");

        TextField isbn = new TextField();
        isbn.setPromptText("ISBN");

        TextField category = new TextField();
        category.setPromptText("Genre");

        TextField format = new TextField();
        category.setPromptText("Format");

        grid.add(new Label("Artist:"), 0, 0);
        grid.add(artist, 1, 0);

        grid.add(new Label("Title:"), 0, 1);
        grid.add(title, 1, 1);

        grid.add(new Label("ISBN:"), 0, 2);
        grid.add(isbn, 1, 2);

        grid.add(new Label("Category:"), 0, 3);
        grid.add(category, 1, 3);

        grid.add(new Label("Format:"), 0, 3);
        grid.add(category, 1, 3);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == confirm) {
                return artist.getText() + ";" + title.getText() + ";" + isbn.getText() + ";" + category.getText() + ";"
                        + format.getText();
            }
            return null;
        });

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() ) {
            this.result = result.get();
        }
        else this.result = null;
    }
}