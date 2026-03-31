package BookMyShow;


import BookMyShow.ENUM.Show;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {


     private static BookingService instance;

      Map<String,Booking> bookingMap;

    private BookingService(){
        bookingMap=new HashMap<>();
    }

    public static synchronized BookingService getInstance(){
        if(instance==null){
            instance=new BookingService();
            return instance;
        }
        else{
            return instance;
        }
    }

    public Booking createBooking(Show show, List<Seat> seatList){

        // check , is all seats available
        for(Seat seat:seatList){
            if(seat.isOccupied()){
                // throw an error
                System.out.println("This seat is already booked");
            }
        }


        // going to Locked all the seat temporarily
        for (Seat seat:seatList){
            seat.bookedSeat();
        }
        Booking booking=new Booking(show,seatList);
        bookingMap.put(booking.getBookingId().toString(),booking);
        return booking;
    }

    // confirm the Booking after the payment

    public void confirmBooking(Booking booking){
        booking.confirmBooking();
    }
    public void cancelledBooking(Booking booking){

        for(Seat seat:booking.getSeatList()){
            seat.vacant();
        }
        booking.cancelledBooking();
    }

    // we can write here completeBooking method that will take two parameter,PaymentService and Booking that will process the payment
    // once payment is success then confirm the booking and if failed then cancelled the booking.
}
