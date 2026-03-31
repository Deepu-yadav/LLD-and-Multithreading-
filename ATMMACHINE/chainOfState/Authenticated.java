package ATMMACHINE.chainOfState;

import ATMMACHINE.entity.Card;
import ATMMACHINE.Enum.ATMStatus;
import ATMMACHINE.service.AtmMachine;

public class Authenticated implements AtmState{
    private final AtmMachine machine;

    public Authenticated(AtmMachine machine){
        this.machine=machine;
    }

    @Override
    public void insertCard(Card card) {
        System.out.println("Card already inserted");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("Pin is  already Verified");
    }

    @Override
    public void selectOption(String option) {
     System.out.println("Show the Withdraw Option");
     machine.setState(new CashDispense(machine));
    }

    @Override
    public void cashDispense(double amount) {
      System.out.println("Please Select the Option");
    }

    @Override
    public void ejectCard() {
      System.out.println("Card is ejected");
      machine.setState(new IDLE(machine));
      machine.setCurrCard(null);
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.AUTHENTICATED;
    }
}
