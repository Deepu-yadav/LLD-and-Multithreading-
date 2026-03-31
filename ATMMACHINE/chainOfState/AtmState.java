package ATMMACHINE.chainOfState;

import ATMMACHINE.entity.Card;
import ATMMACHINE.Enum.ATMStatus;

public interface AtmState {

    void insertCard(Card card);
    void enterPin(String pin);
    void selectOption(String option);
    void cashDispense(double amount);
    void ejectCard();
    ATMStatus getStatus();
}