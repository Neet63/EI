package Structural.Decorator;

public class CarShowroom {
    public static void main(String[] args) {
        Car c1 = new BaseCar();
        System.out.println("Car Description : "+ c1.getDescription());
        System.out.println("Car Cost : " + c1.getCost());

        Car c2 = new AddNOS(new BaseCar());
        System.out.println("Car Description : "+ c2.getDescription());
        System.out.println("Car Cost : " + c2.getCost());

        Car c3 = new AddExhaust(new BaseCar());
        System.out.println("Car Description : "+ c3.getDescription());
        System.out.println("Car Cost : " + c3.getCost());

        Car c4 = new AddNOS(new AddExhaust(new BaseCar()));
        System.out.println("Car Description : "+ c4.getDescription());
        System.out.println("Car Cost : " + c4.getCost());
    }
}
