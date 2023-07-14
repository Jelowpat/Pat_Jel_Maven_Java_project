package lesson8WeekDaysNames;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {
    @Test
    public void shouldBeMonday() {
        Assertions.assertEquals("Monday", DayOfTheWeek.getDayName(WeekDay.Monday));
    }
    @Test
    public void shouldBeTuesday() {
        Assertions.assertEquals("Tuesday", DayOfTheWeek.getDayName(WeekDay.Tuesday));
    }
    @Test
    public void shouldBeWednesday() {
        Assertions.assertEquals("Wednesday", DayOfTheWeek.getDayName(WeekDay.Wednesday));
    }
    @Test
    public void shouldBeThursday() {
        Assertions.assertEquals("Thursday", DayOfTheWeek.getDayName(WeekDay.Thursday));
    }
    @Test
    public void shouldBeFriday() {
        Assertions.assertEquals("Friday", DayOfTheWeek.getDayName(WeekDay.Friday));
    }
    @Test
    public void shouldBeSaturday() {
        Assertions.assertEquals("Saturday", DayOfTheWeek.getDayName(WeekDay.Saturday));
    }
    @Test
    public void shouldBeSunday() {
        Assertions.assertEquals("Sunday", DayOfTheWeek.getDayName(WeekDay.Sunday));
    }
}