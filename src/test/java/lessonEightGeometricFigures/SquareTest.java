package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    Square square = new Square(5);

    @Test
    void shouldCalculateArea() {
        Assertions.assertEquals(25, square.getArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Assertions.assertEquals(20, square.getPerimeter());
    }

}