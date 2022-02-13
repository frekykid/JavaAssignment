package com.company.objs;

public class MovieBooking {
    public int bookingID;
    private String movieName;
    private String showTime;
    private float cost;
    private int ticketCount;

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public MovieBooking(int bookingID, String movieName, String showTime, float cost, int ticketCount) {
        this.bookingID = bookingID;
        this.movieName = movieName;
        this.showTime = showTime;
        this.cost = cost;
        this.ticketCount = ticketCount;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

}
