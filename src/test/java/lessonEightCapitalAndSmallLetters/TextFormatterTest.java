package lessonEightCapitalAndSmallLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextFormatterTest {
    @Test
    public void shouldFormatTextToUpper() {
        TextToUpper text1 = new TextToUpper();
        Assertions.assertEquals("QWERT", text1.formatText("qWeRt"));
    }
    @Test
    public void shouldFormatTextToLower() {
        TextToLower text2 = new TextToLower();
        Assertions.assertEquals("qwert", text2.formatText("qWeRt"));
    }

}