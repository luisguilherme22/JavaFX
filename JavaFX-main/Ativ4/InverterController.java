package com.parimpar.ativ4;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InverterController {

        @FXML
        private TextField textField;

        @FXML
        private TextField resultTextField;

        @FXML
        private void inverterTexto() {
            String textoOriginal = textField.getText();

            if (textoOriginal.isEmpty()) {

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Aviso");
                alert.setHeaderText("Campo Vazio");
                alert.setContentText("Por favor, insira um texto para inverter.");
                alert.showAndWait();
            } else {

                String textoInvertido = new StringBuilder(textoOriginal).reverse().toString();
                resultTextField.setText(textoInvertido);
            }
        }
    }