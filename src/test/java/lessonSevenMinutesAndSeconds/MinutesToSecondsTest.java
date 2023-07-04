package lessonSevenMinutesAndSeconds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesToSecondsTest {

    @Test
    public void shouldConvertMinutesToSeconds() {
        Assertions.assertEquals(180, MinutesToSeconds.convertMinutesToSeconds(3));
    }
}