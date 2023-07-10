package lessonEightCapitalAndSmallLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextFormatterTest {

    TextToUpper text1 = new TextToUpper();
    TextToLower text2 = new TextToLower();

    @Test
    void shouldFormatTextToUpper() {
        Assertions.assertEquals( "QWERT", text1.formatText("qWeRt"));
    }
    @Test
    void shouldFormatTextToULower() {
        Assertions.assertEquals( "qwert", text2.formatText("qWeRt"));
    }

}