package com.parimpar.ativ2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ParImparController {

        @FXML
        private TextField textField;

        @FXML
        private Label resultLabel;

        @FXML
        private void verificarNumero() {
            String input = textField.getText();

            try {
                int numero = Integer.parseInt(input);

                if (numero % 2 == 0) {
                    resultLabel.setText("O número digitado é Par");
                } else {
                    resultLabel.setText("O número digitado é Ímpar");
                }

            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText("Valor Inválido");
                alert.setContentText("Por favor, insira um número válido.");
                alert.showAndWait();
            }
        }
    }