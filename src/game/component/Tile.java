package game.component;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Provides a model for a tile.
 * <p>
 * A tile is a game component used to represent a unit of area on a game board.
 */
public class Tile extends Component{
    private Image image;
    private double xCoordinate;
    private double yCoordinate;

    /**
     * Default Constructor
     */
    public Tile() {
        super();
        image = new Image("res/tile/tile_empty.png");
        xCoordinate = 0;
        yCoordinate = 0;
    }

    /**
     * Overloaded Constructor
     *
     * @param image The image associated with this tile.
     * @param xCoord The x coordinate of this tile on the screen.
     * @param yCoord The y coordinate of this tile on the screen.
     */
    public Tile(Image image, double xCoordinate, double yCoordinate) {
        this.image = image;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, xCoordinate, yCoordinate);
    }

    // Getters and Setters
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getXCoordinate() { return xCoordinate; }

    public double getYCoordinate() { return yCoordinate; }

    public void setXCoordinate(double xCoordinate) { this.xCoordinate = xCoordinate; }

    public void setYCoordinate(double yCoordinate) { this.yCoordinate = yCoordinate; }
}
