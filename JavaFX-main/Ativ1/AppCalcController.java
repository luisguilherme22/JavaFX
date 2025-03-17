package com.appcalc.appcalc;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;
import java.util.Optional;

public class AppCalcController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label resultado;

    @FXML
    protected void ClickTeste() {

        try {

            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());

            double result = 0;

            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Opções de Cálculo");
            msg.setHeaderText("Escolha as Opções de Cálculo abaixo:");
            msg.setContentText("Clique no botão desejado.");

            ButtonType btnSoma = new ButtonType("+");
            ButtonType btnMenos = new ButtonType("-");
            ButtonType btnMulti = new ButtonType("*");
            ButtonType btnDividir = new ButtonType("/");

            msg.getButtonTypes().setAll(btnSoma, btnMenos, btnMulti, btnDividir);
            Optional<ButtonType> opt = msg.showAndWait();

            if (opt.isPresent()) {
                if (opt.get() == btnSoma) {
                    result = n1 + n2;
                    resultado.setText("O resultado da Soma é: " + result);
                } else if (opt.get() == btnMenos) {
                    result = n1 - n2;
                    resultado.setText("O resultado da Subtração é: " + result);
                } else if (opt.get() == btnMulti) {
                    result = n1 * n2;
                    resultado.setText("O resultado da Multiplicação é: " + result);
                } else if (opt.get() == btnDividir) {

                    if (n2 == 0) {
                        Alert divZeroAlert = new Alert(Alert.AlertType.ERROR);
                        divZeroAlert.setTitle("Erro de Divisão");
                        divZeroAlert.setHeaderText("Não é possível dividir por zero!");
                        divZeroAlert.showAndWait();
                        return;
                    }
                    result = n1 / n2;
                    resultado.setText("O resultado da Divisão é: " + result);
                }
            }

            num1.setText("");
            num2.setText("");

            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(e -> resultado.setText(""));
            pause.play();

        } catch (NumberFormatException e) {

            Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setTitle("ERRO!");
            msg.setHeaderText("Entrada Inválida");
            msg.setContentText("O valor informado é inválido! Insira apenas números.");
            msg.showAndWait();

            num1.setText("");
            num2.setText("");
        }
    }
}