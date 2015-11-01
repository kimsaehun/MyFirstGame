package game.component;


// TODO: Make this class a singleton class. Only one copy of the game board will exist.
// TODO: Maybe just make a board class. Maybe have a board called playingField for graph and grid.

import javafx.geometry.Point2D;
import javafx.scene.image.Image;

/**
 * Provides a model for the physical game board.
 * <p>
 * A game board is a physical surface of a game.
 * Game components are usually placed on the game board.
 */
public class GameBoard {
    private double width;
    private double height;

    private Image image;

    private final int MAX_COLUMNS = 9;
    private final int MAX_ROWS = 4;

    private Tile[][] graph; // Graph of hexagons
    private Point2D[][] grid; // (x, y)Grid for hexagons

    /**
     * Default Constructor
     */
    public GameBoard(double width, double height) {
        this.width = 768;
        this.height = 432;

        image = new Image("/res/gameboard_background.png");

        // TODO: Put this hexagon graph initialization routine in some other class/interface/method/whatever.
        // Initialize graph for the tiles.
        graph = new Tile[MAX_COLUMNS][MAX_ROWS]; // 11 columns x 4 rows
        grid = new Point2D[MAX_COLUMNS][MAX_ROWS];

        // Hexagon graph alternates from 3 rows and 4 rows.
        for (int column = 0; column < graph.length; column += 2) {
            graph[column][0] = null;
            grid[column][0] = null;
        }

        double startX = 78;
        double startY = 80;
        double padding = 2;
        double tempStartY = startY;
        for (int column = 0; column < graph.length; column++) {
            for (int row = 0; row < graph[column].length; row++) {
                if (column % 2 == 0 && row == 0) {  // if column is 0 or even, only 3 hexagons in the column
                    tempStartY += (64 + 2 * padding) / 2;
                } else {
                    graph[column][row] = new Tile();
                    grid[column][row] = new Point2D(startX + padding, tempStartY + padding);
                    tempStartY += 64 + 2 * padding;
                }
            }
            startX += 64 + 2 * padding;
            tempStartY = startY;
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

    // Getter
    public Point2D getPoint2DAt(int column, int row) {
        return grid[column][row];
    }
}
