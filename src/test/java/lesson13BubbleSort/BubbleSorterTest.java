package lesson13BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

class BubbleSorterTest {

    @ParameterizedTest
    @MethodSource("provideListsForSort")
    void shouldSort(List<Integer> list) {
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

    private static Stream<Arguments> provideListsForSort(){
        return Stream.of(
                Arguments.of(Arrays.asList(9,23,14124,1313,21212)),
                Arguments.of(Arrays.asList(3131,2,3,1,31231,322)),
                Arguments.of(Arrays.asList(634,16,345,25,64332,25))
        );
    }

}