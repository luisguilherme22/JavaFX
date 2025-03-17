package com.ativn.ativn;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Timer;
import java.util.TimerTask;

public class TimerController {

    @FXML
    private TextField timeInput;
    @FXML
    private Label countdownLabel;

    private Timer timer;


    public void handleStartButtonClick() {
        try {
            int timeInSeconds = Integer.parseInt(timeInput.getText());
            if (timeInSeconds < 0) {
                showAlert("Erro", "O tempo não pode ser negativo.");
                return;
            }

            startCountdown(timeInSeconds);
        } catch (NumberFormatException ex) {
            showAlert("Erro", "insira um número válido.");
        }
    }


    private void startCountdown(int timeInSeconds) {
        if (timer != null) {
            timer.cancel();
        }

        timer = new Timer();
        TimerTask task = new TimerTask() {
            int remainingTime = timeInSeconds;

            @Override
            public void run() {
                if (remainingTime >= 0) {
                    final int time = remainingTime;

                    javafx.application.Platform.runLater(() -> countdownLabel.setText("Tempo restante: " + time + " segundos"));

                    remainingTime--;
                } else {

                    javafx.application.Platform.runLater(() -> countdownLabel.setText("Tempo esgotado!"));
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
