package Creational.Factory;

public class GasBill extends Bill{
    private static int nextId = 4000; // Starting ID for Gas Bills

    public GasBill(int unit, float rate) {
        super(unit, rate);
        setBillId(nextId++); // Assign current ID and increment
    }

    float calculateBill() {
        return getBillUnit() * getBillUnitRate();
    }

    void printBill() {
        System.out.println("Gas Bill");
        System.out.println("Bill id : " + getBillId());
        System.out.println("Bill Unit : " + getBillUnit());
        System.out.println("Rate per Unit : " + getBillUnitRate());
        System.out.println("Amount to Pay : " + calculateBill());
        System.out.println("----------------------------------------------------------------------");
    }
}