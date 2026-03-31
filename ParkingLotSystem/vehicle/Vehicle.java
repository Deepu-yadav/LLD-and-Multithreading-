package ParkingLotSystem.vehicle;


import ParkingLotSystem.enums.VehicleType;

public abstract class Vehicle {

    private String licenseNumber;
    private VehicleType vehicleType;

    Vehicle(String licenseNumber,VehicleType type){
        this.licenseNumber=licenseNumber;
        this.vehicleType=type;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract double calculateCharge(double hour);
}
