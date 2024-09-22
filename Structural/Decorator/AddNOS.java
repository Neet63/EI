package Structural.Decorator;

//Concrete Decorator
public class AddNOS extends CarModifier {
    public AddNOS(Car c) {
        super(c);
    }

    public String getDescription() {
        return car.getDescription() + ", NoS";
    }

    public double getCost() {
        return car.getCost() + 1000;
    }
}
