package ATMMACHINE.chainOfState;

import ATMMACHINE.entity.Card;
import ATMMACHINE.Enum.ATMStatus;
import ATMMACHINE.service.AtmMachine;

public class IDLE implements AtmState{

    private final AtmMachine machine;

    public IDLE(AtmMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard(Card card) {
        machine.setCurrCard(card);
     System.out.println("Card is inserted");
     machine.setState(new CardInserted(machine));
    }

    @Override
    public void enterPin(String pin) {
      System.out.println("Card is not inserted");
    }

    @Override
    public void selectOption(String option) {
        System.out.println("Card is not inserted");
    }

    @Override
    public void cashDispense(double amount) {
        System.out.println("Card is not inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is not inserted");
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.IDLE;
    }
}
