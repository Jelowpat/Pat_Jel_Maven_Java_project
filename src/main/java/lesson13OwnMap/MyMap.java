package lesson13OwnMap;

import java.util.*;

public class MyMap implements OwnMap{

    private final List<Entry> entries;

    public MyMap() {
        entries = new ArrayList<>();
    }

    public MyMap(Map<String, String> map) {
        this();
        map.forEach(this::put);
    }

    @Override
    public boolean put(String key, String value) {
        return putEntry(new Entry(key, value));
    }

    private boolean putEntry(Entry entry){
        if (containsKey(entry.key)){
            entries.stream()
                    .filter(x -> x.key.equals(entry.key))
                    .findFirst()
                    .get()
                    .value = entry.value;

            return false;
        }
        else {
            entries.add(entry);
            return true;
        }
    }

    @Override
    public boolean containsKey(String key) {
        return entries.stream()
                .anyMatch(x -> x.key.equals(key));
    }

    @Override
    public boolean containsValue(String value) {
        return entries.stream()
                .anyMatch(x -> x.value.equals(value));
    }

    @Override
    public String remove(String key) {
        if (!containsKey(key)){
            throw new NoSuchElementException();
        }
        Entry removedEntry = entries
                .stream()
                .filter(x -> x.key.equals(key))
                .findFirst()
                .get();
        entries.remove(removedEntry);
        return removedEntry.value;
    }

    @Override
    public String get(String key) {
        if (!containsKey(key)){
            throw new NoSuchElementException();
        }
        return entries.stream()
                .filter(x -> x.key.equals(key))
                .findFirst()
                .get()
                .value;
    }

    public int size(){
        return entries.size();
    }


    private static class Entry{
        private final String key;
        private String value;

        public Entry(String key,String value) {
            this.key = key;
            this.value = value;
        }

    }
}
