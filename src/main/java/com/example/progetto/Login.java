package com.example.progetto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login {


    private Stage stage;
    private Scene scene;
    private Parent root;




    @FXML
    protected void Registrazione(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/aut/Registrazione.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void Back(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/aut/first-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }





}
