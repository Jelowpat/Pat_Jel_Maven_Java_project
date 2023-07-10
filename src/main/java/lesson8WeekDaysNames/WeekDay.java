package lesson8WeekDaysNames;

public enum WeekDay {
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
    Sunday("Sunday");

    private final String DayString;

    WeekDay(String DayString) {
        this.DayString = DayString;
    }

    public String getDayString(){
        return DayString;
    }
}
