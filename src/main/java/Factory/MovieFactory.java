/*
MovieFactoty.java
Author: Monehi Tuoane (219350744)
Date: 10 April 2022
*/
package Factory;

import za.ac.cput.entity.Movie;

public class MovieFactory {

    public static Movie createMovie(String movieTitle, String genre, String description, String filterMovies) {

        Movie Movie = new Movie.Builder().setMovieTitle(movieTitle).setGenre(genre)
                .setDescription(description)
                .setFilterMovies(filterMovies)
                .build();
        return Movie;
    }

}
