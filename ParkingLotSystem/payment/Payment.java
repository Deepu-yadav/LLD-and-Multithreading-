package ParkingLotSystem.payment;

public class Payment {

    private PaymentStrategy paymentStrategy;
    private double amount;

     Payment(PaymentStrategy paymentStrategy,double amount){
        this.paymentStrategy=paymentStrategy;
        this.amount=amount;
     }

     public void processPayment(){
         if(amount>0){
             paymentStrategy.process(amount);
         }
         else{
             System.out.println("Invalid Payment amount");
         }
     }
}
