package lessonSixDaysOfWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfWeekTest {

    @Test
    public void shouldBeMonday() {
        Assertions.assertEquals("Monday", DaysOfWeek.getInfoAboutTheDay(1));
    }
    @Test
    public void shouldBeTuesday() {
        Assertions.assertEquals("Tuesday", DaysOfWeek.getInfoAboutTheDay(2));
    }
    @Test
    public void shouldBeWednesday() {
        Assertions.assertEquals("Wednesday", DaysOfWeek.getInfoAboutTheDay(3));
    }
    @Test
    public void shouldBeThursday() {
        Assertions.assertEquals("Thursday", DaysOfWeek.getInfoAboutTheDay(4));
    }
    @Test
    public void shouldBeFriday() {
        Assertions.assertEquals("Friday", DaysOfWeek.getInfoAboutTheDay(5));
    }
    @Test
    public void shouldBeWeekend() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(6));
    }
    @Test
    public void shouldBeWeekendButSunday() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(7));
    }
    @Test
    public void shouldBeNoSuchDay() {
        Assertions.assertEquals("There is no such day!", DaysOfWeek.getInfoAboutTheDay(112));
    }
}