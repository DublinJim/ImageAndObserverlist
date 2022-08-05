module com.example.imageandobserverlist {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.imageandobserverlist to javafx.fxml;
    exports com.example.imageandobserverlist;
}