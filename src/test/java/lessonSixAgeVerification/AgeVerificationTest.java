package lessonSixAgeVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgeVerificationTest {

    @Test
    public void isPositivlyVerified() {
        Assertions.assertTrue(AgeVerification.verifyingAge(18));
    }
    @Test
    public void isNegativlyVerified() {
        Assertions.assertFalse(AgeVerification.verifyingAge(17));
    }
}