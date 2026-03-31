package ParkingLotSystem.vehicle;

import ParkingLotSystem.enums.VehicleType;

import java.security.PublicKey;

public  class VehicleFactory {


   public static Vehicle getObject(VehicleType type, String licenseNumber){
        if(type.equals(VehicleType.CAR)){
            return new CarVehicle(licenseNumber);
        }
        else if(type.equals(VehicleType.BIKE)){
            return new BikeVehicle(licenseNumber);
        }
        else{
            return  null;
        }
    }
}
