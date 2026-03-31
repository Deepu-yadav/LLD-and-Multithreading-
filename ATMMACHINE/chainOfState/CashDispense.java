package ATMMACHINE.chainOfState;

import ATMMACHINE.entity.Card;
import ATMMACHINE.Enum.ATMStatus;
import ATMMACHINE.service.AtmMachine;

public class CashDispense implements AtmState {

    private final AtmMachine machine;

    public CashDispense(AtmMachine machine) {
        this.machine = machine;
    }


    @Override
    public void insertCard(Card card) {
    System.out.println("Card is already inserted");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("pin is already entered");
    }

    @Override
    public void selectOption(String option) {
        System.out.println("Option is already selected");
    }

    @Override
    public void cashDispense(double amount) {

    }

    @Override
    public void ejectCard() {
        System.out.println("Card is ejected");
        machine.setState(new IDLE(machine));
        machine.setCurrCard(null);
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.CASH_DISPENSE;
    }
}
