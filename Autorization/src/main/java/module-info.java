module com.example.autorization {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.autorization to javafx.fxml;
    exports com.example.autorization;
}