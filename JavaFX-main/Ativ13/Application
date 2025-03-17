package com.ativm.ativm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DrawSimulatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/draw_simulator.fxml"));
        AnchorPane root = loader.load();
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Simulador de Sorteio");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
