module com.example.rmimatrix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rmimatrix to javafx.fxml;
    exports com.example.rmimatrix;
}