module gonzalez.david.ejer_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens gonzalez.david.ejer_1 to javafx.fxml;
    exports gonzalez.david.ejer_1;
    exports controlador;
    opens controlador to javafx.fxml;
    opens modelo;
}