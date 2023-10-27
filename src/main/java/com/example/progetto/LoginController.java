package com.example.progetto;

import com.example.progetto.utils.OAuth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.Format;
import java.util.ResourceBundle;

import javafx.application.HostServices;



public class LoginController{


    private Stage stage;
    private Scene scene;
    private Parent root;

    public TextField myTextField;

    public Button myButton;

    public Label myLabel;


    String email;

    public void submit(ActionEvent event){

        try {
            email = myTextField.getText();
            myLabel.setText("campi non validi");
        }

        catch(Exception e){


            System.out.println(e);
        }
    }


    @FXML
    protected void switchRegistration(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/firstGui/Registration.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void userFirst(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/firstGui/Utente/UserFirst/UserFirstHome.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void googleButton(ActionEvent event) throws Exception {
        Parent popUpRoot = FXMLLoader.load(getClass().getResource("/firstGui/googleLogin.fxml"));
        Stage popUpStage = new Stage();
        Scene popUpScene = new Scene(popUpRoot);
        popUpStage.setTitle("Google login");
        //popUpStage.setResizable(false);
        popUpStage.setScene(popUpScene);
        popUpStage.initModality(Modality.WINDOW_MODAL);
        popUpStage.show();

    }


}
