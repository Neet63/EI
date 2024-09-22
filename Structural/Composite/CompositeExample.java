package Structural.Composite;

public class CompositeExample {
    public static void main(String[] args) {
        Component l1 = new leaf("HDD",500);
        Component l2 = new leaf("RAM",100);
        Component l3 = new leaf("CPU",50);
        Component l4 = new leaf("KeyBoard",10);
        Component l5 = new leaf("Mouse",5);

        Composite c1 = new Composite("Computer");
        Composite c2 = new Composite("Cabinet");
        Composite c3 = new Composite("Peripheral");
        Composite c4 = new Composite("Mother-Board");

        c1.addComponent(l1);
        c1.addComponent(l2);
        c1.addComponent(l3);

        c1.showName();

        c2.addComponent(l3);
        c2.addComponent(l4);
        c2.showName();

        c3.addComponent(c1);
        c3.addComponent(l5);
        c3.showName();

                

    }
}
