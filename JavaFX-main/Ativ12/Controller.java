import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

import java.security.SecureRandom;

public class MainController {

    @FXML
    private TextField tamanhoInput;

    @FXML
    private TextField senhaOutput;

    @FXML
    private void onGerarSenhaClicked(ActionEvent event) {
        try {
            int tamanho = Integer.parseInt(tamanhoInput.getText());

            if (tamanho < 4) {
                showErrorAlert("Erro", "A senha deve ter no mínimo 4 caracteres.");
                return;
            }

            String senha = gerarSenhaAleatoria(tamanho);
            senhaOutput.setText(senha);

        } catch (NumberFormatException e) {
            showErrorAlert("Erro", "Por favor, insira um valor numérico válido para o tamanho.");
        }
    }

    private String gerarSenhaAleatoria(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
