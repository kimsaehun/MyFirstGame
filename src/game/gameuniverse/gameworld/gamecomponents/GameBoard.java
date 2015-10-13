package game.gameuniverse.gameworld.gamecomponents;

/**
 * GameBoard
 */
public class GameBoard {
    private Tile tile;
    private double tileX;
    private double tileY;
    /**
     * Constructor
     */
    public GameBoard() {
        tile = new Tile();
        tileX = 0;
        tileY = 0;
    }

    /**
     * Getter method for tile
     */
    public Tile getTile() {
        return tile;
    }

    /**
     * Getter method for tileX
     */
    public double getTileX() {
        return tileX;
    }

    /**
     * Getter method for tileY
     */
    public double getTileY(){
        return tileY;
    }
}
