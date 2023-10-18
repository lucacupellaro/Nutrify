package com.example.progetto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {


    private Stage stage;
    private Scene scene;
    private Parent root;




    @FXML
    protected void Registrazione(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/aut/Registration.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void UserFirst(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/aut/Utente/UserFirst.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





}
