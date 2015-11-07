package game.system;

// TODO: Complete this class.

import game.component.Component;
import javafx.geometry.Point2D;
import javafx.scene.Scene;

import java.util.Map;

/**
 * This class will handle all interactions between the player and the game.
 */
public class GameSystem {
    // The game system is composed of other systems.
    private VisualSystem visualSystem;
    private ComponentHandler componentHandler;

    /**
     * Default constructor.
     */
    public GameSystem() {
        visualSystem = new VisualSystem();
        componentHandler = new ComponentHandler();

        setUpGame();
    }

    // One of the first things to do is set up the game according to the rules.

    /**
     * Sets up the game for a play through.
     */
    public void setUpGame() {
        componentHandler.setUpComponents();
    }

    // TODO: Put this in the game loop
    public void drawGame() {
        Map<Point2D, Component> map = componentHandler.getComponents();
        for (Map.Entry<Point2D, Component> entry : map.entrySet()) {
            visualSystem.draw(entry.getKey(), entry.getValue());
        }
    }

    // TEMPORARY FUNCTION
    public Scene getScene() {
        return visualSystem.getScene();
    }
}
