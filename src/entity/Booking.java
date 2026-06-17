package entity;
import java.util.List;
/*
 * Booking Entity Class
 * This class stores booking-related information such as
 * booking ID, user ID, show ID, booked seats, and total price.
 */
public class Booking {
    
    private int bookingId;
   
    private int userId;
   
    private int showId;
   
    private List<String> seatBooked;
   
    private double totalPrice;

    /*
     * Parameterized Constructor
     * Used to initialize booking details.
     */
    public Booking(int bookingId, int userId, int showId, List<String> seatBooked, double totalPrice) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.showId = showId;
        this.seatBooked = seatBooked;
        this.totalPrice = totalPrice;
    }

    
    public int getBookingId() {
        return bookingId;
    }
    
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    
    public int getUserId() {
        return userId;
    }

    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public List<String> getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(List<String> seatBooked) {
        this.seatBooked = seatBooked;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Updates total booking price
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
