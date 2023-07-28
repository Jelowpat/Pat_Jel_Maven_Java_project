package lesson10PESEL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeselValidatorTest {
    @Test
    void shouldThrowWrongTypeOfDataException() throws WrongTypeOfDataException, IllegalLengthException {
        PeselValidator peselValidator = new PeselValidator();
        Assertions.assertThrows(WrongTypeOfDataException.class, () -> peselValidator.validate("dasdasddddd"));
    }

    @Test
    void shouldThrowIllegalLengthException() throws WrongTypeOfDataException, IllegalLengthException {
        PeselValidator peselValidator = new PeselValidator();
        Assertions.assertThrows(IllegalLengthException.class, () -> peselValidator.validate("1122"));
    }
}