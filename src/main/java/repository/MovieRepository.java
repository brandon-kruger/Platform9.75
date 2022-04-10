/*
MovieRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;

import za.ac.cput.entity.Movie;
import za.ac.cput.entity.Receipt;

import java.util.HashSet;
import java.util.Set;

public class MovieRepository implements IMovieRepository{

    private static MovieRepository repository = null;
    private Set<Movie> movieDB = null;

    private MovieRepository (){movieDB = new HashSet<Movie>(); }

    public static MovieRepository getRepository(){
        if(repository == null) {
            repository = new MovieRepository();
        }
        return repository;
    }



   /** @Override
   // public Movie create(Movie movie) {
    //boolean success = movie.getDescription();
    //  if(!success)
    //      return null;
    //  return movie;
    // }
*/
    @Override
    public Movie read(Movie ID) {
        return null;
    }

/**
    @Override
    public Movie read(String description) {
        Movie movie = movieDB.stream()
                .filter(r -> r.getDescription.equals(description))
                .findAny()
                .orElse(null);
        return movie;
    }

    @Override
    public Movie update(Movie movie) {
        Movie oldMovie = read(movie.getDescription());
        if(oldMovie != null){
            movieDB.remove(oldMovie);
            movieDB.add(movie);
            return movie;
        }
        return null;
    }

    @Override
    public boolean delete(String referenceNumber) {
        Movie movieToDelete = read(referenceNumber);
        if(movieToDelete == null)
            return false;
        movieDB.remove(movieToDelete);
        return true;
    }
 */
    @Override
    public Set<Movie> getAll() {
        return movieDB;
    }
}
