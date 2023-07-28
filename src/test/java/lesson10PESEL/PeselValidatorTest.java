package lesson10PESEL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    void validate() throws WrongTypeOfDataException, IllegalLengthException {
        PeselValidator peselValidator = new PeselValidator();
        Assertions.assertThrows(WrongTypeOfDataException.class, () -> peselValidator.validate("dasdasddddd"));

    }
}