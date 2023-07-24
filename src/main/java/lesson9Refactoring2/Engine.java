package lesson9Refactoring2;

public class Engine {

    private boolean isStarted = false;

    public void startEngine() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    public void stopEngine() {
        if (isStarted) {
            isStarted = false;
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

}
