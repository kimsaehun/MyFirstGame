package game.gameuniverse.gameworld.gamecomponents;

import javafx.scene.image.Image;

/**
 * Tile
 */
public class Tile {
    private Image image;

    /**
     * Constructor
     */
    public Tile() {
        image = new Image("/res/tileGrass_tile.png");
    }

    /**
     * Getter method
     */
    public Image getImage() {
        return image;
    }
}
