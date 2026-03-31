package ParkingLotSystem.parkingSpot;

import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.enums.VehicleType;
import ParkingLotSystem.vehicle.Vehicle;

import java.security.PublicKey;

public class CarSpot extends ParkingSpot{

     public CarSpot(int spotNumber){
         super(SpotType.CAR_SPOT,spotNumber);
     }

    @Override
    public boolean canPark(Vehicle vehicle) {
        if(vehicle.getVehicleType().equals(VehicleType.CAR)){
            return true;
        }
        return false;
    }
}
