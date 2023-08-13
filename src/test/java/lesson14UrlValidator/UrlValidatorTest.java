package lesson14UrlValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class UrlValidatorTest {

    @ParameterizedTest(name = "validating url - {0}, should be {1}")
    @MethodSource("provideUrlForValidation")
    public void shouldValidate(String url, boolean expected) {
        //given
        UrlValidator urlValidator = new UrlValidator();

        //when
        boolean result = urlValidator.validate(url);

        //then
        Assertions.assertEquals(expected, result);


    }

    private static Stream<Arguments> provideUrlForValidation(){
        return Stream.of(
                Arguments.of("http://www.onet.pl","true"),
                Arguments.of("https://mail.google.com","true"),
                Arguments.of("http://onet.pl","true"),
                Arguments.of("http://wiadmosci.onet.pl","true"),
                Arguments.of("itsnoturl", "false")
        );
    }

}