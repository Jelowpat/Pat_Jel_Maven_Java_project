package lesson11Training;

public class TrainingAnalyzer {

    private static final int DURATION_SCORE_WEIGHT = 1;
    private static final int CALORIES_BURNT_SCORE_WEIGHT = 2;
    private static final int AVERAGE_BPM_SCORE_WEIGHT = 3;

    private final Training training;

    public TrainingAnalyzer(Training training) {
        this.training = training;
    }

    public double getWeightedAverageScore(){
        return (double)(getDurationScore() * DURATION_SCORE_WEIGHT + getCaloriesBurntScore() * CALORIES_BURNT_SCORE_WEIGHT +
                getAverageBpmScore() * AVERAGE_BPM_SCORE_WEIGHT) / 6;
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
