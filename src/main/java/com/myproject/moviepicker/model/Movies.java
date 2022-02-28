package com.myproject.moviepicker.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Movies {
    private List<Movie> listOfMovies;

    public void addMovie(Movie movie) {
        if(listOfMovies == null) {
            listOfMovies = new ArrayList<>();
        }
        listOfMovies.add(movie);
    }
}
