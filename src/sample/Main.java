package sample;

import game.gameuniverse.gamesystem.MainMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MyFirstGame");
        MainMenu mainMenu = new MainMenu(primaryStage);
        Scene titleScene = new Scene(mainMenu.getLayout(), 300, 275);
        primaryStage.setScene(titleScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
