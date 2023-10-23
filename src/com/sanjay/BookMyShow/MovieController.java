package com.sanjay.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
	Map<City, List<Movie>>cityVsMoviesMap;
	List<Movie>allMovies;
	
	public MovieController() {
		cityVsMoviesMap = new HashMap<>();
		allMovies = new ArrayList<>();
	}

	public void addMovie(Movie movie, City city) {
		allMovies.add(movie);
		List<Movie>movies = cityVsMoviesMap.getOrDefault(city, new ArrayList<>());
		movies.add(movie);
		cityVsMoviesMap.put(city, movies);
	}
	Movie getMovieByName(String movieName) {

        for(Movie movie : allMovies) {
            if((movie.getMoviesName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

}
