package Structural.Composite;

public abstract class Component{
    protected String name;
    protected int price;

    public Component(String n,int p){
        name = n;
        price = p;
    }

    public Component(String n){
        name = n;
        price = 0;
        
    }

    public abstract void showName();
    public abstract int getPrice();
}
