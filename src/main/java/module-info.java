module com.example.progetto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.dicii.ispw.project to javafx.fxml;
    exports com.dicii.ispw.project;
    exports com.dicii.ispw.project.Utente;
    opens com.dicii.ispw.project.Utente to javafx.fxml;
    exports com.dicii.ispw.project.utils;
    opens com.dicii.ispw.project.utils to javafx.fxml;
}