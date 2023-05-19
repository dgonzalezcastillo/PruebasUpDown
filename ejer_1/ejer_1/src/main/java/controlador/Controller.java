package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.OperacionesMatematicas;



public class Controller {

    @FXML
    private Button btCalcular;

    @FXML
    private TextField txtDivision;

    @FXML
    private TextField txtMultiplicacion;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private TextField txtResta;

    @FXML
    private TextField txtSuma;

    @FXML
    void calculo(MouseEvent event) {


        int numero1 = 0;
        int numero2 = 0;

        try {
            numero1 = Integer.parseInt(txtNum1.getText());
            numero2 = Integer.parseInt(txtNum2.getText());
        }catch (NumberFormatException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Introduzca dos números");
            alert.showAndWait();

        }

        OperacionesMatematicas operaciones = new OperacionesMatematicas(numero1, numero2);
        int sumado = operaciones.getSuma();
        int restado = operaciones.getResta();
        int multiplicado = operaciones.getMultiplicacion();
        int dividido = operaciones.getDivision();

        txtSuma.setText(String.valueOf(sumado));
        txtResta.setText(String.valueOf(restado));
        txtMultiplicacion.setText(String.valueOf(multiplicado));
        txtDivision.setText(String.valueOf(dividido));

    }
}

