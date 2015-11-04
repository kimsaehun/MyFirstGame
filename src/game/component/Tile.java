package game.component;

import game.concept.Hexagon;
import game.concept.Shape2D;
import game.system.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Provides a model for a tile.
 * <p>
 * A tile is a game component used to represent a unit of area on a game board.
 */
public class Tile implements Drawable {
    private Image image;
    private double xCoord;
    private double yCoord;

    /**
     * Default Constructor
     */
    public Tile() {
        image = new Image("res/tile/tile_empty.png");
        xCoord = 0;
        yCoord = 0;
    }

    /**
     * Overloaded Constructor
     *
     * @param xCoord The x coordinate of this tile on the screen.
     * @param yCoord The y coordinate of this tile on the screen.
     */
    public Tile(double xCoord, double yCoord) {
        image = new Image("res/tile/tile_empty.png");
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    // Getters and Setters
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, xCoord, yCoord);
    }
}
