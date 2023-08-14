package lesson13OwnMap;

import java.util.*;

public class MyMap implements OwnMap{

    private final List<String> keys;
    private final List<String> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public MyMap(Map<String, String> map) {
        values = new ArrayList<>(map.values());
        keys = new ArrayList<>(map.keySet());
    }

    @Override
    public boolean put(String key, String value) {
        if (keys.contains(key)){
            values.set(keys.indexOf(key), value);
            return false;
        }else{
            keys.add(key);
            values.add(value);
            return true;
        }
    }

    @Override
    public boolean containsKey(String key) {
        return keys.contains(key);
    }

    @Override
    public boolean containsValue(String value) {
        return values.contains(value);
    }

    @Override
    public String remove(String key) {
        if (!keys.contains(key)){
            throw new NoSuchElementException();
        }
        String removedValue = values.remove(keys.indexOf(key));
        keys.remove(key);
        return removedValue;
    }

    @Override
    public String get(String key) {
        if (!keys.contains(key)){
            throw new NoSuchElementException();
        }
        return values.get(keys.indexOf(key));
    }

    public int size(){
        return keys.size();
    }

}
