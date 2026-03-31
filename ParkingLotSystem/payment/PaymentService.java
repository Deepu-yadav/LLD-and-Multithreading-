package ParkingLotSystem.payment;

import java.util.AbstractMap;
import java.util.Scanner;

public class PaymentService {

    private Scanner scanner;

    PaymentService(Scanner scanner){
        this.scanner=scanner;
    }

    public void processPayment(double amount){
        choosePaymentMethod(amount);
    }

    public void choosePaymentMethod(double amount){
        System.out.println("Total Amount "+amount);
        System.out.println("Enter 1 for UPI");
        System.out.println("Enter 2 for Credit Card");
        System.out.println("Enter 3 for Cash");
        int next=scanner.nextInt();

        Payment payment;

        switch (next){
            case 1: payment=new Payment(new UPI(), amount);
             break;
            case 2: payment=new Payment(new CreditCard(),amount);
            break;
            case 3: payment=new Payment(new Cash(),amount);
            break;
            default:
                System.out.println("Invalid Payment method, defaulting to cash Payment");
                payment=new Payment(new Cash(),amount);
                break;

        }
        payment.processPayment();
    }
}
