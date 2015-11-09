package game.component;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Provides a model for a tile.
 * <p>
 * A tile is a game component used to represent a unit of area on a game board.
 */
public class Tile extends Component {
    // Different images for different tiles.
    private final Image TILE_EMPTY = new Image("res/tile/tile_empty.png");
    private final Image TILE_ORANGE = new Image("res/tile/tile_orange.png");
    private final Image TILE_GREEN = new Image("res/tile/tile_green.png");

    private Type type;
    private int priority;
    private Image image;
    private double width; // Width of this tile in pixels
    private double height; // Height of this tile in pixels
    private Point2D coordinate;

    /**
     * Default Constructor
     */
    public Tile() {
        priority = 1;
        image = null;
        width = height = 0;
        coordinate = new Point2D(0, 0);
    }

    /**
     * Overloaded Constructor
     *
     * @param type The type of this tile.
     */
    public Tile(Type type) {
        priority = 1;
        this.type = type;
        image = null;
        coordinate = new Point2D(0, 0);
    }

    /**
     * Returns the component's type.
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * Sets the component's type.
     */
    @Override
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Gets the image based on the component's type.
     *
     * @return The image associated with the component.
     */
    @Override
    public Image getImage() {
        switch (type) {
            case TILE_EMPTY:
                return TILE_EMPTY;
            case TILE_GREEN:
                return TILE_GREEN;
            case TILE_ORANGE:
                return TILE_ORANGE;
            default:
                return null;
        }
    }

    /**
     * Sets the priority level of the component.
     *
     * @param priority
     */
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Returns the priority level of the component.
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, coordinate.getX(), coordinate.getY());
    }

    // Getters and Setters

    public void setImage(Image image) {
        this.image = image;
    }

    public Point2D getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point2D coordinate) {
        this.coordinate = coordinate;
    }
}