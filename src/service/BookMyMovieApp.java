package service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyMovieApp {

    public static void main(String[] args) {
        BookMyMovieSys mbs=new BookMyMovieSys();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter city:");
        String city=sc.next();
        mbs.displayTheaters(city);

        System.out.println("Enter Theater Id and Movie Id:");
        int theaterId = sc.nextInt();
        int movieId=sc.nextInt();
        mbs.displayShows(movieId,theaterId);


        System.out.println("Enter show Id:");
        int showId = sc.nextInt();

        System.out.println("Enter number of seats:");
        int numberOfSeats = sc.nextInt();

        sc.nextLine(); // buffer clear

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

