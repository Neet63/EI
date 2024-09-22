package Creational.Factory;

public abstract class Bill{
    private int billId;
    private int billUnit;
    private float billUnitRate;

    public Bill(int unit, float rate) {
        this.billUnit = unit;
        this.billUnitRate = rate;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public void setBillUnit(int billUnit) {
        this.billUnit = billUnit;
    }

    public void setBillUnitRate(float billUnitRate) {
        this.billUnitRate = billUnitRate;
    }

    public int getBillId() {
        return billId;
    }

    public int getBillUnit() {
        return billUnit;
    }

    public float getBillUnitRate() {
        return billUnitRate;
    }
    
    abstract float calculateBill();
}

