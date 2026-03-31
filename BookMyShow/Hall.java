package BookMyShow;

import BookMyShow.ENUM.ScreeType;
import BookMyShow.ENUM.Show;

import java.util.ArrayList;
import java.util.List;

public class Hall {

    private int hallId;
    private List<Seat> list;
    private List<Show>showList;
    private ScreeType screeType;
    private int noOfSilverSeat;
    private int noOfGoldSeat;
    private int noOfPlatinumSeat;

    public Hall(int hallId, ScreeType screeType, int noOfSilverSeat, int noOfGoldSeat, int noOfPlatinumSeat) {
        this.hallId = hallId;
        this.screeType = screeType;
        this.noOfSilverSeat = noOfSilverSeat;
        this.noOfGoldSeat = noOfGoldSeat;
        this.noOfPlatinumSeat = noOfPlatinumSeat;
        showList=new ArrayList<>();
        list=new ArrayList<>();
        int seatId=1;
        for(int i=1; i<=noOfSilverSeat; i++){
            list.add(new Silver(seatId++));
        }
        for(int i=noOfSilverSeat+1; i<=noOfSilverSeat+noOfGoldSeat; i++){
            list.add(new Gold(seatId++));
        }
        for(int i=noOfSilverSeat+noOfGoldSeat+1; i<=noOfSilverSeat+noOfGoldSeat+noOfPlatinumSeat; i++){
            list.add(new Platinum(seatId++));
        }
    }

    public int getHallId() {
        return hallId;
    }

    public List<Seat> getList() {
        return list;
    }

    public ScreeType getScreeType() {
        return screeType;
    }

    public int getNoOfSilverSeat() {
        return noOfSilverSeat;
    }

    public int getNoOfGoldSeat() {
        return noOfGoldSeat;
    }

    public int getNoOfPlatinumSeat() {
        return noOfPlatinumSeat;
    }
    public void addShow(Show show){
        // check there should not be any conflict here
        showList.add(show);
    }
}
