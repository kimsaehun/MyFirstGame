package game.gameuniverse.gameworld;

import game.gameuniverse.gameworld.gamecomponents.GameBoard;

/**
 * The first GameWorld the player comes in contact with.
 */
public class BeginnersHub {
    private GameBoard board;

    /**
     * Constructor
     */
    public BeginnersHub() {
        board = new GameBoard();
    }

    /**
     * Getter for board
     */
    public GameBoard getBoard() {
        return board;
    }
}
