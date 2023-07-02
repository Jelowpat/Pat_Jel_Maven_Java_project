package lessonSixAgeVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgeVerificationTest {

    @Test
    public void verifyingAgeTest() {
        Assertions.assertTrue(AgeVerification.verifyingAge(18));
        Assertions.assertTrue(AgeVerification.verifyingAge(35));
        Assertions.assertFalse(AgeVerification.verifyingAge(17));
        Assertions.assertFalse(AgeVerification.verifyingAge(-11));
    }
}