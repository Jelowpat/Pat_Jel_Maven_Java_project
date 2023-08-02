package lesson11Season;

import java.time.Month;

import static lesson11Season.Season.*;

public class SeasonChecker {

    public Season getSeason(Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> WINTER;
            case APRIL, MAY, JUNE -> SPRING;
            case JULY, AUGUST, SEPTEMBER -> SUMMER;
            case OCTOBER, NOVEMBER, DECEMBER -> FALL;
        };
    }
}
