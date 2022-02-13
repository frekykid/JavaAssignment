package com.company.info;
import com.company.impl.ListMethods;
import com.company.impl.MovieBookingDetails;
import com.company.impl.MovieDetails;
import com.company.objs.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingInfo {
    Scanner in = new Scanner(System.in);
    MovieDetails details = new MovieDetails();
    MovieBookingDetails newBooking = new MovieBookingDetails();
    ListMethods listMethods = new ListMethods();
    public void bookingInfoScreen(){
        System.out.println("Welcome to Booking Section.");
        System.out.println("-------------------------------------");
        System.out.println("Please select an option.");
        System.out.println("1.Book Tickets\n2.Cancel Booking\n3.List Booking\n4.Home");
        System.out.println("------------------------------------");
        System.out.print("Please enter option : ");
        int option = in.nextInt();
        switch (option){
            case 1 :
                ArrayList<Movie> movies = details.listMovies();
                if(movies.size()!=0) {
                    listMethods.templateDisplay();
                    listMethods.listMovies(movies);
                }
                System.out.print("Enter Movie Name : ");
                String movieName = in.next();
                boolean movieId = listMethods.movieName(movies, movieName);
                if(movieId == true){
                    newBooking.addMovieBooking(movieName);
                }
                else{
                    System.out.println("Movie Not Found.");
                }
                bookingInfoScreen();
                break;
            case 2:
                newBooking.listBookings();
                System.out.print("Enter Booking ID : ");
                int bookingID = in.nextInt();
                newBooking.ticketCancel(bookingID);
                break;
            case 3:
                newBooking.listBookings();
                bookingInfoScreen();
                break;

        }
    }
}
