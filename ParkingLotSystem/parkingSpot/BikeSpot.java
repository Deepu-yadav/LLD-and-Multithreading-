package ParkingLotSystem.parkingSpot;

import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.enums.VehicleType;
import ParkingLotSystem.vehicle.Vehicle;

public class BikeSpot extends ParkingSpot{

   public BikeSpot(int spotNumber) {
        super(SpotType.BIKE_SPOT, spotNumber);
    }

    @Override
    public boolean canPark(Vehicle vehicle) {
        if(vehicle.getVehicleType().equals(VehicleType.BIKE)){
            return true;
        }
        return  false;
    }
}
