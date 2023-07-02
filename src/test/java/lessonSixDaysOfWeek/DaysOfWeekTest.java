package lessonSixDaysOfWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DaysOfWeekTest {

    @Test
    public void getInfoAboutMondayTest() {
        Assertions.assertEquals("Monday", DaysOfWeek.getInfoAboutTheDay(1));
    }
    @Test
    public void getInfoAboutTuesdayTest() {
        Assertions.assertEquals("Tuesday", DaysOfWeek.getInfoAboutTheDay(2));
    }
    @Test
    public void getInfoAboutWednesdayTest() {
        Assertions.assertEquals("Wednesday", DaysOfWeek.getInfoAboutTheDay(3));
    }
    @Test
    public void getInfoAboutThursdayTest() {
        Assertions.assertEquals("Thursday", DaysOfWeek.getInfoAboutTheDay(4));
    }
    @Test
    public void getInfoAboutFridayTest() {
        Assertions.assertEquals("Friday", DaysOfWeek.getInfoAboutTheDay(5));
    }
    @Test
    public void getInfoAboutSaturdayTest() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(6));
    }
    @Test
    public void getInfoAboutSundayTest() {
        Assertions.assertEquals("Weekend", DaysOfWeek.getInfoAboutTheDay(7));
    }
    @Test
    public void getInfoAboutTheDayNotExistingTest() {
        Assertions.assertEquals("There is no such day!", DaysOfWeek.getInfoAboutTheDay(112));
    }
}