package game.component;


// TODO: make this class a singleton class. Only one copy of the game board will exist.

import javafx.scene.image.Image;

/**
 * Provides a model for the physical game board.
 *
 * A game board is a physical surface of a game.
 * Game components are usually placed on the game board.
 */
public class GameBoard {
    private double width;
    private double height;

    private Image image;

    private final int MAX_COLUMN = 11;
    private Tile[][] graph;

    /**
     * Default Constructor
     */
    public GameBoard(double width, double height) {
        this.width = 768;
        this.height = 432;

        // TODO: Set background image.

        // TODO: Put this hexagon graph initialization routine in some other class/interface/method/whatever.
        // Initialize graph for the tiles.
        graph = new Tile[11][4]; // 11 columns x 4 rows
        // Hexagon graph alternates from 3 rows and 4 rows.
        for (int column = 0; column < graph.length; column += 2) {
            graph[column][0] = null;
        }
        for (int column = 0; column < graph.length; column++) {
            for (int row = 0; row < graph[column].length; row++) {
                if (graph[column][row] != null) graph[column][row].setImage(new Image("/res/tileGrass_tile.png"));
            }
        }
    }

    // Place tile at the given x,y coordinate
    public void placeTile(int column, int row, Tile tile) {
        graph[column][row].setImage(tile.getImage());
    }

    // Getter
    public Tile getTileAt(int column, int row) {
        return graph[column][row];
    }

    // Getter
    public Tile[][] getGraph() {
        return graph;
    }
}
