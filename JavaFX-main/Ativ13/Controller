package com.ativm.ativm;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DrawSimulatorController {
    @FXML
    private TextField namesInput;

    @FXML
    private Label resultLabel;

    @FXML
    public void handleDrawButtonClick() {
        String input = namesInput.getText();
        if (input.isEmpty()) {
            showAlert("Erro", "Por favor, insira alguns nomes.");
            return;
        }
        List<String> names = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
        if (names.size() <= 1) {
            showAlert("Erro", "É necessário inserir mais de um nome.");
            return;
        }
        String drawnName = drawRandomName(names);
        resultLabel.setText("Nome sorteado: " + drawnName);
    }
    private String drawRandomName(List<String> names) {
        Random random = new Random();
        int index = random.nextInt(names.size());
        return names.get(index);
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
