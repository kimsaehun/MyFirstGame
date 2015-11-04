package game.system;

// TODO: Complete this class.

import game.component.Component;
import game.component.GameBoard;
import game.component.Tile;
import javafx.geometry.Point2D;
import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will handle all interactions between the player and the game.
 */
public class GameSystem {
    // The game system is composed of other systems.
    private VisualSystem visualSystem;

    private List<Component> components; // A list of all the components used.

    /**
     * Default constructor.
     */
    public GameSystem() {
        components = new ArrayList<>(0);
        visualSystem = new VisualSystem();
        setUpGame();
    }

    // One of the first things to do is set up the game according to the rules.
    /**
     * Sets up the game for a play through.
     */
    public void setUpGame() {
        GameBoard gameBoard = new GameBoard(768, 532, 0, 0);
        gameBoard.placeTileAt(new Point2D(0,0), new Tile());
        components.add(gameBoard);
    }

    // TODO: Put this in the game loop
    public void drawGame() {
        for (Component component: components) {
            visualSystem.draw(component);
        }
    }

    // TEMPORARY FUNCTION
    public Scene getScene() {
        return visualSystem.getScene();
    }
}
