package Behaviour.statepattern;

public interface CreditCardState {
    void swipe(double amount);
    void pay(double amount);
}
