package Behaviour.statepattern;

public class ActiveState implements CreditCardState {
    private CreditCard card;
    
    public ActiveState(CreditCard card) {
        this.card = card;
    }
    
    @Override
    public void swipe(double amount) {
        System.out.println("Swiping card for $" + amount);
        card.setBalance(card.getBalance() + amount);
    }
    
    @Override
    public void pay(double amount) {
        if (card.getBalance() < amount) {
            System.out.println("Payment declined: not enough funds You have only " + card.getBalance() + " and you are trying to pay $"+amount);
        } else {
            System.out.println("Paying $" + amount);
            card.setBalance(card.getBalance() - amount);
            System.out.println(("Remaining Balance is : $" + card.getBalance()));
        }
        
        if (card.getBalance() == 0) {
            card.setState(new InactiveState(card));
        }
    }
}

