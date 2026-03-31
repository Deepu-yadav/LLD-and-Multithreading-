package BookMyShow;

public class Silver extends Seat{

    private static final double SILVER_SEAT=200;
    public Silver(int seatNo) {
        super(seatNo);
    }

    @Override
    public double calculateCharge() {
       return SILVER_SEAT;
    }
}
