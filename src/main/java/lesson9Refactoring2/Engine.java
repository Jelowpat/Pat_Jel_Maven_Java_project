package lesson9Refactoring2;

public class Engine {

    private boolean engineStarted = false;
    private final double size;
    private final EngineType type;

    public Engine(double size, EngineType type){
        this.size = size;
        this.type = type;
    }

    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public double getSize() {
        return size;
    }

    public EngineType getType() {
        return type;
    }

}
