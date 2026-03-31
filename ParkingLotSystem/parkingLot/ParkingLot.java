package ParkingLotSystem.parkingLot;

import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.parkingFloor.ParkingFloor;
import ParkingLotSystem.parkingSpot.ParkingSpot;
import ParkingLotSystem.vehicle.Vehicle;

import java.util.List;

public class ParkingLot {

    List<ParkingFloor> list;

    public ParkingLot(List<ParkingFloor>list){
        this.list=list;
    }

    public ParkingSpot getSpotByFloor(int floorNumber, SpotType spotType){

        for(ParkingFloor floor:list){
            boolean found=false;
          if(floor.getFloorNumber()==floorNumber){
              for(ParkingSpot parkingSpots:floor.getList()){
                  if(parkingSpots.getSpotType().equals(spotType) && !parkingSpots.isOccupied()){
                      return parkingSpots;
                  }
              }
              System.out.println("There is no spot available for this spotType on this floor please try another floor");
          }
        }
        return null;
    }
    public int getTotalFloor(){
        return list.size();
    }

    public void vacant(int spotNumber){

        for(ParkingFloor floor:list) {
                for (ParkingSpot parkingSpots : floor.getList()) {
                    if (parkingSpots.getSpotNumber() == spotNumber && parkingSpots.isOccupied()) {
                        parkingSpots.vacant();
                    }
                }
                //System.out.println("There is no spot available for this spotType on this floor please try another floor");
            }
        }


    public ParkingSpot parkVehicle(Vehicle vehicle){

        for(ParkingFloor parkingFloor:list){
            for(ParkingSpot spot :parkingFloor.getList()){
                if(spot.getVehicle().getVehicleType().equals(vehicle.getVehicleType())){
                  // in the vehicleType and SpotType should be same so that you can do here.
                }
            }
        }
        return null;
    }

    public ParkingSpot getSpotByNumber(int spotNumber) {

        for (ParkingFloor parkingFloor : list) {
            for (ParkingSpot spot : parkingFloor.getList()) {
                if (spot.getSpotNumber() == spotNumber) {
                    // in the vehicleType and SpotType should be same so that you can do here.
                    return spot;
                }
            }
            return null;

        }
        return null;
    }
}
