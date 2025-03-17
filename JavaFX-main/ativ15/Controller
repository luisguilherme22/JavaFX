package com.ativo.ativo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import java.util.HashMap;
import java.util.Map;

public class TranslatorController {
    @FXML
    private TextField portugueseWordInput;
    @FXML
    private TextField englishWordOutput;
    private static final Map<String, String> translationDatabase = new HashMap<>();
    static {
        translationDatabase.put("olá", "hello");
        translationDatabase.put("mundo", "world");
        translationDatabase.put("amor", "love");
        translationDatabase.put("casa", "house");
        translationDatabase.put("escola", "school");
    }


    public void handleTranslateButtonClick() {
        String wordInPortuguese = portugueseWordInput.getText().trim().toLowerCase();
        if (translationDatabase.containsKey(wordInPortuguese)) {
            englishWordOutput.setText(translationDatabase.get(wordInPortuguese));
        } else {
            showAlert("Erro", "Tradução não disponível para a palavra: " + wordInPortuguese);
        }
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
