package lesson11Training;

public class TrainingAnalyzer {

    private static final double DURATION_SCORE_WEIGHT = 1;
    private static final double CALORIES_BURNT_SCORE_WEIGHT = 2;
    private static final double AVERAGE_BPM_SCORE_WEIGHT = 3;
    private static final double SUM_OF_WEIGHTED_SCORES = 6;

    private final Training training;

    public TrainingAnalyzer(Training training) {
        this.training = training;
    }

    public double getWeightedAverageScore(){
        return (getDurationScore() * DURATION_SCORE_WEIGHT + getCaloriesBurntScore() * CALORIES_BURNT_SCORE_WEIGHT +
                getAverageBpmScore() * AVERAGE_BPM_SCORE_WEIGHT) / SUM_OF_WEIGHTED_SCORES;
    }

    private int getDurationScore(){
        if (training.length() < 30) {
            return 1;
        } else if (training.length() <= 60){
            return 2;
        }
        return 3;
    }

    private int getCaloriesBurntScore(){
        if (training.caloriesBurnt() <= 300) {
            return 1;
        } else if (training.caloriesBurnt() < 400){
            return 2;
        }
        return 3;
    }

    private int getAverageBpmScore(){
        if (training.averageBpm() < 160) {
            return 3;
        } else if (training.averageBpm() <= 175){
            return 2;
        }
        return 1;
    }

}
