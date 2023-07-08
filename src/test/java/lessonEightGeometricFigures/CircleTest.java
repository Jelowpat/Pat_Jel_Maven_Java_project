package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    Circle circle = new Circle(4);

    @Test
    void shouldCalculateArea() {
        Assertions.assertEquals(39.47841760435743, circle.getArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Assertions.assertEquals(25.132741228718345, circle.getPerimeter());
    }
}