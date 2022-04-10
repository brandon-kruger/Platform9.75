/*
Movie.java
Entity for Movie
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package za.ac.cput.entity;

public class Movie {

    private String movieTitle;
    private String genre;
    private String description;
    private String filterMovies;

    //Default Constructor
    private Movie() {}

    //Builder Class
    private Movie (Builder builder) {

        this.movieTitle = builder.movieTitle;
        this.genre = builder.genre;
        this.description = builder.description;
        this.filterMovies = builder.filterMovies;

    }

    //Getters
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getGenre() {
        return genre;
    }
    public String getDescription() {
        return description;
    }
    public String getFilterMovies() {
        return filterMovies;
    }

    //Setters
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setFilterMovies(String filterMovies) {
        this.filterMovies = filterMovies;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", filterMovies='" + filterMovies + '\'' +
                '}';
    }

    //Builder ClassS
    public static class Builder {
        private String movieTitle;
        private String genre;
        private String description;
        private String filterMovies;


        public Movie.Builder setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
            return this;
        }

        public Movie.Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Movie.Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Movie.Builder setFilterMovies(String filterMovies) {
            this.filterMovies = filterMovies;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }
    }
}
