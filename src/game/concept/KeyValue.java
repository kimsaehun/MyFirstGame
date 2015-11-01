package game.concept;

/**
 * Generic object that holds a key and a value.
 *
 * @param <Key> An identifier corresponding to the value.
 * @param <Value> The actual value/data/content.
 */
public class KeyValue<Key, Value> {
    private Key key;
    private Value value;

    /**
     * Default Constructor
     */
    public KeyValue() {
        key = null;
        value = null;
    }

    /**
     * Overloaded Constructor
     *
     * @param key An identifier corresponding to the value.
     * @param value The actual value/data/content.
     */
    public KeyValue(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }
}
