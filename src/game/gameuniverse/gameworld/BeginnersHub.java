package game.gameuniverse.gameworld;

import game.gameuniverse.gameworld.gamecomponents.GameBoard;

/**
 * The first GameWorld the player comes in contact with.
 */
public class BeginnersHub {
    private GameBoard board;

    /**
     * Default Constructor
     */
    public BeginnersHub() {
        board = new GameBoard();
    }

    // Helper Functions
    public GameBoard getBoard() { return board; }
}
