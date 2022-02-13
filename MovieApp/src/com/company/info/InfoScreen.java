package com.company.info;
import com.company.impl.*;
import com.company.objs.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoScreen {
    Scanner in = new Scanner(System.in);
    MovieDetails details = new MovieDetails();
    ListMethods listMethods = new ListMethods();
    public void informScreen(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Enter option to Proceed.");
        System.out.println("1.Add Movie \n2.Remove Movie \n3.Update Movie \n4.List Movies\n5.Home");
        int option = in.nextInt();
        switch (option){
            case 1:
                details.addMovie();
                informScreen();
                System.out.println();
                break;
            case 2:
                ArrayList<Movie> movies1 = details.listMovies();
                listMethods.templateDisplay();
                listMethods.listMovies(movies1);
                System.out.println();
                System.out.print("Enter Movie ID : ");
                int idR = in.nextInt();
                details.removeMovie(idR);
                System.out.println();
                informScreen();
                break;
            case 3:
                ArrayList<Movie> movies2 = details.listMovies();
                listMethods.templateDisplay();
                listMethods.listMovies(movies2);
                System.out.println();
                System.out.print("Enter Movie ID : ");
                int id = in.nextInt();
                details.updateMovie(id);
                System.out.println();
                informScreen();
                break;
            case 4:
                ArrayList<Movie> movies = details.listMovies();
                listMethods.templateDisplay();
                listMethods.listMovies(movies);
                System.out.println();
                informScreen();
                break;
            default:
        }

    }
}
