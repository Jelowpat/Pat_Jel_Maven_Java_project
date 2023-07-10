package lesson8WeekDaysNames;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {

    @Test
    void shouldReturnNameOfTheDay() {
        Assertions.assertEquals("Monday", DayOfTheWeek.whatDayIsIt(WeekDay.Monday));
    }
}