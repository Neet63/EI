package Structural.Decorator;

//Base Class
public class BaseCar implements Car {

    public String getDescription() {
        return "Base Car Model";
    }

    public double getCost() {
        return 5000;
    }
}
