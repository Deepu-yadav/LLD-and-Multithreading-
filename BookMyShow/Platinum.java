package BookMyShow;

public class Platinum extends Seat{

    private static final double PLATINUM_CHARGE=500;
    public Platinum(int seatNo) {
        super(seatNo);
    }

    @Override
    public double calculateCharge() {
      return PLATINUM_CHARGE;
    }
}
