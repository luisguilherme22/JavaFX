import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class VerificadorPalindromoController {

    @FXML
    private TextField inputField;

    // Método para verificar se a palavra/frase é um palíndromo
    @FXML
    public void verificarPalindromo(ActionEvent event) {
        String texto = inputField.getText().replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove não letras e coloca em minúsculas
        boolean isPalindromo = isPalindromo(texto);
        
        Alert alert = new Alert(isPalindromo ? Alert.AlertType.INFORMATION : Alert.AlertType.ERROR);
        alert.setTitle(isPalindromo ? "Palíndromo" : "Não é Palíndromo");
        alert.setHeaderText(null);
        alert.setContentText(isPalindromo ? "É um palíndromo!" : "Não é um palíndromo.");
        alert.showAndWait();
    }

    // Método para verificar se a string é um palíndromo
    private boolean isPalindromo(String texto) {
        StringBuilder reversed = new StringBuilder(texto).reverse();
        return texto.equals(reversed.toString());
    }
}
