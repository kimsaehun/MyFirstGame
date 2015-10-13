package game.gameuniverse.gamesystem;

import game.gameuniverse.gameworld.BeginnersHub;
import game.gameuniverse.gameworld.gamecomponents.GameBoard;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * System used to give vision of the GameWorld
 */
public class VisualSystem {
    private Group group;
    private Scene scene;
    private Canvas canvas;
    private GraphicsContext graphicsContext;

    /**
     * Default Constructor
     */
    public VisualSystem() {
        group = new Group();
        scene = new Scene(group, 300, 275);
        canvas = new Canvas(300, 275);
        graphicsContext = canvas.getGraphicsContext2D();
        group.getChildren().add(canvas);
    }

    // Helper Function
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) { this.scene = scene; }
}
