package lesson14Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class NumberFilterTest {

    @ParameterizedTest
    @CsvSource(value = {"342:true","5.34:false","756:true","1.234e+07:false","7.234243E-02:false","6.09:false",
            "3457:true","87:true","1.0001:false","3:true","5:true"}, delimiter = ':')
    void shouldFilterIntegers(String number, boolean expected) {
        //given
        NumberFilter numberFilter = new NumberFilter();

        //when
        boolean result = numberFilter.filterIntegers(number);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"342:false","5.34:true","756:false","1.234e+07:false","7.234243E-02:false","6.09:true",
            "3457:false","87:false","1.0001:true","3:false","5:false"}, delimiter = ':')
    void shouldFilterDecimalNumbers(String number, boolean expected) {
        //given
        NumberFilter numberFilter = new NumberFilter();

        //when
        boolean result = numberFilter.filterDecimalNumbers(number);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"342:false","5.34:false","756:false","1.234e+07:true","7.234243E-02:true","6.09:false",
            "3457:false","87:false","1.0001:false","3:false","5:false"}, delimiter = ':')
    void shouldFilterNumberNotations(String number, boolean expected) {
        //given
        NumberFilter numberFilter = new NumberFilter();

        //when
        boolean result = numberFilter.filterNumberNotations(number);

        //then
        Assertions.assertEquals(expected, result);
    }
}