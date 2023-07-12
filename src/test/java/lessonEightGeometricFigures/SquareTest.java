package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    private Square square = new Square(5);

    @Test
    public void shouldCalculateArea() {
        Assertions.assertEquals(25, square.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Assertions.assertEquals(20, square.getPerimeter());
    }

}