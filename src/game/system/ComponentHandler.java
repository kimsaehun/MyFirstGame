package game.system;

import game.component.Board;
import game.component.Component;
import game.component.Tile;
import javafx.geometry.Point2D;
import javafx.geometry.Point3D;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is used by the GameSystem to operate on all components.
 */
public class ComponentHandler {
    private Map<Point2D, Board> boards;
    private Map<Point2D, Tile> tiles;
    private HexagonTileMap hexagonTileMap;

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

    // TODO: Clean this method.

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
        hexagonTileMap = new HexagonTileMap();
    } // END private void initializeHexagonMap

    /**
     * Used to map hexagon tile using cube coordinates.
     */
    private class HexagonTileMap {
        private Map<Point3D, Tile> map;

        // TODO: Clean up the hexagon tile map construction.

        /**
         * Default Constructor
         * <p>
         * Constructs a hexagon tile map using cube coordinates using the tiles map in the outer class.
         * Origin will be set up at the topmost hexagon of the left most column.
         */
        public HexagonTileMap() {
            map = new HashMap<>(0);

            Point2D tempKey;
            Tile tempTile;
            Point3D temp3dCoordinate;

            for (Map.Entry<Point2D, Tile> entry : tiles.entrySet()) {
                tempKey = entry.getKey();
                tempTile = entry.getValue();

                temp3dCoordinate = pixelsToCube(tempKey);
                map.put(temp3dCoordinate, tempTile);
                System.out.println(tempKey + "\t" + temp3dCoordinate);
            }
            System.out.println(map.size() + "  tiles: " + tiles.size());
        } // END public HexagonTileMap()

        /**
         * Converts xy coordinate of pixels to cube coordinates
         */
        public Point3D pixelsToCube(Point2D pixels) {
            Point3D tempCube;
            double tempX = pixels.getX();
            double tempY = pixels.getY();

            double startX = 64;
            double startY = 56;
            double unitSize = 64;
            double paddingX = 7;
            double paddingY = 16;

            double originX = startX + (paddingX / 2);
            double originY = startY + ((unitSize + paddingY) / 2) + (paddingY / 2);

            double xCube = 0, yCube = 0, zCube = 0;

            // Reset all coordinate values
            xCube = yCube = zCube = 0;

            // Find the x cube coordinate
            while (tempX > originX + unitSize) {
                xCube++;
                tempX -= unitSize + paddingX;
            }

            // Find the Y cube coordinate
            // Horizontally line up all the tiles with the same y cube coordinate.
            for (int i = 0; i < xCube; i++) {
                tempY += (unitSize + paddingY) / 2;
            }
            while (tempY > originY + unitSize) {
                yCube--;
                tempY -= unitSize + paddingY;
            }

            // Calculate the z cube coordinate
            zCube = (-xCube) + (-yCube) + 0.0; // Adding 0.0 gets rid of negative 0.0


            tempCube = new Point3D(xCube, yCube, zCube);
            return tempCube;
        }
    } // END public class HexagonTileMap
}
