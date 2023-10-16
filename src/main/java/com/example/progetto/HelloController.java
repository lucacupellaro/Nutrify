package com.example.progetto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {


    private Stage stage;
    private Scene scene;
    private Parent root;




    @FXML
    protected void Login(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/aut/Autentication.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }











}