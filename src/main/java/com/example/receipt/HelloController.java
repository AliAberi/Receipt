package com.example.receipt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void setAndPrint(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("DevLaunch Dialog");
        alert.setHeaderText("An error has been encountered");
        alert.setContentText("haalen");//from   www  .  ja va  2 s  .com
        alert.showAndWait();
    }

//    @FXML
//    private Label welcomeText;


//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }




}