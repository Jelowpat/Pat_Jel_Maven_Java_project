package lesson11CapitalLetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CapitalLettersTest {

    @ParameterizedTest
    @ValueSource(strings = {"first text", "SeCoNd TeXt"})
    @EmptySource
    public void shouldCapitalize(String text) {
        //when
        String result = CapitalLetters.capitalize(text);

        //then
        Assertions.assertEquals(text.toUpperCase(), result);
    }
}