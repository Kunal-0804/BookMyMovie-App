package service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * BookMyMovie Application
 * This is the main class of the BookMyMovie project.
 * It provides a console-based interface for users to:
 * 1. Select a city
 * 2. View available theaters
 * 3. Select a movie and theater
 * 4. View available shows
 * 5. Select seats
 * 6. Book movie tickets
 */
public class BookMyMovieApp {

    public static void main(String[] args) {
        // Creating object of BookMyMovieSys service class
        BookMyMovieSys mbs=new BookMyMovieSys();
        
        // Scanner object for taking user input
        Scanner sc=new Scanner(System.in);
        // Step 1: Enter city name
        System.out.println("Enter city:");
        String city=sc.next();
        mbs.displayTheaters(city);

        // Step 2: Select theater and movie
        System.out.println("Enter Theater Id and Movie Id:");
        int theaterId = sc.nextInt();
        int movieId=sc.nextInt();
        mbs.displayShows(movieId,theaterId);

        // Step 3: Select show
        System.out.println("Enter show Id:");
        int showId = sc.nextInt();

        // Step 4: Enter number of seats to book
        System.out.println("Enter number of seats:");
        int numberOfSeats = sc.nextInt();

        sc.nextLine(); // buffer clear

        // Step 5: Enter seat numbers
        System.out.println("Enter seat numbers (comma separated, e.g., A1,A2): ");
        String input = sc.nextLine();

        List<String> ss = Arrays.asList(input.split(","));

        if(ss.size() != numberOfSeats) {
            System.out.println("Seat count mismatch!");
            return;
        }

        mbs.bookTicket(1, showId, ss);


    }

}

