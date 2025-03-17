<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.control.Alert?>
<?import javafx.scene.control.Alert.AlertType?>

<VBox xmlns:fx="http://javafx.com/fxml" fx:controller="VerificadorPalindromoController">
    <TextField fx:id="inputField" promptText="Digite uma palavra ou frase"/>
    <Button text="Verificar" onAction="#verificarPalindromo"/>
</VBox>
