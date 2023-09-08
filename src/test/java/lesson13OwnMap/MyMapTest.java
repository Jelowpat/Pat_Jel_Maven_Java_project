package lesson13OwnMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.NoSuchElementException;

class MyMapTest {

    private static final Map<String, String> HASH_MAP =Map.of("aaa", "aab", "aac", "aad");

    @Test
    void shouldPutNewElement() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean returnResult = myMap.put("aaf", "aag");
        String result = myMap.get("aaf");

        //then
        Assertions.assertAll("Should verify if addition was completed correctly",
                () -> Assertions.assertEquals("aag", result),
                () -> Assertions.assertEquals(3, myMap.size()),
                () -> Assertions.assertTrue(returnResult)
                );
    }

    @Test
    void shouldChangeExistingElement() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean returnResult = myMap.put("aaa", "aag");
        String result = myMap.get("aaa");

        //then
        Assertions.assertAll("Should verify if change was completed correctly",
                () -> Assertions.assertEquals("aag", result),
                () -> Assertions.assertEquals(2, myMap.size()),
                () -> Assertions.assertFalse(returnResult)
                );
    }

    @Test
    void shouldContainKey() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean result = myMap.containsKey("aaa");

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotContainKey() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean result = myMap.containsKey("aaf");

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldContainValue() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean result = myMap.containsValue("aab");

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotContainValue() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        boolean result = myMap.containsValue("aaa");

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldRemoveElement() {
        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        String value = myMap.get("aaa");
        myMap.remove("aaa");
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
        MyMap myMap = new MyMap(HASH_MAP);

        //when
        String result = myMap.get("aaa");

        //then
        Assertions.assertEquals("aab", result);
    }
    @Test
    void shouldThrowNoSuchElementExceptionWhenKeyDoesNotExistWhenRemovingElement(){

        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //then
        Assertions.assertThrows(NoSuchElementException.class, () -> myMap.remove("aab"));
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenKeyDoesNotExistWhenGettingElement(){

        //given
        MyMap myMap = new MyMap(HASH_MAP);

        //then
        Assertions.assertThrows(NoSuchElementException.class, () -> myMap.get("aab"));
    }

}