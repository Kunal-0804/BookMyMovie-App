package entity;
import java.util.List;
/**
 * Booking Entity Class
 * This class stores booking-related information such as
 * booking ID, user ID, show ID, booked seats, and total price.
 */
public class Booking {
    // Unique ID for each booking
    private int bookingId;
   // ID of the user who made the booking
    private int userId;
   // ID of the movie show
    private int showId;
   // List of seats booked by the user
    private List<String> seatBooked;
   // Total amount paid for the booking
    private double totalPrice;

    /**
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

    // Returns booking ID
    public int getBookingId() {
        return bookingId;
    }
    // Sets booking ID
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    // Returns user ID
    public int getUserId() {
        return userId;
    }

    // Sets user ID
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Returns show ID
    public int getShowId() {
        return showId;
    }

    // Sets show ID
    public void setShowId(int showId) {
        this.showId = showId;
    }

    // Returns list of booked seats
    public List<String> getSeatBooked() {
        return seatBooked;
    }

    // Updates booked seats
    public void setSeatBooked(List<String> seatBooked) {
        this.seatBooked = seatBooked;
    }

    // Returns total booking price
    public double getTotalPrice() {
        return totalPrice;
    }

    // Updates total booking price
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
