package lesson13GenericList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;


class MyGenericListTest {

    @Test
    void shouldAddElement() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        boolean resultBoolean = myGenericList.add(9);
        int result = myGenericList.size();
        //then
        Assertions.assertEquals(7, result);
        Assertions.assertAll("should add element",
                () -> Assertions.assertEquals(7, result),
                () -> Assertions.assertTrue(resultBoolean),
                () -> Assertions.assertEquals(9, myGenericList.get(6))
        );
    }


    @ParameterizedTest
    @CsvSource(value = {"0:7","5:8","4:2","3:1"}, delimiter = ':')
    void testAddElementAtIndex(int index, int value) {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        boolean resultBoolean = myGenericList.add(index, value);
        int result = myGenericList.size();
        Integer valueAtIndex = myGenericList.get(index);
        //then
        Assertions.assertAll("should add element at index",
                () -> Assertions.assertEquals(7, result),
                () -> Assertions.assertTrue(resultBoolean),
                () -> Assertions.assertEquals(value, valueAtIndex)
                );
    }

    @Test
    void shouldGetElementByIndex() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        int result = myGenericList.get(4);
        //then
        Assertions.assertEquals(5, result);

    }

    @Test
    void shouldRemoveElemntByValue() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        MyGenericList<Integer> unchangedList = new MyGenericList<>(myGenericList);
        //when
        boolean result = myGenericList.remove(3);
        //then
        Assertions.assertAll("Should remove element",
                () -> Assertions.assertTrue(result),
                () -> Assertions.assertEquals(unchangedList.get(4), myGenericList.get(3)),
                () -> Assertions.assertEquals(unchangedList.get(5), myGenericList.get(4)),
                () -> Assertions.assertEquals(5, myGenericList.size())
        );
    }

    @Test
    void shouldGetSize() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        int result = myGenericList.size();
        //then
        Assertions.assertEquals(6, result);
    }
}