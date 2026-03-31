package ATMMACHINE.factory;

import ATMMACHINE.Enum.ATMStatus;
import ATMMACHINE.service.AtmMachine;
import ATMMACHINE.chainOfState.*;

public class ATMFactory {

    public static AtmState getObject(ATMStatus status, AtmMachine machine){

       return switch (status){
            case IDLE -> new IDLE(machine);
            case AUTHENTICATED -> new Authenticated(machine);
            case CARD_INSERTED -> new CardInserted(machine);
            case CASH_DISPENSE -> new CashDispense(machine);
           default -> throw new IllegalArgumentException("Unknown ATM status: " + status);
        };

    }
}
