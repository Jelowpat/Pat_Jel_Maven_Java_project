package lessonSevenPythagoreanTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PythagoreanTripleTest {

    @Test
    void shouldBePythagorean1() {
        Assertions.assertTrue(PythagoreanTriangle.isPythagorean(3,4,5));
    }

    @Test
    public void shouldNotBePythagorean(){
        Assertions.assertFalse(PythagoreanTriangle.isPythagorean(3,4,7));
    }
}