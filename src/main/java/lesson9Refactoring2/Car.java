package lesson9Refactoring2;

public class Car extends Vehicle {

    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    @Override
    public void drive() {
        if (!super.moving) {
            engine.startEngine();
            super.moving = true;
            System.out.println("The car is driving");
        }
        else {
            System.out.println("The car is already driving");
        }
    }

    @Override
    public void stop() {
        if (super.moving) {
            super.moving = false;
            engine.stopEngine();
            System.out.println("The car stopped");
        }
        else {
            System.out.println("The car is not moving");
        }
    }
}