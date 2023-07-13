package lessonEightAreaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    private Square square = new Square(8);

    @Test
    public void shouldCalculateArea() {
        Assertions.assertEquals(64, square.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Assertions.assertEquals(32, square.calculatePerimeter());
    }
}