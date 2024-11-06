package com.example.javafxpumpkin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {


    public void initialize() {

      //  textLabel.textProperty().bind(model.userTextProperty());
        textFieldTarget.textProperty().bind(model.userTextProperty());
        transferButton.disableProperty().bind(textField.textProperty().isEmpty());

    }

    private Model model = new Model();


    public Button transferButton;
   //  public Label textLabel;
    public TextField textField;
    public TextField textFieldTarget;

    public Model getModel() {
        return model;
    }

    @FXML
    protected void onHelloButtonClick() {

        model.setUserText(textField.getText());

        // textFieldTarget.setText(model.getUserText());
        // textLabel.setText(model.getUserText());
    }


    public void textFieldChanged(KeyEvent keyEvent) {
       // transferButton.setDisable(textField.getText().isEmpty());
    }
}