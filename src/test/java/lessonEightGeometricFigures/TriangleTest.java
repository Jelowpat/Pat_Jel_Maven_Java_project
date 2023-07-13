package lessonEightGeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    private Triangle triangle = new Triangle(7,4,10);

    @Test
    public void shouldCalculateArea() {
        Assertions.assertEquals(10.928746497197197, triangle.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Assertions.assertEquals(21, triangle.getPerimeter());
    }
}