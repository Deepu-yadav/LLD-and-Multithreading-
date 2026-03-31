package ParkingLotSystem.vehicle;

import ParkingLotSystem.enums.VehicleType;

public class BikeVehicle extends Vehicle {

  private static final double BIKE_CHARGE=20.0;
    BikeVehicle(String licenseNumber) {
        super(licenseNumber, VehicleType.BIKE);
    }
    @Override
    public double calculateCharge(double hour) {
     return hour*BIKE_CHARGE;
    }
}