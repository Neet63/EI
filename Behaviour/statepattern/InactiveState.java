package Behaviour.statepattern;

public class InactiveState implements CreditCardState {
    private CreditCard card;
    
    public InactiveState(CreditCard card) {
        this.card = card;
    }
    
    @Override
    public void swipe(double amount) {
        System.out.println("Card is inactive: swipe declined");
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment declined: card is inactive");
    }
}
