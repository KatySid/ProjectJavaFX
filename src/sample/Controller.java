package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

    public void clickBtn() {
        textArea.appendText(textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

    public void onKeyPressed(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER) {
            clickBtn();
        }
    }
}
