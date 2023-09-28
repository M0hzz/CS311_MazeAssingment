module com.example.csc311_mazeassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.csc311_mazeassignment to javafx.fxml;
    exports com.example.csc311_mazeassignment;
}