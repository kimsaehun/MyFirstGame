package game.concept;

import game.component.Tile;
import javafx.geometry.Point3D;

import java.util.ArrayList;
import java.util.List;

// TODO: Questionable usage of generics.

/**
 * This class provides a map for the hexagonal tiles that is used in the game.
 *
 * This class uses cube coordinates to map the tiles. The origin is at the middle of the topmost row.
 */
public class HexagonTileMap implements Map<Point3D, Tile> {
    private List<Unit> map;
    private int width; // The number of units horizontally
    private int height; // The number of units vertically

    /**
     * Default constructor.
     */
    public HexagonTileMap(){ map  = new ArrayList<>(); }

    /**
     * Overloaded constructor that constructs a hexagon tile map on its own.
     *
     * @param mapWidthInPixels  The desired width of the map.
     * @param mapHeightInPixels The desired height of the map.
     * @param unitSize          The length of one side of a square unit.
     */
    public HexagonTileMap(double mapWidthInPixels, double mapHeightInPixels, double unitSize) {

    }


    /**
     * Inserts a key and a data into the map based on the column and row the tile is in.
     */
    @Override
    public void put(Point3D cubeCoordinate, Tile tile) {
        // TODO: Some how sort while inserting.
        map.add(new Unit(cubeCoordinate, tile));
    }

    /**
     * Returns the value associated with the key.
     *
     * @param point3D The identifier to search for.
     * @return        The value associated with the key.
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
     * @return      True if the value exists in the map. Otherwise returns false.
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
     * Returns the number of key value pairs in the map.
     *
     * @return The size of the map.
     */
    @Override
    public int size() {
        return map.size();
    }

    /**
     * Clears all the key value pairs in the map.
     */
    @Override
    public void clear() {
        map.clear();
    }

    /**
     * This member class is the key value pair for the HexagonTileMap.
     */
    private class Unit{
        private Point3D key;
        private Tile value;

        /**
         * Overloaded Constructor
         *
         * @param key   An identifier corresponding to the value.
         * @param value The actual value/data/content.
         */
        public Unit(Point3D key, Tile value) {
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
