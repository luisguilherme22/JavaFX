package com.parimpar.ativ3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

    public class MainApp extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {

            VBox root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            Scene scene = new Scene(root, 300, 200);
            primaryStage.setTitle("Contador de Caracteres");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }