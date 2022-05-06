package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {


        Movie movie = new Movie("USA", "Journey to SDET: Cydeo EU8", "Adventure, Comedy, Thriller", "10/25/2022",
                "Kuzzat Altay");

        movie.casts = new ArrayList<>(Arrays.asList("Asiya", "Adam", "Muhtar", "Barbaros", "Semra", "Oyku", "Masal", "Ukba"));

        System.out.println(movie);



    }

}

/*
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group
        print the full info of the movie
 */