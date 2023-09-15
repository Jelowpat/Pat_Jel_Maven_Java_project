package losson11Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitSumTestClient {

    @ParameterizedTest(name = "Should verify if soum of digits of {0} equals {1}")
    @CsvSource(value = {"123:6", "31231:10", "8813180:29"}, delimiter = ':')
    public void shouldSumDigits(int input, int expected) {
        //given
        DigitSum digitSum = new DigitSum();

        //when
        int result = digitSum.getDigitSum(input);

        //then
        Assertions.assertEquals(expected, result);
    }
}