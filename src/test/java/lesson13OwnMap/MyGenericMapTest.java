package lesson13OwnMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.NoSuchElementException;

class MyGenericMapTest {

    private static final Map<String, Integer> HASH_MAP =Map.of("aaa", 1, "aac", 2);

    @Test
    void shouldPutNewElement() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean returnResult = myMap.put("aaf", 3);
        Integer result = myMap.get("aaf");

        //then
        Assertions.assertAll("Should verify if addition was completed correctly",
                () -> Assertions.assertEquals(3, result),
                () -> Assertions.assertEquals(3, myMap.size()),
                () -> Assertions.assertTrue(returnResult)
                );
    }

    @Test
    void shouldChangeExistingElement() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean returnResult = myMap.put("aaa", 3);
        Integer result = myMap.get("aaa");

        //then
        Assertions.assertAll("Should verify if change was completed correctly",
                () -> Assertions.assertEquals(3, result),
                () -> Assertions.assertEquals(2, myMap.size()),
                () -> Assertions.assertFalse(returnResult)
        );
    }

    @Test
    void shouldContainKey() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean result = myMap.containsKey("aaa");

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotContainKey() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean result = myMap.containsKey("aaf");

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldContainValue() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean result = myMap.containsValue(1);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotContainValue() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        boolean result = myMap.containsValue(3);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldRemoveElement() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        Integer value = myMap.remove("aaa");
        boolean result = myMap.containsKey("aaa");
        boolean resultValue = myMap.containsValue(value);

        //then
        Assertions.assertAll("Should verify if an element was removed correctly",
                () -> Assertions.assertFalse(result),
                () -> Assertions.assertFalse(resultValue),
                () -> Assertions.assertEquals(1, myMap.size()));
    }

    @Test
    void shouldGetValueFromKey() {
        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //when
        Integer result = myMap.get("aaa");

        //then
        Assertions.assertEquals(1, result);
    }
    @Test
    void shouldThrowNoSuchElementExceptionWhenKeyDoesNotExistWhenRemovingElement(){

        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //then
        Assertions.assertThrows(NoSuchElementException.class, () -> myMap.remove("aab"));
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenKeyDoesNotExistWhenGettingElement(){

        //given
        MyGenericMap<String, Integer> myMap = new MyGenericMap<>(HASH_MAP);

        //then
        Assertions.assertThrows(NoSuchElementException.class, () -> myMap.get("aab"));
    }

}