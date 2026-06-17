package entity;
/*
 * Seat Entity Class
 * This class represents a seat available for a particular movie show.
 * It stores seat details such as seat ID, show ID, seat number,
 * and booking status.
 */
public class Seat {
        private int seatId;
        private int showId;
        private String seatNumber;
        private boolean isBooked;
      /*
     * Parameterized Constructor
     * Initializes seat details.
        */
        public Seat(int seatId, int showId, String seatNumber, boolean isBooked) {
            this.seatId = seatId;
            this.showId = showId;
            this.seatNumber = seatNumber;
            this.isBooked = isBooked;
        }

        public int getSeatId() {
            return seatId;
        }

        public void setSeatId(int seatId) {
            this.seatId = seatId;
        }

        public int getShowId() {
            return showId;
        }

        public void setShowId(int showId) {
            this.showId = showId;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean isBooked() {
            return isBooked;
        }

        public void setBooked(boolean booked) {
            isBooked = booked;
        }
    }

