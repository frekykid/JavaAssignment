package com.company.user;

import com.company.impl.MovieDetails;
import com.company.info.BookingInfo;
import com.company.info.InfoScreen;

import java.util.Scanner;

public class Main {
    InfoScreen info = new InfoScreen();
    BookingInfo book = new BookingInfo();
    public void homeScreen() {
        InfoScreen newScreen = new InfoScreen();
        System.out.println("Welcome to Ticket Booking Software");
        System.out.println("\n1.Movies \n2.Book Tickets \n3.Exit");
        System.out.println("---------------------------------------");
        System.out.print("Please enter option : ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option) {
            case 1:
                info.informScreen();
                homeScreen();
                break;
            case 2:
                book.bookingInfoScreen();
                homeScreen();
                break;
            case 3:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Main myMain = new Main();
        myMain.homeScreen();
    }
}
