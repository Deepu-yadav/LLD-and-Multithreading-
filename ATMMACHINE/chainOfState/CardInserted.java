package ATMMACHINE.chainOfState;

import ATMMACHINE.entity.Card;
import ATMMACHINE.Enum.ATMStatus;
import ATMMACHINE.service.AtmMachine;

public class CardInserted implements AtmState{

    private final AtmMachine machine;

    public CardInserted(AtmMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard(Card card) {
        System.out.println("Card already inserted");
    }

    @Override
    public void enterPin(String pin) {
     if(!machine.getCurrCard().getPin().equals(pin)){
        System.out.println("Pin is Incorrect, Please try again, You have left 2 attempts");
     }
     else{
         System.out.println("Pin is Authenticated");
         machine.setState(new Authenticated(machine));
     }

    }

    @Override
    public void selectOption(String option) {
        System.out.println("Please enter the pin");
    }

    @Override
    public void cashDispense(double amount) {
        System.out.println("Please enter the pin");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is ejected");
        machine.setState(new IDLE(machine));
        machine.setCurrCard(null);
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.CARD_INSERTED;
    }
}
