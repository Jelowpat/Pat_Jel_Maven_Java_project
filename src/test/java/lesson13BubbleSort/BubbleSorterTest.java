package lesson13BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class BubbleSorterTest {

    @ParameterizedTest
    @MethodSource("provideListsForSort")
    void shouldSort(List<Integer> list, List<Integer> sortedList) {
        //when
        BubbleSorter.sort(list);
        //then
        Assertions.assertEquals(sortedList, list);
    }

    private static Stream<Arguments> provideListsForSort(){
        return Stream.of(
                Arguments.of(Arrays.asList(9,23,14124,1313,21212), Arrays.asList(9,23,1313,14124,21212)),
                Arguments.of(Arrays.asList(3131,2,3,1,31231,322), Arrays.asList(1,2,3,322,3131,31231)),
                Arguments.of(Arrays.asList(634,16,345,25,64332,25), Arrays.asList(16,25,25,345,634,64332))
        );
    }

}