package game.concept;

/**
 * An interface for a data structure that organizes contents(value) based on its identifier(key).
 */
public interface Map<Key, Value> {
    /**
     * Inserts a key and a data into the map.
     *
     * @param keyValue The key and value to be inserted.
     */
    public void insert(Key key, Value value);

    /**
     * Returns the value associated with the key.
     *
     * @param key The identifier to search for.
     */
    public Value get(Key key);
}
