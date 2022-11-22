package org.example;

public class Movie {
    private int movieId;
    private String movieName;
    private int movieRating;
    private String movieGenre;
    private String movieDescription;

    public Movie(int movieId, String movieName, int movieRating, String movieGenre, String movieDescription) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieGenre = movieGenre;
        this.movieDescription = movieDescription;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieRating=" + movieRating +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }
}
