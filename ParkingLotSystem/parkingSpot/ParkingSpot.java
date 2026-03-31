package ParkingLotSystem.parkingSpot;


import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.vehicle.Vehicle;

public abstract class ParkingSpot {

   private boolean isOccupied;
   private SpotType type;
   private int spotNumber;
   private Vehicle vehicle;

   ParkingSpot(SpotType spotType,int spotNumber){
       this.spotNumber=spotNumber;
       this.type=spotType;
       this.isOccupied=false;
   }


   public boolean park(Vehicle vehicle) throws Exception {
      if(isOccupied || !canPark(vehicle)){
          throw new Exception("One Bike is already parked, this can not be parked");
      }
      this.isOccupied=true;
      this.vehicle=vehicle;
      return true;
   }

   public abstract boolean canPark(Vehicle vehicle);

   public boolean vacant() {
       if(!isOccupied ){
        System.out.println("This Spot Number is already Vacant");
        return false;
       }
       this.isOccupied=false;
       this.vehicle=null;
       return true;
   }

    public SpotType getSpotType() {
        return type;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
