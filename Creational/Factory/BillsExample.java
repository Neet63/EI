package Creational.Factory;

public class BillsExample {
    public static void main(String[] args) {

        MobileBill MB1 = new MobileBill(100, 1.3f);
        GasBill GB1 = new GasBill(50, 10.2f);
        ElectricityBill EB1 = new ElectricityBill(200, 5.2f);
        
        MB1.printBill();
        GB1.printBill();
        EB1.printBill();

        // Creating more bills to check ID incrementation
        MobileBill MB2 = new MobileBill(150, 1.5f);
        GasBill GB2 = new GasBill(60, 9.5f);
        
        MB2.printBill();
        GB2.printBill();
        
    }
    
}

