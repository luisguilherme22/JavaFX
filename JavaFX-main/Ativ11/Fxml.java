<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.text.Text?>
<?import javafx.scene.control.Label?>

<AnchorPane xmlns:fx="http://javafx.com/fxml" fx:controller="MainController">
    <Text text="Capital Inicial (R$):" layoutX="20" layoutY="20"/>
    <TextField fx:id="capitalInput" layoutX="160" layoutY="10"/>

    <Text text="Taxa de Juros (%):" layoutX="20" layoutY="60"/>
    <TextField fx:id="taxaInput" layoutX="160" layoutY="50"/>

    <Text text="Tempo (meses):" layoutX="20" layoutY="100"/>
    <TextField fx:id="tempoInput" layoutX="160" layoutY="90"/>

    <Button text="Calcular" layoutX="150" layoutY="130" onAction="#onCalcularClicked"/>

    <Label fx:id="resultadoLabel" layoutX="150" layoutY="180" style="-fx-font-size: 14px;"/>
</AnchorPane>
