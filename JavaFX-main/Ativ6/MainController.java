package com.parimpar.ativ6;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class MainController {

        @FXML
        private TextField minField;

        @FXML
        private TextField maxField;

        @FXML
        private Label resultLabel;

        @FXML
        private void gerarNumeroAleatorio() {
            try {

                int min = Integer.parseInt(minField.getText());
                int max = Integer.parseInt(maxField.getText());

                if (min >= max) {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro");
                    alert.setHeaderText("Intervalo Inválido");
                    alert.setContentText("O valor mínimo não pode ser maior ou igual ao valor máximo.");
                    alert.showAndWait();
                } else {

                    Random random = new Random();
                    int numeroAleatorio = random.nextInt((max - min) + 1) + min;
                    resultLabel.setText("Número gerado: " + numeroAleatorio);
                }
            } catch (NumberFormatException e) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erro");
                alert.setHeaderText("Entrada Inválida");
                alert.setContentText("Por favor, insira valores numéricos válidos para o intervalo.");
                alert.showAndWait();
            }
        }
    }