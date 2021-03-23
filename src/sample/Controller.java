package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;

    public void setText(ActionEvent actionEvent) {
        helloWorld.setText("HelloWorld");
    }
}
