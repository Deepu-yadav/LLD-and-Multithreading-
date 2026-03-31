package BookMyShow;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {

   private int theaterId;
   private String theaterName;
   private String city;
   private List<Hall> hallList;
   private String state;
   private int pinNo;

    public Theater(int theaterId, String theaterName, String city, String state, int pinNo) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.city = city;
        this.state = state;
        this.pinNo = pinNo;
        hallList=new ArrayList<>();
    }

    public int getTheaterId() {
        return theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getCity() {
        return city;
    }

    public List<Hall> getHallList() {
        return Collections.unmodifiableList(hallList);
    }

    public String getState() {
        return state;
    }

    public int getPinNo() {
        return pinNo;
    }
    public void addHall(Hall hall){
        hallList.add(hall);
    }
}

