package lessonSixAgeVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgeVerificationTest {

    @Test
    public void isPositivelyVerified() {
        Assertions.assertTrue(AgeVerification.verifyingAge(18));
    }
    @Test
    public void isNegativelyVerified() {
        Assertions.assertFalse(AgeVerification.verifyingAge(17));
    }
}