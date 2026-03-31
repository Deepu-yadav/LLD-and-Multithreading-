package BookMyShow;

import BookMyShow.ENUM.BookingStatus;
import BookMyShow.ENUM.Show;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Booking {

    private String bookingId;
    private List<Seat> seatList;
    private Show show;
    private LocalDateTime createdAt;
    private BookingStatus bookingStatus;

    Booking(Show show,List<Seat>list){
        this.show=show;
        this.seatList=list;
        this.createdAt=LocalDateTime.now();
        this.bookingId= UUID.randomUUID().toString();
        this.bookingStatus=BookingStatus.CREATED;
    }

    public void confirmBooking(){
        this.bookingStatus=BookingStatus.CONFIRMED;
    }

    public void cancelledBooking(){
        this.bookingStatus=BookingStatus.CANCELLED;
    }

    public String getBookingId() {
        return bookingId;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public Show getShow() {
        return show;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
