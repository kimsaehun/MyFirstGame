package game.gameuniverse.gameworld.gamecomponents;

import game.gameuniverse.Hexagon;
import game.gameuniverse.Shape2D;
import javafx.scene.image.Image;

/**
 * Provides a model for a tile.
 *
 * A tile is a game component used to represent a unit of area on a game board.
 */
public class Tile {
    private Image image;
    private Shape2D shape;
    private double sideLength;

    /**
     * Default Constructor
     */
    public Tile() {
        sideLength = 0;
        shape = new Hexagon();
        image = null;
    }

    /**
     * Overloaded Constructor
     *
     * @param sideLength the length of one side of the tile
     * @param image the associated image for the tile
     */
    public Tile(double sideLength, Image image) {
        this.sideLength = sideLength;
        shape = new Hexagon(sideLength);
        this.image = image;
    }

    // Helper Functions
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) { this.image = image;}
}
