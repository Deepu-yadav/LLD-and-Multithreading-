package ATMMACHINE.respository;

import ATMMACHINE.entity.ATM;
import ATMMACHINE.Enum.ATMStatus;

import java.util.HashMap;

public class AtmRepository {

   public static final HashMap<String, ATM>repo=new HashMap<>();

   public void saveATM(String id,ATM atm){
       repo.put(id,atm);
   }
   public  ATM getById(String id){
       return repo.getOrDefault(id,null);
   }
   public void updateStatus(String id, ATMStatus newStatus){
       repo.get(id).setStatus(newStatus);
   }
}
