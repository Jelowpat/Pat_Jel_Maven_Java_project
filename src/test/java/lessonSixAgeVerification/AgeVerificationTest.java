package lessonSixAgeVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AgeVerificationTest {

    @Test
    public void shouldBeVerified() {
        Assertions.assertTrue(AgeVerification.verifyAge(18));
    }
    @Test
    public void shouldNotBeVerified() {
        Assertions.assertFalse(AgeVerification.verifyAge(17));
    }
}