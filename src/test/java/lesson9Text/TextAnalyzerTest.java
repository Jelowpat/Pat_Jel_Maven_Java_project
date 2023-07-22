package lesson9Text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextAnalyzerTest {

    @Test
    public void shouldBePalindrome() {
        Assertions.assertEquals("length: 22\nis palindrome: true", TextAnalyzer.analyzeText("Niagara. O roar again!"));
    }
    @Test
    public void shouldNotBePalindrome() {
        Assertions.assertEquals("length: 16\nis palindrome: false", TextAnalyzer.analyzeText("not a palindrome"));
    }
    @Test
    public void shouldNotAnalyze() {
        Assertions.assertEquals("this is an empty string", TextAnalyzer.analyzeText(""));
    }
}