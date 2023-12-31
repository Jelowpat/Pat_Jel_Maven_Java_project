package lesson10Data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class WordFinderTest {

    @Test
    void shouldFindWord() throws IOException {
        //given
        WordFinder wordFinder = new WordFinder();

        //when
        boolean result = wordFinder.containsWord("Pliki");

        //then
        Assertions.assertTrue(result);
    }
    @Test
    void shouldNotFindWord() throws IOException {
        //given
        WordFinder wordFinder = new WordFinder();

        //when
        boolean result = wordFinder.containsWord("Pliczki");

        //then
        Assertions.assertFalse(result);
    }
}
