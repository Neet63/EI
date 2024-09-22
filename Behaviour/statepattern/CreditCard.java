package Behaviour.statepattern;

public class CreditCard {
    private double balance;
    private CreditCardState state;
    
    public CreditCard() {
        balance = 0;
        state = new ActiveState(this);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setState(CreditCardState state) {
        this.state = state;
    }
    
    public void swipe(double amount) {
        state.swipe(amount);
    }
    
    public void pay(double amount) {
        state.pay(amount);
    }
}

