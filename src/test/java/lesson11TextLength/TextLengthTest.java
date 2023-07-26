package lesson11TextLength;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextLengthTest {

    @ParameterizedTest(name = "Should return the length of given text")
    @MethodSource("provideStringsForGetTextLength")
    public void shouldCalculateTextLength() {
    }

    private static Stream<Arguments> provideStringsForGetTextLength(){
        return Stream.of(
                Arguments.of("this is a text", TextLength.getTextLength("this is a text")),
                Arguments.of("this is a second text", TextLength.getTextLength("this is a second text")),
                Arguments.of("text", TextLength.getTextLength("text"))
        );
    }

}