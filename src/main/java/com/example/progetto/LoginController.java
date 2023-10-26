package com.example.progetto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.text.Format;


public class LoginController {


    private Stage stage;
    private Scene scene;
    private Parent root;

    private static TextField myTextField;

    public Button myButton;

    public Label myLabel;

   // String email;

    /*public void submit(ActionEvent event){

        try {
            email = myTextField.getText();
            myLabel.setText("campi non validi");
        }

        catch(Exception e){


            System.out.println(e);
        }
    }*/






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





}
