package test.lrucache;


import java.util.*;

public class LRUCache {
    private Map<Integer, Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity);
    }

    public boolean isEmpty() {
        return cache.isEmpty();
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
            cache.put(key, value);
        }
        else {
            if (cache.size() == capacity) {
                int firstKey = cache.keySet().iterator().next();
                cache.remove(firstKey);
            }
            cache.put(key, value);
        }
    }

    public Object get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.get(key);
            cache.remove(key);
            cache.put(key, value);
            return cache.get(key);
        }
        return -1;
    }

    public void print(){
        cache.forEach((integer, integer2) -> System.out.println("Cache contains key="+integer+" and value=" +integer2));
    }

    public int size() {
        return cache.size();
    }
}
