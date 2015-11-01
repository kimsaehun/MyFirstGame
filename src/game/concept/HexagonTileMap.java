package game.concept;

import game.component.Tile;
import javafx.geometry.Point3D;

/**
 * This class provides a map for the hexagonal tiles that is used in the game.
 */
public class HexagonTileMap implements Map<Point3D, Tile> {
    private KeyValue<Point3D, Tile>[] map;

    /**
     * Inserts a key and a data into the map.
     */
    @Override
    public void insert(Point3D cubeCoordinate, Tile tile) {
        // TODO: Insert based on the column and row the tile is in.
    }

    /**
     * Returns the value associated with the key.
     *
     * @param point3D The identifier to search for.
     */
    @Override
    public Tile get(Point3D cubeCoordiante) {
        // TODO: Given the cube coordinate, return the corresponding tile.
        return null;
    }
}
