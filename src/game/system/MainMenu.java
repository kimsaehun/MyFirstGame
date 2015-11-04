package game.system;

import game.component.GameBoard;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// TODO: Fix this whole class.

/**
 * Provides the main menu for the game.
 */
public class MainMenu{
    private GridPane layout = new GridPane();

    /**
     * Default Constructor
     */
    public MainMenu(Stage stage) {
        // Set up the GridPane
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(25, 25, 25, 25));

        // Add title of the MainMenu
        Text title = new Text("Main Menu");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        layout.add(title, 0, 0);

        // Add button to start playing
        Button startButton = new Button("Start");
        GameBoard gameBoard = new GameBoard(768,432, 0, 0);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                GameSystem gs = new GameSystem();
                gs.drawGame();
                stage.setScene(gs.getScene());
                stage.show();
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(startButton);
        layout.add(hbBtn, 0, 1);
    }

    // Getters and Setters
    public Pane getLayout() {
        return layout;
    }
}