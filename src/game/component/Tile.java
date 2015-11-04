package game.component;

import game.concept.Hexagon;
import game.concept.Shape2D;
import game.system.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Provides a model for a tile.
 *
 * A tile is a game component used to represent a unit of area on a game board.
 */
public class Tile implements Drawable{
    private Image image;
    private Shape2D shape;
    private double sideLength;

    /**
     * Default Constructor
     */
    public Tile() {
        sideLength = 0;
        shape = new Hexagon();
        image = new Image ("res/tile/tile_empty.png");
    }

    /**
     * Overloaded Constructor
     *
     * @param orientation the orientation of the tile.
     * @param sideLength the length of one side of the tile.
     * @param image the associated image for the tile.
     */
    public Tile(Hexagon.Orientation orientation, double sideLength, Image image) {
        this.sideLength = sideLength;
        shape = new Hexagon(orientation, sideLength);
        this.image = image;
    }

    // Getters and Setters
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) { this.image = image;}

    /**
     * Draws the class onto the screen.
     *
     * @param graphicsContext
     */
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(image, 0, 0);
    }
}
