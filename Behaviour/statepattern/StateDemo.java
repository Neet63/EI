package Behaviour.statepattern;

public class StateDemo {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        
        card.swipe(500); // Adding $50
        card.pay(30);   // Paying $30
        card.pay(40);   // Paying 40
        card.pay(4000);   // Trying to pay more than available, should decline
        card.setState(new InactiveState(card)); // Setting card to inactive
        card.swipe(20); // Attempt to swipe on inactive card, should decline
    }
}

