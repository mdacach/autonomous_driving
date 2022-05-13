module com.example.autonomous_driving {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.autonomous_driving to javafx.fxml;
    exports com.example.autonomous_driving;
}