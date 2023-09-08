package lesson13OwnMap;

import java.util.*;

public class MyGenericMap<K,V> {
    private final List<K> keys;
    private final List<V> values;

    public MyGenericMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public MyGenericMap(Map<K,V> map) {
        values = new ArrayList<>(map.values());
        keys = new ArrayList<>(map.keySet());
    }

    public boolean put(K key, V value) {
        if (keys.contains(key)){
            values.set(keys.indexOf(key), value);
            return false;
        }else{
            keys.add(key);
            values.add(value);
            return true;
        }
    }

    public boolean containsKey(K key) {
        return keys.contains(key);
    }

    public boolean containsValue(V value) {
        return values.contains(value);
    }

    public V remove(K key) {
        if (!keys.contains(key)){
            throw new NoSuchElementException();
        }
        V removedValue = values.remove(keys.indexOf(key));
        keys.remove(key);
        return removedValue;
    }

    public V get(K key) {
        if (!keys.contains(key)){
            throw new NoSuchElementException();
        }
        return values.get(keys.indexOf(key));
    }

    public int size() {
        return keys.size();
    }
}
