module com.nadia.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.nadia.javafxtest to javafx.fxml;
    exports com.nadia.javafxtest;
}