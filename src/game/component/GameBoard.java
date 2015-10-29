package game.component;


// TODO: make this class a singleton class. Only one copy of the game board will exist.

import game.concept.Graph;
import javafx.scene.image.Image;

/**
 * Provides a model for the physical game board.
 *
 * A game board is a physical surface of a game.
 * Game components are usually placed on the game board.
 */
public class GameBoard {
    public final double WIDTH = 768;
    public final double HEIGHT = 432;

    private Image image;

    private Graph graph;

    /**
     * Default Constructor
     */
    public GameBoard() {
        // TODO: Initialize variables.
        // TODO: Graph of hexagons. Vertical orientation. Cube Coordinate. [-5, 5] x [-3, 3] x [-2, 2]
    }
}
