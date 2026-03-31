package ParkingLotSystem.exitgate;

import ParkingLotSystem.parkingLot.ParkingLot;
import ParkingLotSystem.parkingSpot.ParkingSpot;
import ParkingLotSystem.payment.PaymentService;
import ParkingLotSystem.vehicle.Vehicle;

public class ExitGate {

     ParkingLot parkingLot;
     PaymentService paymentService;

     ExitGate(PaymentService paymentService,ParkingLot parkingLot){
         this.paymentService=paymentService;
         this.parkingLot=parkingLot;
     }

     public void processExit(int spotNumber,double hoursStayed){

         ParkingSpot parkingSpot=parkingLot.getSpotByNumber(spotNumber);
         if(parkingSpot==null){
             // throw error there is not parking spot found with this number;
             return;
         }

         Vehicle vehicle=parkingSpot.getVehicle();
         if(vehicle==null){
             // throw error there is not vehicle available at this spot
             return;
         }

         double fee=vehicle.calculateCharge(hoursStayed);
         paymentService.processPayment(fee);
         // now make it vacant
         parkingLot.vacant(spotNumber);

     }


}
