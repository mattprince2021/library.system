package library.system;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Optional;

public class EditFilm {

    private String result;

    public String getResult() {
        return this.result;
    }

    public EditFilm() {
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Edit Music");
        dialog.setHeaderText("Edit Music");

        ButtonType confirm = new ButtonType("Edit");
        dialog.getDialogPane().getButtonTypes().add(confirm);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20,150,10,10));

        TextField studio = new TextField();
        studio.setPromptText("Studio");

        TextField title = new TextField();
        title.setPromptText("Title");

        TextField barcode = new TextField();
        barcode.setPromptText("Barcode");

        TextField genre = new TextField();
        genre.setPromptText("Genre");

        TextField format = new TextField();
        genre.setPromptText("Format");

        grid.add(new Label("Studio:"), 0, 0);
        grid.add(studio, 1, 0);

        grid.add(new Label("Title:"), 0, 1);
        grid.add(title, 1, 1);

        grid.add(new Label("Barcode:"), 0, 2);
        grid.add(barcode, 1, 2);

        grid.add(new Label("Genre:"), 0, 3);
        grid.add(genre, 1, 3);

        grid.add(new Label("Format:"), 0, 3);
        grid.add(format, 1, 3);

        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == confirm) {
                return studio.getText() + ";" + title.getText() + ";" + barcode.getText() + ";" + genre.getText() + ";"
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