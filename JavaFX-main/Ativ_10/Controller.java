import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private TextField reaisInput;

    @FXML
    private void onConverterClicked(ActionEvent event) {
        try {
            double reais = Double.parseDouble(reaisInput.getText());

          
            double dolarCotacao = 5.25;
            double euroCotacao = 5.70;
            double libraCotacao = 6.30;
            double pesoCotacao = 0.040;

            double dolar = reais / dolarCotacao;
            double euro = reais / euroCotacao;
            double libra = reais / libraCotacao;
            double peso = reais / pesoCotacao;

            // Exibindo o resultado em um Alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Conversão de Moeda");
            alert.setHeaderText(null);
            alert.setContentText(
                String.format("R$ %.2f é equivalente a:\n\nDólar: $ %.2f\nEuro: € %.2f\nLibra: £ %.2f\nPeso: $ %.2f", 
                    reais, dolar, euro, libra, peso));
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, insira um valor numérico válido.");
            alert.showAndWait();
        }
    }
}
