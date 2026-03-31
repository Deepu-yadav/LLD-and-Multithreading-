package BookMyShow;

public class Gold extends Seat{

    private static final double GOLD_SEAT=300;
    public Gold(int seatNo) {
        super(seatNo);
    }

    @Override
    double calculateCharge() {
        return GOLD_SEAT;
    }
}
