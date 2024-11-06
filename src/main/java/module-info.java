module com.example.javafxpumpkin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javafxpumpkin to javafx.fxml;
    exports com.example.javafxpumpkin;
}