module com.example.progetto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.progetto to javafx.fxml;
    exports com.example.progetto;
    exports com.example.progetto.Utente;
    opens com.example.progetto.Utente to javafx.fxml;
    exports com.example.progetto.utils;
    opens com.example.progetto.utils to javafx.fxml;
}