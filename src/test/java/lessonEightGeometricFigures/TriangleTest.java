package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    Triangle triangle = new Triangle(7,4,10);

    @Test
    void shouldCalculateArea() {
        Assertions.assertEquals(10.928746497197197, triangle.getArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Assertions.assertEquals(21, triangle.getPerimeter());
    }
}