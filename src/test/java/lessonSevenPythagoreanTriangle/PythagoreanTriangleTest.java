package lessonSevenPythagoreanTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PythagoreanTriangleTest {

    @Test
    void shouldBePythagorean() {
        Assertions.assertTrue(PythagoreanTriangle.isPythagorean(3,4,5));
    }

    @Test
    public void shouldNotBePythagorean(){
        Assertions.assertFalse(PythagoreanTriangle.isPythagorean(3,4,7));
    }
}