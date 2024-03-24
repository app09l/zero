/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package menutest;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text newGame = createMenuItem("New Game");
        Text loadGame = createMenuItem("Load Game");
        Text settings = createMenuItem("Settings");
        Text quit = createMenuItem("Quit");

        VBox menuBox = new VBox(30, newGame, loadGame, settings, quit);
        menuBox.setAlignment(Pos.CENTER);
        menuBox.setPadding(new Insets(50));
        menuBox.setStyle("-fx-background-color: #202020;");

        Scene scene = new Scene(menuBox, 800, 600);
        scene.setFill(Color.BLACK);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setTitle("Persona 5 Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Text createMenuItem(String text) {
        Text menuItem = new Text(text);
        menuItem.setFont(Font.loadFont(getClass().getResourceAsStream("Persona5MenuFontPrototype-Regular.ttf"), 36));
        menuItem.setFill(Color.WHITE);
        return menuItem;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
