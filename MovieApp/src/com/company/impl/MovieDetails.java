package com.company.impl;
import com.company.objs.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieDetails {
    public static ArrayList<Movie> movies = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int id = 0;
    public void addMovie(){
        System.out.print("Enter the Number of Movies to Insert : ");
        int count = in.nextInt();
        for(int i=1;i<=count;i++) {
            id = i;
            System.out.print("Enter Movie Name : ");
            String movieName = in.next();
            System.out.print("Enter Language : ");
            String language = in.next();
            System.out.println();
            Movie newMovie = new Movie(id, movieName, language);
            movies.add(newMovie);
        }
        System.out.println("Movies Added Successfully.");
    }

    public ArrayList<Movie> listMovies(){
        return movies;
    }

    public void updateMovie(int id){
        for(Movie eachMovie : movies){
            if(eachMovie.getMovieID() == id){
                System.out.print("Enter Movie Name : ");
                String updatedName = in.next();
                eachMovie.setMovieName(updatedName);
                System.out.println("Updated Successfully.");
            }
            else{
                System.out.println("Movie Not Found.");
            }
            break;
        }
    }

    public void removeMovie(int id){
        for(Movie eachMovie : movies){
            if(eachMovie.getMovieID() == id){
                movies.remove(eachMovie);
                System.out.println("Removed Successfully.");
            }
            else{
                System.out.println("Movie Not Found");
            }
        }
    }
}
