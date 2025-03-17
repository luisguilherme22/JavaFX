<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.text.Text?>

<AnchorPane xmlns:fx="http://javafx.com/fxml" fx:controller="MainController">
    <Text text="Tamanho da Senha:" layoutX="20" layoutY="20"/>
    <TextField fx:id="tamanhoInput" layoutX="150" layoutY="10"/>

    <Button text="Gerar Senha" layoutX="150" layoutY="50" onAction="#onGerarSenhaClicked"/>

    <Text text="Senha Gerada:" layoutX="20" layoutY="100"/>
    <TextField fx:id="senhaOutput" layoutX="150" layoutY="90" editable="false"/>
</AnchorPane>
