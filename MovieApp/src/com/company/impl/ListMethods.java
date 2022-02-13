package com.company.impl;

import com.company.objs.Movie;

import java.util.ArrayList;

public class ListMethods {

    public void templateDisplay(){
        System.out.println("\nMovieID\tMovie Name\tLanguage");
        System.out.println("----------------------------------------");
    }

    public void listMovies(ArrayList<Movie> movies){
        for(Movie eachMovie : movies){
            System.out.println(eachMovie.getMovieID()+" \t "+eachMovie.getMovieName()+" \t "+eachMovie.getLanguage());
        }
        System.out.println("-------------------------------------");
    }

    public boolean movieName(ArrayList<Movie> movies, String name){
        for(Movie eachMovie : movies){
            if(eachMovie.getMovieName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
