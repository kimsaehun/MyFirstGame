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
    private Type type;
    private double priority;
    private Image image;
    private double width; // Width of this tile in pixels
    private double height; // Height of this tile in pixels
    private Point2D coordinate;

    /**
     * Default Constructor
     */
    public Tile() {
        super();
        image = new Image("res/tile/tile_empty.png");
        width = height = 0;
        coordinate = new Point2D(0, 0);
    }

    /**
     * Overloaded Constructor
     *
     * @param type The type of this tile.
     */
    public Tile(Type type) {
        this.type = type;
        image = new Image("res/tile/tile_empty.png");
        coordinate = new Point2D(0, 0);
    }

    /**
     * Overloaded Constructor
     *
     * @param coordinate The coordinate of where this object is drawn.
     */
    public Tile(Point2D coordinate) {
        image = new Image("res/tile/tile_empty.png");
        this.coordinate = coordinate;
    }

    /**
     * Overloaded Constructor
     *
     * @param image      The image associated with this tile.
     * @param width      The width of this game board in pixels.
     * @param height     The height of this game board in pixels.
     * @param coordinate The coordinate of where this object is drawn.
     */
    public Tile(Image image, double width, double height, Point2D coordinate) {
    this.image = image;
    this.width = width;
    this.height = height;
    this.coordinate = coordinate;
    }


    /**
     * Returns the components type.
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * Sets the priority level of the component.
     *
     * @param priority
     */
    @Override
    public void setPriority(double priority) {
        this.priority = priority;
    }

    /**
     * Returns the priority level of the component.
     */
    @Override
    public double getPriority() {
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
    public Image getImage() {
        return image;
    }

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