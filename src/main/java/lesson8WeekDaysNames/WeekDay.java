package lesson8WeekDaysNames;

public enum WeekDay {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private final int DayString;

    WeekDay(int DayString) {
        this.DayString = DayString;
    }

    public int getDayNumber(){
        return DayString;
    }
}
