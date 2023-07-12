package lesson8WeekDaysNames;

public enum WeekDay {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private final int DayNumber;

    WeekDay(int DayNumber) {
        this.DayNumber = DayNumber;
    }

    public int getDayNumber(){
        return DayNumber;
    }
}
