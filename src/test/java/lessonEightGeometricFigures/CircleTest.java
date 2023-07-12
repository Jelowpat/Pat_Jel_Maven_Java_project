package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    private Circle circle = new Circle(4);

    @Test
    public void shouldCalculateArea() {
        Assertions.assertEquals(39.47841760435743, circle.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Assertions.assertEquals(25.132741228718345, circle.getPerimeter());
    }
}