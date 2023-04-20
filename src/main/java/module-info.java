module com.example.receipt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.receipt to javafx.fxml;
    exports com.example.receipt;
}