package com.parimpar.ativ3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContadorController {

        @FXML
        private TextField textField;

        @FXML
        private Label resultLabel;

        @FXML
        private void contarCaracteres() {
            String texto = textField.getText();

            int numeroDeCaracteres = texto.length();

            resultLabel.setText("Número de caracteres: " + numeroDeCaracteres);
        }
    }