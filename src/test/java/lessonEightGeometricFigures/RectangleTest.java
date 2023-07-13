package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTest {

    private Rectangle rectangle = new Rectangle(8, 12);

    @Test
    public void shouldCalculateArea() {
        Assertions.assertEquals(96, rectangle.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Assertions.assertEquals(40, rectangle.getPerimeter());
    }
}