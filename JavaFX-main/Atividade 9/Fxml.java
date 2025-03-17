<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.text.Text?>

<AnchorPane xmlns:fx="http://javafx.com/fxml" fx:controller="MainController">
    <Text text="Temperatura em Celsius:" layoutX="20" layoutY="20"/>
    <TextField fx:id="celsiusInput" layoutX="160" layoutY="10" />
    <Button text="Converter" layoutX="110" layoutY="50" onAction="#onConverterClicked"/>
</AnchorPane>
