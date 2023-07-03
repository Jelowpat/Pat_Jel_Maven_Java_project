package lessonSixDaysOfWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfWeekTest {

    @Test
    public void isMonday() {
        Assertions.assertEquals("Monday", DaysOfWeek.getInfoAboutTheDay(1));
    }
    @Test
    public void isTuesday() {
        Assertions.assertEquals("Tuesday", DaysOfWeek.getInfoAboutTheDay(2));
    }
    @Test
    public void isWednesday() {
        Assertions.assertEquals("Wednesday", DaysOfWeek.getInfoAboutTheDay(3));
    }
    @Test
    public void isThursday() {
        Assertions.assertEquals("Thursday", DaysOfWeek.getInfoAboutTheDay(4));
    }
    @Test
    public void isFriday() {
        Assertions.assertEquals("Friday", DaysOfWeek.getInfoAboutTheDay(5));
    }
    @Test
    public void isWeekend() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(6));
    }
    @Test
    public void isWeekendButSunday() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(7));
    }
    @Test
    public void thereIsNoSuchDay() {
        Assertions.assertEquals("There is no such day!", DaysOfWeek.getInfoAboutTheDay(112));
    }
}