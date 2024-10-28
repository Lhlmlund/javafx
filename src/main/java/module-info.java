module com.example.javafxpumpkin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxpumpkin to javafx.fxml;
    exports com.example.javafxpumpkin;
}