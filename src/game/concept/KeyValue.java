package game.concept;

/**
 * Interface for an object that holds a key and a value.
 *
 * @param <K> An identifier corresponding to the value.
 * @param <V> The actual value/data/content.
 */
public interface KeyValue<K, V> {
    public K getKey();

    public V getValue();
}
