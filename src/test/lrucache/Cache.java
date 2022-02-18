package test.lrucache;

public interface Cache<K,V> {

    boolean isEmpty();

    void put(K key, V value);

    V get (K key);

    int size();
}
