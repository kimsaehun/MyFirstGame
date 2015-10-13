package game.gameuniverse.gamesystem;

import com.sun.media.jfxmedia.events.VideoTrackSizeListener;
import game.gameuniverse.gameworld.BeginnersHub;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Provides the main menu for the game.
 */
public class MainMenu{
    private GridPane layout = new GridPane();
    /**
     * Creates an instance of MainMenu.
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
        layout.add(title, 0, 0);//, 2, 1

        // Add button to start playing
        Button startButton = new Button("Start");
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                // TODO: Enter BeginnersHub
                BeginnersHub hub = new BeginnersHub();
                VisualSystem vs = new VisualSystem();
                vs.drawGameBoard(hub);
                stage.setScene(vs.getScene());
                stage.show();
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(startButton);
        layout.add(hbBtn, 0, 1);
    }

    /**
     * Returns the layout of the Main Menu
     */
    public Pane getLayout() {
        return layout;
    }
}