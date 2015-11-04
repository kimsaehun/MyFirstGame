package game.component;


// TODO: Make this class a singleton class. Only one copy of the game board will exist.
// TODO: Maybe just make a board class. Maybe have a board called playingField for graph and grid.

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a model for the physical game board.
 * <p>
 * A game board is a physical surface of a game.
 * Game components are usually placed on the game board.
 */
public class GameBoard extends Component{
    private final Image image; // The image associated with this board.

    private double width; // The width in pixels
    private double height; // The height in pixels

    private double xCoordinate; // The x coordinate on which this board is drawn.
    private double yCoordinate; // The y coordinate on which this board is drawn.

    private Map<Point2D, Tile> map; // Keeps track of where tiles are placed.

    /**
     * Default Constructor
     */
    public GameBoard() {
        super();
        image = new Image("/res/gameboard/gameboard_background.png");
        width = height = 0;
        xCoordinate = yCoordinate = 0;
        map = new HashMap<>();
    }

    /**
     * Overloaded Constructor
     *
     * @param width The width of this game board in pixels.
     * @param height The height of this game board in pixels.
     * @param xCoordinate The x coordinate on which this board is drawn.
     * @param yCoordinate The Y coordinate on which this board is drawn.
     */
    public GameBoard(double width, double height, double xCoordinate, double yCoordinate) {
        image = new Image("/res/gameboard/gameboard_background.png");
        this.width = 768;
        this.height = 432;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        map = new HashMap<>();
    }

    /**
     * Places a tile at the given location on the game board.
     *
     * @param Point2D The (x, y) coordinate to place the tile at.
     * @param Tile The tile to be placed.
     */
    public void placeTileAt(Point2D xyCoordinate, Tile tile) {
        tile.setXCoordinate(xyCoordinate.getX());
        tile.setYCoordinate(xyCoordinate.getY());
        map.put(xyCoordinate, tile);
    }

    /**
     * Replaces the tile at the given location to the given tile.
     *
     * @param Point2D The location of the tile to replace.
     * @param Tile The new tile to place.
     */
    public void replaceTileAt(Point2D xyCoordinate, Tile tile) {
        map.replace(xyCoordinate, tile);
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, xCoordinate, yCoordinate);
        for (Map.Entry<Point2D, Tile> entry : map.entrySet())
            entry.getValue().draw(graphicsContext);
    }
}
