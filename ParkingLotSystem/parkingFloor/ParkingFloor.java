package ParkingLotSystem.parkingFloor;

import ParkingLotSystem.enums.SpotType;
import ParkingLotSystem.parkingSpot.BikeSpot;
import ParkingLotSystem.parkingSpot.CarSpot;
import ParkingLotSystem.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private int capacityOfCar;
    private int capacityOfBike;

    List<ParkingSpot> list;

    ParkingFloor(int floorNumber,int noOfCars,int noOfBikes){
        this.floorNumber=floorNumber;
        this.capacityOfBike=noOfBikes;
        this.capacityOfCar=noOfCars;

        for(int i=0; i<noOfCars; i++){
            list.add(new CarSpot(i+1));
        }
        for(int i=noOfCars; i<=noOfCars+noOfBikes; i++){
            list.add(new BikeSpot(i+1));
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getCapacityOfCar() {
        return capacityOfCar;
    }

    public int getCapacityOfBike() {
        return capacityOfBike;
    }

    public List<ParkingSpot> getList() {
        return list;
    }
    public ParkingSpot findSpot(SpotType spotType){

        for(ParkingSpot parkingSpot:list){
           if(!parkingSpot.isOccupied() && parkingSpot.getSpotType().equals(spotType)){
               return parkingSpot;
           }
        }
        System.out.println("There is not spot available for this SpotType");  // error
        return null;
    }
    public List<ParkingSpot>allSpotAvailable(){
        List<ParkingSpot>list1=new ArrayList<>();
        for(ParkingSpot parkingSpot:list){
            if(!parkingSpot.isOccupied()){
                list1.add(parkingSpot);
            }
        }
        return list1;
    }
}
