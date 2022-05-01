module com.example.softwareprojektt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.softwareprojektt to javafx.fxml;
    exports com.example.softwareprojektt;
}