import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private TextField capitalInput;

    @FXML
    private TextField taxaInput;

    @FXML
    private TextField tempoInput;

    @FXML
    private Label resultadoLabel;

    @FXML
    private void onCalcularClicked(ActionEvent event) {
        try {
            String capitalText = capitalInput.getText();
            String taxaText = taxaInput.getText();
            String tempoText = tempoInput.getText();

            if (capitalText.isEmpty() || taxaText.isEmpty() || tempoText.isEmpty()) {
                showErrorAlert("Erro", "Todos os campos devem ser preenchidos!");
                return;
            }

            double capital = Double.parseDouble(capitalText);
            double taxa = Double.parseDouble(taxaText) / 100;  // Taxa em porcentagem
            int tempo = Integer.parseInt(tempoText);

            double montante = capital * Math.pow(1 + taxa, tempo);

            resultadoLabel.setText(String.format("Montante Final: R$ %.2f", montante));

        } catch (NumberFormatException e) {
            showErrorAlert("Erro", "Por favor, insira valores numéricos válidos.");
        }
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
