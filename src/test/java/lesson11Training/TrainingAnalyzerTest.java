package lesson11Training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TrainingAnalyzerTest {

    @ParameterizedTest
    @MethodSource("provideSampleTrainings")
    public void shouldGetWeightedAverageScore(Training training, double expected) {
        //given
        TrainingAnalyzer trainingAnalysis = new TrainingAnalyzer(training);

        //when
        double result = trainingAnalysis.getWeightedAverageScore();

        //then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideSampleTrainings() {

        Training training1 = new Training(50, 440, 155);
        Training training2 = new Training(20, 240, 190);
        Training training3 = new Training(75, 820, 180);

        return Stream.of(
                Arguments.of(training1, 2.8333333333333335),
                Arguments.of(training2, 1.0),
                Arguments.of(training3, 2.0)
        );

    }

}