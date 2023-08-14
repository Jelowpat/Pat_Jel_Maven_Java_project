package lesson13GenericList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyGenericListTest {

    @Test
    void shouldAddElement() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        myGenericList.add(9);
        int result = myGenericList.size();
        //then
        Assertions.assertEquals(7, result);
    }

    @Test
    void testAddElementAtIndex() {
        //given
        MyGenericList<Integer> myGenericList = new MyGenericList<>(List.of(1,2,3,4,5,6));
        //when
        myGenericList.add(2, 9);
        int result = myGenericList.size();
        Integer valueAtIndex2 = myGenericList.get(2);
        //then
        Assertions.assertAll("should add element at index",
                () -> Assertions.assertEquals(7, result),
                () -> Assertions.assertEquals(9, valueAtIndex2)
                );
    }

    @Test
    void get() {
    }

    @Test
    void remove() {
    }

    @Test
    void size() {
    }
}