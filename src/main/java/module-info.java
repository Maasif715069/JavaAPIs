module com.example.assignment2_apis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment2_apis to javafx.fxml;
    exports com.example.assignment2_apis;
}