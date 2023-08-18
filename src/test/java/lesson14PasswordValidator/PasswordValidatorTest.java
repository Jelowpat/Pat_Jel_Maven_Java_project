package lesson14PasswordValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {"qw1W:false", "qwertyui:false", "qwW21qweer:false", "qwW2021qweer:false", "wW445qw:true"},
            delimiter = ':')
    void shouldValidate(String password, boolean expected) {
        //given
        PasswordValidator passwordValidator = new PasswordValidator();
        //when
        boolean result = passwordValidator.validate(password);
        //then
        Assertions.assertEquals(expected, result);
    }
}