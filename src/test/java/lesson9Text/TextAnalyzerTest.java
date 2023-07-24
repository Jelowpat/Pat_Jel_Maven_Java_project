package lesson9Text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextAnalyzerTest {

    @Test
    public void shouldBePalindrome() {
        Assertions.assertTrue(TextAnalyzer.isPalindrome("Niagara. O roar again!"));
    }
    @Test
    public void shouldNotBePalindrome() {
        Assertions.assertFalse(TextAnalyzer.isPalindrome("not a palindrome"));
    }
    @Test
    public void shouldReverseText() {
        Assertions.assertEquals("emordnilap", TextAnalyzer.reverseText("palindrome"));
    }
}