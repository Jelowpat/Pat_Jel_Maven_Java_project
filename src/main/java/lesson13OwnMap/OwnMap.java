package lesson13OwnMap;

public interface OwnMap {
    boolean put(String key, String value);
    boolean containsKey(String key);
    boolean containsValue(String value);
    String remove(String key);
    String get(String key);
}
