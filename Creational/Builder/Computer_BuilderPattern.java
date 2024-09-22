package Creational.Builder;

public class Computer_BuilderPattern {
    public static void main(String[] args) {
        ComputerBuilder Server1 = new ServerComputer();
        Engineer HardwareEngineer = new Engineer(Server1);

        HardwareEngineer.Conf_Computer();

        Computer Product = HardwareEngineer.getComputer();

        System.out.println("Computer Constructed is : \n" + Product);

        // System.out.println("HDD : " + Product.getHDD());
        // System.out.println("ID : " + Product.getComputerID());

        ComputerBuilder GamingPC = new GamingComputer();
        Engineer GamingEngineer = new Engineer(GamingPC);
        GamingEngineer.Conf_Computer();
        Computer GamingPCDemo = GamingEngineer.getComputer();
        
        System.out.println("Computer Constructed is : \n" + GamingPCDemo);

        
    }
}
