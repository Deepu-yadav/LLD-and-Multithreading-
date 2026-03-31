package ATMMACHINE.entity;

import ATMMACHINE.Enum.ATMStatus;

import java.util.HashMap;

public class ATM {

   private String id;
  HashMap<Integer,Integer>cash;   // (rupees,count)
  private ATMStatus status;
  private double totalAmount;

  public ATM(String id,HashMap<Integer,Integer>cash, double totalAmount){
   this.cash=cash;
   this.id=id;
   this.status=ATMStatus.IDLE;
   this.totalAmount=totalAmount;
  }

 public String getId() {
  return id;
 }

 public ATMStatus getStatus() {
  return status;
 }

 public void setStatus(ATMStatus status) {
  this.status = status;
 }

 public HashMap<Integer, Integer> getCash() {
  return cash;
 }

 public void setCash(HashMap<Integer, Integer> cash) {
  this.cash = cash;
 }
    public double getTotalAmount() {
        return totalAmount;
    }
}
