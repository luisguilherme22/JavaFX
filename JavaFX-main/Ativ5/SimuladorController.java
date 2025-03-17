package com.parimpar.ativ5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SimuladorController {

        @FXML
        private TextField usernameField;

        @FXML
        private PasswordField passwordField;

        @FXML
        private Label resultLabel;

        @FXML
        private void verificarLogin() {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("admin") && password.equals("1234")) {

                resultLabel.setText("Login bem-sucedido");
            } else {

                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erro de Login");
                alert.setHeaderText("Usuário ou Senha Incorretos");
                alert.setContentText("O nome de usuário ou a senha informados estão incorretos.");
                alert.showAndWait();
            }
        }
    }