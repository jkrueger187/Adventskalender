module com.example.adventkalender {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adventkalender to javafx.fxml;
    exports com.example.adventkalender;
}