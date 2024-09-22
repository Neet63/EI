package Structural.Decorator;

//Concrete Decorator
public class AddExhaust extends CarModifier {
    public AddExhaust(Car c) {
        super(c);
    }

    public String getDescription() {
        return car.getDescription() + ", Exhaust";
    }

    public double getCost() {
        return car.getCost() + 500;
    }
}
