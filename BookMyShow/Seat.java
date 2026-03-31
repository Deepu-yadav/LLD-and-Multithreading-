package BookMyShow;

abstract class Seat {

    private int seatNo;;
    private boolean isOccupied;

    public Seat(int seatNo){
        this.seatNo=seatNo;
        this.isOccupied=false;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public boolean bookedSeat(){
        if(isOccupied) {
            // throw error this seat is already booked
            return false;
        }
        else{
            this.isOccupied=true;
            return true;
        }
    }
    public boolean vacant(){
        if(!isOccupied){
            // thrown an error this seat is already vacant
            return false;
        }
        else{
            this.isOccupied=false;
            return true;
        }
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    abstract double calculateCharge();
}
