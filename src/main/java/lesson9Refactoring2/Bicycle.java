package lesson9Refactoring2;

public class Bicycle extends Vehicle {

    @Override
    public void drive() {
        if (!super.moving) {
            super.moving = true;
            System.out.println("The bicycle is driving");
        }
        else {
            System.out.println("The bicycle is already driving");
        }
    }
    @Override
    public void stop() {
        if (super.moving) {
            super.moving = false;
            System.out.println("The bicycle stopped");
        }
        else {
            System.out.println("The bicycle is not moving");
        }
    }
}