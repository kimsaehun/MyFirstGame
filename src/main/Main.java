package main;

import game.system.MainMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is the entry point of the program.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MyFirstGame");
        MainMenu mainMenu = new MainMenu(primaryStage);
        Scene titleScene = new Scene(mainMenu.getLayout(), 768, 432);
        primaryStage.setScene(titleScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
