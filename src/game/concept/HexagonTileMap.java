package game.concept;

import game.component.Tile;
import javafx.geometry.Point3D;

// TODO: Questionable usage of generics.

/**
 * This class provides a map for the hexagonal tiles that is used in the game.
 *
 * This class uses cube coordinates to map the tiles. The origin is at the middle of the topmost row.
 */
public class HexagonTileMap implements Map<Point3D, Tile> {
    private Entry[] map;

    /**
     * Default constructor.
     */
    public HexagonTileMap(int size) {
       map = new Entry[size];
    }

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
    public Tile get(Point3D cubeCoordinate) {
        // TODO: Given the cube coordinate, return the corresponding tile.
        return null;
    }

    /**
     * Returns a true if the value is found in the map.
     *
     * @param value The value to search for.
     */
    @Override
    public boolean contains(Tile value) {
        // TODO: Search for the value and return a boolean.
        return false;
    }

    /**
     * Replaces the original value at the given key with the given value.
     *
     * @param key      Key associated with the new value.
     * @param newValue The new value to be associated with the key.
     */
    @Override
    public void replace(Point3D key, Tile newValue) {
        // TODO: Replaces old value with new value.
    }

    /**
     * This member class is the key value pair for the HexagonTileMap.
     */
    private class Entry{
        private Point3D key;
        private Tile value;

        /**
         * Overloaded Constructor
         *
         * @param key   An identifier corresponding to the value.
         * @param value The actual value/data/content.
         */
        public Entry(Point3D key, Tile value) {
            this.key = key;
            this. value = value;
        }

        // Getters
        public Point3D getKey() {
            return null;
        }

        // Getters
        public Tile getValue() {
            return null;
        }
    }
}
