package game.system;

import game.component.GameBoard;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * System used to give vision of the game.
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
        scene = new Scene(group, 768, 432);
        canvas = new Canvas( 768, 432);
        graphicsContext = canvas.getGraphicsContext2D();
        group.getChildren().add(canvas);
    }

    // Temporary function just to get something running
    public void displayGameBoard(GameBoard gameBoard) {
        gameBoard.draw(graphicsContext);
    }

    // Getters and Setters
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) { this.scene = scene; }
}
