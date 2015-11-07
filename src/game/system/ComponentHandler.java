package game.system;

import game.component.Board;
import game.component.Component;
import game.component.Tile;
import javafx.geometry.Point2D;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is used by the GameSystem to operate on all components.
 */
public class ComponentHandler {
    private Map<Point2D, Board> boards;
    private Map<Point2D, Tile> tiles;

    /**
     * Default Constructor
     */
    public ComponentHandler() {
        boards = new HashMap<>(0);
        tiles = new HashMap<>(0);
    }

    /**
     * Called by GameSystem's setUp call to ready the game for a play through.
     */
    public void setUpComponents() {
        // Add the game board.
        boards.put(new Point2D(0, 0), new Board(Board.Type.GAMEBOARD));

        // Add the initial tiles
        initializeHexagonMap();
    }

    public List<Map.Entry<Point2D, ? extends Component>> getComponents() {
        List<Map.Entry<Point2D, ? extends Component>> componentList = new ArrayList<>(0);
        componentList.addAll(boards.entrySet().stream().collect(Collectors.toList()));
        componentList.addAll(tiles.entrySet().stream().collect(Collectors.toList()));
        return componentList;
    }

    /**
     * Helper function used to Initialize the hexagon tile map.
     */
    private void initializeHexagonMap() {
        int numColumn = 9;
        int numRow;
        int smallColumn = 3;
        int bigColumn = 4;
        double startX = 64;
        double startY = 56;
        double unitSize = 64;
        double paddingX = 7;
        double paddingY = 16;
        double tempX = startX;
        double tempY = startY;
        Point2D tempCoordinate;
        for (int column = 0; column < numColumn; column++) {
            tempX += (unitSize + paddingX) * column;
            numRow = (column % 2 == 0 ? smallColumn : bigColumn);
            if (numRow == smallColumn) {
                tempY += (unitSize + paddingY) / 2;
            }
            for (int row = 0; row < numRow; row++) {
                tempCoordinate = new Point2D(tempX + (paddingX / 2), tempY + (paddingY / 2));
                tiles.put(tempCoordinate, new Tile(Tile.Type.EMPTY));
                tempY += unitSize + paddingY;
                //System.out.println(tempCoordinate);
            }
            tempX = startX;
            tempY = startY;
        }
        //System.out.println(tiles.size() + " tiles");
    }
}
