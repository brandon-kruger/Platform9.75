/*
IMovieRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;


import za.ac.cput.entity.Movie;
import java.util.Set;

public interface IMovieRepository extends IRepository<Movie, String>{

    public Set<Movie> getAll();
}

