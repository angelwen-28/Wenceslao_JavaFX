<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.*?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>

<AnchorPane xmlns="http://javafx.com/javafx"
            xmlns:fx="http://javafx.com/fxml"
            prefWidth="400" prefHeight="300"
            style="-fx-background-color: linear-gradient(to bottom, #004080, #0066cc);">

    <!-- Container -->
    <VBox spacing="15" alignment="CENTER" prefWidth="300" layoutX="50" layoutY="40">
        
        <!-- Title -->
        <Label text="LOGIN" textFill="white" style="-fx-font-size: 24px; -fx-font-weight: bold;" />

        <!-- Username -->
        <HBox spacing="10" alignment="CENTER_LEFT">
            <ImageView fitHeight="20" fitWidth="20">
                <image>
                    <!-- you can set your own icon here -->
                    <!-- <Image url="@user_icon.png"/> -->
                </image>
            </ImageView>
            <TextField fx:id="usernameField" promptText="Username"
                       style="-fx-pref-width: 250; -fx-background-radius: 5;" />
        </HBox>

        <!-- Password -->
        <HBox spacing="10" alignment="CENTER_LEFT">
            <ImageView fitHeight="20" fitWidth="20">
                <image>
                    <!-- <Image url="@lock_icon.png"/> -->
                </image>
            </ImageView>
            <PasswordField fx:id="passwordField" promptText="Password"
                           style="-fx-pref-width: 250; -fx-background-radius: 5;" />
        </HBox>

        <!-- Login Button -->
        <Button text="LOGIN" fx:id="loginBtn"
                style="-fx-background-color: #00bcd4; -fx-text-fill: white; -fx-pref-width: 300; -fx-background-radius: 5; -fx-font-weight: bold;" />

        <!-- Forgot Password -->
        <Hyperlink text="Forgot Password?" textFill="white"
                   style="-fx-font-size: 12px;" />

    </VBox>
</AnchorPane>
