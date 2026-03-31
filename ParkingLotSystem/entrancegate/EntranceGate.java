package ParkingLotSystem.entrancegate;

import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.enums.VehicleType;
import ParkingLotSystem.parkingLot.ParkingLot;
import ParkingLotSystem.parkingSpot.ParkingSpot;
import ParkingLotSystem.vehicle.Vehicle;
import ParkingLotSystem.vehicle.VehicleFactory;

import java.util.Scanner;

public class EntranceGate {

    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void processEntrance(){

        Scanner sc=new Scanner(System.in);
        VehicleType vehicleType= VehicleType.valueOf(sc.next());
        String licenseNumber=sc.next();

        Vehicle vehicle= VehicleFactory.getObject(vehicleType,licenseNumber);
         if(vehicle==null){
             // throw the error this vehilc type is not allowed, only allowed BIKE AND CAR
             return;
         }
          ParkingSpot spotT=parkingLot.parkVehicle(vehicle);
         System.out.println("Vechile is parked successfully with spotNumber "+spotT.getSpotNumber());
    }
}
