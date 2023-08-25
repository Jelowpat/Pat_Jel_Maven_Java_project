package lesson12MyList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

class MyListTest {

    @Test
    public void shouldGetListSize(){
        //given
        MyList list = new MyList(List.of(1,2,3,4,5));
        //when
        int result = list.size();
        //then
        Assertions.assertEquals(5, result);
    }
    @Test
    public void shouldBeEmpty(){
        //given
        MyList list = new MyList();
        //when
        boolean result = list.isEmpty();
        //then
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldBeNotEmpty(){
        //given
        MyList list = new MyList(List.of(1,2,3,4,5));
        //when
        boolean result = list.isEmpty();
        //then
        Assertions.assertFalse(result);
    }
    @Test
    public void shouldAddAtTheEndOfTheList(){
        //given
        MyList list = new MyList(List.of(1,2,3,4,5));
        //when
        list.add(6);
        int result = list.get(5);
        //then
        Assertions.assertEquals(6, result);
    }
    @Test
    public void shouldGetElementByIndex(){
        //given
        MyList list = new MyList(List.of(1,2,3,4,5));
        //when
        int result = list.get(2);
        //then
        Assertions.assertEquals(3, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"0:7", "3:9", "4:4","5:11"}, delimiter = ':')
    public void shouldAddElementAtIndex(int index, int element){
        //given
        MyList list = new MyList(Arrays.asList(1,2,3,4,5));
        //when
        list.add(index,element);
        int result = list.get(index);
        //then
        Assertions.assertEquals(element, result);
    }
    @ParameterizedTest
    @CsvSource(value = {"4:5", "0:1", "3:4"}, delimiter = ':')
    public void shouldRemoveElementByIndex(int index, int value){
        //given
        MyList list = new MyList(List.of(1,2,3,4,5));
        //when
        int result = list.remove(index);
        int sizeResult = list.size();
        //then
        Assertions.assertAll("should remove value by index",
                () ->Assertions.assertEquals(value, result),
                () ->Assertions.assertEquals(4, sizeResult)
                );
    }

}