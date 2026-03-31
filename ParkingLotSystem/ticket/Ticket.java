package ParkingLotSystem.ticket;

import ParkingLotSystem.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {

    private LocalDateTime startTime;
    private String spotNumber;
    private Vehicle vehicle;
    Ticket(String spotNumber,Vehicle vehicle){
        this.spotNumber=spotNumber;
        this.vehicle=vehicle;
        startTime=LocalDateTime.now();   // set the current time
    }
}
