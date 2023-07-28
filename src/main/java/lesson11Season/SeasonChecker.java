package lesson11Season;

import java.time.Month;

public class SeasonChecker {

    public Season getSeason(Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> Season.winter;
            case APRIL, MAY, JUNE -> Season.spring;
            case JULY, AUGUST, SEPTEMBER -> Season.summer;
            case OCTOBER, NOVEMBER, DECEMBER -> Season.fall;
        };
    }
}
