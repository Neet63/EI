package Structural.Composite;

public class leaf extends Component{
    public leaf(String n,int p){
        super(n,p);
    }

    public void showName(){
        System.out.println("Leaf : \t\t" +name + " \t\tPrice : $"+price);
    }

    public int getPrice(){
        return price;
    }
}