package com.company.impl;

import com.company.objs.MovieBooking;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Scanner;
import java.util.Iterator;

public class MovieBookingDetails {
    Scanner in = new Scanner(System.in);
    public static ArrayList<MovieBooking> ticketBooking = new ArrayList<>();
    int id;
    boolean isFirst;
    public void addMovieBooking(String name){
        if(isFirst==true){
            id = 1;
        }else {
            ++id;
            isFirst = false;
        }
            System.out.print("Enter Showtime : ");
            String showTime = in.next();
            System.out.print("Enter Ticket Count : ");
            int ticketCount = in.nextInt();
        float total = totalCost(ticketCount);
        MovieBooking newBooking = new MovieBooking(id, name, showTime,total, ticketCount);
        ticketBooking.add(newBooking);
        ticketBooked(total);

    }

    public float totalCost(int ticketCount){
        float tax = (29 * 20)/100;
        float totalCost = ticketCount * (29 + tax);
        return totalCost;
    }
   /* public float totalCost(ArrayList<MovieBooking> ticketBooking, int id){
        System.out.println(id);
        float totalCost = 0;
        for (MovieBooking booking : ticketBooking){
            int count = booking.getTicketCount();
            int price = booking.getCost();
            System.out.println(booking.getCost());
            float tax = (price * 20)/100;
            totalCost = count * (price + tax);

        }
        System.out.println(totalCost);
        return totalCost;
    }*/

    public void ticketBooked(float total){
        System.out.println("Booking Confirmed. Please pay and collect tickets at theater.");
        System.out.println();
        System.out.println("Movie\t\t Showtime\t\t Tickets\t\t Total");
        System.out.println("-----------------------------------------------");
        for(MovieBooking booking : ticketBooking){
            System.out.println(booking.getMovieName()+"\t\t"+booking.getShowTime()+"\t\t"+booking.getTicketCount()+"\t\t"+booking.getCost());
        }
        System.out.println("Thank you for booking. Hope to see you again.");
        System.out.println();
    }

    public void ticketCancel(int id) throws ConcurrentModificationException {
        Iterator<MovieBooking> bookings = ticketBooking.iterator();
        MovieBooking book = bookings.next();
        if(book.getBookingID() == id){
            ticketBooking.remove(book);
            System.out.println("Cancellation Successful.");
        } else {
            System.out.println("Ticket Not Found.");
        }
    }


    public void listBookings(){
        System.out.println("BookingID \t MovieName");
        for(MovieBooking booking : ticketBooking){
            System.out.println(booking.getBookingID()+"\t"+booking.getMovieName()+"\t");
        }
    }

}

