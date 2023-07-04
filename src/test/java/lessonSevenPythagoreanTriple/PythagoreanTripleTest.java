package lessonSevenPythagoreanTriple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PythagoreanTripleTest {

    @Test
    void shouldBePythagorean1() {
        Assertions.assertTrue(PythagoreanTriple.checkIfIsPythagorean(3,4,5));
    }
    @Test
    void shouldBePythagorean2() {
        Assertions.assertTrue(PythagoreanTriple.checkIfIsPythagorean(3,5,4));
    }
    @Test
    void shouldBePythagorean3() {
        Assertions.assertTrue(PythagoreanTriple.checkIfIsPythagorean(5,4,3));
    }

    @Test
    public void shouldNotBePythagorean(){
        Assertions.assertFalse(PythagoreanTriple.checkIfIsPythagorean(3,4,7));
    }
}