package ATMMACHINE.service;

import ATMMACHINE.entity.Card;
import ATMMACHINE.entity.ATM;
import ATMMACHINE.factory.ATMFactory;
import ATMMACHINE.respository.AtmRepository;
import ATMMACHINE.chainOfState.AtmState;

public class AtmMachine {

  private final ATM atm;
  AtmRepository repository;
  AtmState state;
  Card currCard;
  public AtmMachine(String id,AtmRepository repository){
      this.repository=repository;
      this.atm=repository.getById(id);
      this.state= ATMFactory.getObject(atm.getStatus(),this);
  }

  public void insertCard(Card card){
      state.insertCard(card);
  }
  public void enterPin(String pin){
      state.enterPin(pin);
  }
  public void selectOption(String option){
      state.selectOption(option);
  }
  public void dispenseCash(double amount){
      state.cashDispense(amount);
  }
  public void setState(AtmState state){
      this.state=state;
      atm.setStatus(state.getStatus());
  }

    public ATM getAtm() {
        return atm;
    }

    public AtmState getState() {
        return state;
    }

    public AtmRepository getRepository() {
        return repository;
    }

    public Card getCurrCard() {
        return currCard;
    }

    public void setCurrCard(Card currCard) {
        this.currCard = currCard;
    }
}
