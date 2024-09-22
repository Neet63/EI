package Structural.Decorator;

//Decorator
public abstract class CarModifier implements Car {
    protected Car car;

    public CarModifier(Car c) {
        this.car = c;
    }

    public String getDescription() {
        return car.getDescription();
    }

    public double getCost() {
        return car.getCost();
    }
}
