module com.melissadata.globalip {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires com.google.gson;
    requires jdk.crypto.ec;

    opens com.melissadata.globalip to javafx.fxml;
    opens com.melissadata.globalip.model to javafx.fxml;
    opens com.melissadata.globalip.view to javafx.fxml;
    exports com.melissadata.globalip;
}
