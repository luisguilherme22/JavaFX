import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carregar o arquivo FXML
        VBox root = FXMLLoader.load(getClass().getResource("verificador_palindromo.fxml"));

        // Criar a cena e configurar o palco
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Verificador de Palíndromo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
