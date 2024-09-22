package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> ls = new ArrayList<Component>();
    int Tprice=0;

    public Composite(String n){
        super(n);
    }

    public int getPrice() {
        int totalPrice = 0;
        for (Component c : ls) {
            totalPrice += c.getPrice();
        }
        return totalPrice; // Return the calculated total price
    }

    public void addComponent(Component c){
        ls.add(c);
    }

    public void removeComponent(Component c){
        ls.remove(c);
    }

    public List<Component> getComponents(){
        return ls;
    }

    

    public void showName() {
        System.out.println("Composite : \t" + name + " \tPrice : $" + getPrice());
        for (Component c : ls) {
            c.showName();
        }
        System.out.println("--------------------------------------------");
    }

    
}
