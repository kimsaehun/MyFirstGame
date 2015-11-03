package game.concept;

/**
 * An interface for a data structure that organizes contents(value) based on its identifier(key).
 */
public interface Map<K, V> {
    /**
     * Inserts a key and a data into the map.
     *
     * @param key The identifier of the value.
     * @param value The value to be stored.
     */
    public void insert(K key, V value);

    /**
     * Returns the value associated with the key.
     *
     * @param key The identifier to search for.
     */
    public V get(K key);

    /**
     * Returns a true if the value is found in the map.
     *
     * @param value The value to search for.
     */
    public boolean contains(V value);

    /**
     * Replaces the original value at the given key with the given value.
     *
     * @param key Key associated with the new value.
     * @param newValue The new value to be associated with the key.
     */
    public void replace(K key, V newValue);
}
