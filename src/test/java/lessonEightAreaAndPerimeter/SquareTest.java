package lessonEightAreaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    Square square = new Square(8);

    @Test
    void shouldCalculateArea() {
        Assertions.assertEquals(64, square.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Assertions.assertEquals(32, square.calculatePerimeter());
    }
}