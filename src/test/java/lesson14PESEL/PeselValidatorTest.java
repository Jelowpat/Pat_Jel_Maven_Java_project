package lesson14PESEL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class PeselValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"12345678901:true","1234567890111:false", "qwertyuiopa:false"}, delimiter = ':')
    void shouldValidate(String pesel, boolean expected) {
        //given
        PeselValidator peselValidator = new PeselValidator();

        //when
        boolean result = peselValidator.validate(pesel);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"12345678901:true","1234567890111:false", "qwertyuiopa:false"}, delimiter = ':')
    void shouldValidateWithRange(String pesel, boolean expected) {
        //given
        PeselValidator peselValidator = new PeselValidator();

        //when
        boolean result = peselValidator.validate(pesel);

        //then
        Assertions.assertEquals(expected, result);
    }
}