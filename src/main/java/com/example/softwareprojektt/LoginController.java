package com.example.softwareprojektt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private Label loginMessageLabel;

    @FXML
    private ImageView brandingImageView;

    @FXML
    private ImageView lockImageView;

    @FXML
    private TextField usernameTextfield;

    @FXML
    private PasswordField enterPasswordTextfield;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("images/foto.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile = new File("images/foto2.png");
        Image lockImage = new Image(lockFile.toURI().toString());
        lockImageView.setImage(brandingImage);
    }

    public void loginButtonOnAction(ActionEvent event){

         if(usernameTextfield.getText().isBlank() == false  && enterPasswordTextfield.getText().isBlank() == false ){
             validateLogin();
         } else {
             loginMessageLabel.setText("Bitte Geben Sie nutzername und Passwort  ");
         }
    }

    public void validateLogin(){

    }

}

// Bilalcan Gules 190503004