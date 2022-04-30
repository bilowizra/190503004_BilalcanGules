module com.example.softwareprojektt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwareprojektt to javafx.fxml;
    exports com.example.softwareprojektt;
}