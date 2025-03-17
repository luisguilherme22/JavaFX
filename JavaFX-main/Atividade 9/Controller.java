import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private TextField celsiusInput;

    @FXML
    private void onConverterClicked(ActionEvent event) {
        try {
            double celsius = Double.parseDouble(celsiusInput.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Conversão");
            alert.setHeaderText(null);
            alert.setContentText(celsius + "°C é igual a " + fahrenheit + "°F.");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, insira um valor válido.");
            alert.showAndWait();
        }
    }
}
