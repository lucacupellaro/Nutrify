package com.example.progetto.Utente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserFirstController{



    private Stage stage;
    private Scene scene;
    private Parent root;




    @FXML
    protected void Pagamento(ActionEvent event) throws Exception {


        root = FXMLLoader.load(getClass().getResource("/firstGui/Utente/Pagamento.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }











}