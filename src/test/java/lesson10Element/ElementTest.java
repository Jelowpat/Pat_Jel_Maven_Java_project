package lesson10Element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;

class ElementTest {

    @Test
    void shouldCalculateElement() {
        //given
        Element element = new Element();

        //when
        double result = element.getElement(4);

        //then
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenProvidedNegativeNumber() {
        //given
        Element element = new Element();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> element.getElement(-4));
    }
}