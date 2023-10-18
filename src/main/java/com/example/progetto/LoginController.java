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
    protected void switchRegistration(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/firstGui/Registration.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void userFirst(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/firstGui/Utente/UserFirst.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





}
