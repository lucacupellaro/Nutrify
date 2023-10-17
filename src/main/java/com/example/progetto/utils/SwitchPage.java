package com.example.progetto.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchPage {

    static int x=800;
    static int y=500;
    static public Scene setStage(Stage stage, String toScene) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchPage.class.getResource(toScene));
        Parent load = fxmlLoader.load();
        //fxmlLoader.<ControllerBase>getController().setA(this);
        Scene scene = new Scene(load, x, y);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        return scene;
    }
}