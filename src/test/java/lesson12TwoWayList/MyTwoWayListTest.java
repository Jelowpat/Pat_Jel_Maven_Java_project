package lesson12TwoWayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyTwoWayListTest {

    @Test
    public void shouldAddElements(){
        //given
        MyTwoWayList list = new MyTwoWayList();
        //when
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        String result = list.toString();
        //then
        Assertions.assertEquals("1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ", result);
    }

    @Test
    public void shouldThrowIndexOutOfBoundsExceptionWhenIndexOutOfRange(){
        //given
        MyTwoWayList list = new MyTwoWayList();
        list.add("1");

        //then
        Assertions.assertAll("Should throw exception",
                () -> Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.add(2, "")),
                () -> Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2))
                );
    }

    @Test
    public void shouldAddElementsAtIndex(){
        //given
        MyTwoWayList list = new MyTwoWayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //when
        list.add(3,"13");
        list.add(3,"14");
        list.add(3,"15");
        String result = list.toString();
        //then
        Assertions.assertEquals("1, 2, 3, 15, 14, 13, 4, 5, 1, 2, 3, 15, 14, 13, 4, 5, ", result);
    }

    @Test
    public void shouldRemoveElementAtIndex(){
        //given
        MyTwoWayList list = new MyTwoWayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //when
        list.remove(3);
        String result = list.toString();
        //then
        Assertions.assertEquals("1, 2, 3, 5, 1, 2, 3, 5, ", result);
    }

    @Test
    public void shouldReturnSize(){
        //given
        MyTwoWayList list = new MyTwoWayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //when
        int result = list.size();
        //then
        Assertions.assertEquals(5, result);
    }

}