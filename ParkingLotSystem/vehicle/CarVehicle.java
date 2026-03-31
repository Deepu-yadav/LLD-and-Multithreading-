package ParkingLotSystem.vehicle;

import ParkingLotSystem.enums.VehicleType;

public class CarVehicle extends Vehicle{

    private static final double CAR_CHARGE=30.0;
    CarVehicle(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }

    @Override
    public double calculateCharge(double hour) {
       return hour*CAR_CHARGE;
    }
}
