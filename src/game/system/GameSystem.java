package game.system;

// TODO: Complete this class.

import game.component.Board;
import game.component.Component;
import game.component.Tile;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will handle all interactions between the player and the game.
 */
public class GameSystem {
    private final Image IMAGE_GAMEBOARD = new Image("/res/gameboard/gameboard_background.png");
    private final Image IMAGE_EMPTY_TILE = new Image("/res/tile/tile_empty.png");

    // The game system is composed of other systems.
    private VisualSystem visualSystem;

    private List<Component> componentList; // A list of all the components used.

    /**
     * Default constructor.
     */
    public GameSystem() {
        componentList = new ArrayList<>(0);
        visualSystem = new VisualSystem();
        setUpGame();
    }

    // One of the first things to do is set up the game according to the rules.
    /**
     * Sets up the game for a play through.
     */
    public void setUpGame() {
        Board gameBoard = new Board(IMAGE_GAMEBOARD, 768, 532, 0, 0);
        gameBoard.place(new Tile(IMAGE_EMPTY_TILE, 0, 0));
        // GameBoard gameBoard = new GameBoard(768, 532, 0, 0);
        // gameBoard.placeTileAt(new Point2D(0,0), new Tile());
        componentList.add(gameBoard);
    }

    // TODO: Put this in the game loop
    public void drawGame() {
        for (Component component: componentList) {
            visualSystem.draw(component);
        }
    }

    // TEMPORARY FUNCTION
    public Scene getScene() {
        return visualSystem.getScene();
    }
}
