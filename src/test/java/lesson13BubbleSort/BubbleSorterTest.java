package lesson13BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

class BubbleSorterTest {

    @Test
    void shouldSort() {
        //given
        List<Integer> list = Arrays.asList(7,1,0,13,122,15);
        //when
        BubbleSorter.sort(list);
        ListIterator<Integer> iterator = list.listIterator();
        boolean result = true;
        while(true){
            int v1 = iterator.next();
            if(!iterator.hasNext()){
                break;
            }
            int v2 = iterator.next();
            if(v1 > v2) {
                result = false;
            }
            iterator.previous();
        }
        //then
        Assertions.assertTrue(result);
    }
}