package lessonEightAreaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    Circle circle = new Circle(7);

    @Test
    void shouldCalculateArea() {
        Assertions.assertEquals(153.93804002589985,circle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Assertions.assertEquals(43.982297150257104,circle.calculatePerimeter());
    }
}