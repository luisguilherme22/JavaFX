package com.parimpar.ativ6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {

            VBox root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            Scene scene = new Scene(root, 300, 200);
            primaryStage.setTitle("Gerador de Números Aleatórios");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }