package com.parimpar.ativ5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carregar o arquivo FXML
        VBox root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        // Criar a cena e configurar o palco
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Simulador de Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
