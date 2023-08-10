package lesson11Season;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Month;

class SeasonCheckerTest {

    @ParameterizedTest(name = "given {0}, checks if it's returning correct season")
    @CsvSource(value = {"JANUARY:winter","FEBRUARY:winter","MARCH:winter","APRIL:spring","MAY:spring","JUNE:spring",
            "JULY:summer","AUGUST:summer","SEPTEMBER:summer","OCTOBER:fall","NOVEMBER:fall","DECEMBER:fall"}, delimiter = ':')
    void shouldGetSeason(Month month, Season season) {
        //given
        SeasonChecker seasonChecker = new SeasonChecker();

        //when
        Season result = seasonChecker.getSeason(month);

        //then
        Assertions.assertEquals(season, result);
    }
}