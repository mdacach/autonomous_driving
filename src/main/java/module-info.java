module com.example.autonomous_driving {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.autonomous_driving to javafx.fxml;
    exports com.autonomous_driving;
}