package com.sanjay.BookMyShow;

public class BookMyShow {

	MovieController movieController;
	TheatreController theatreController;
	public BookMyShow() {
		movieController = new MovieController();
		theatreController = new TheatreController();
	}
	public static void main(String[] args) {
		BookMyShow bookMyShow = new BookMyShow();
		bookMyShow.initialize();
		
	}
	private void initialize() {
		createMovies();
		craeteTheatres();
		
	}
	private void craeteTheatres() {
		Movie avengers = movieController.getMovieByName("Avengers");
		Movie bahubali = movieController.getMovieByName("Bahubali");
		
	}
	private void createMovies() {
		Movie avengers = new Movie();
		avengers.setMoviesName("Avengers");
		avengers.setMovieId(1);
		avengers.setMovieDurationInMinutes(310);
		
		
		Movie bahubali = new Movie();
		bahubali.setMoviesName("Bahubali");
		bahubali.setMovieId(2);
		bahubali.setMovieDurationInMinutes(210);
		
		movieController.addMovie(avengers,City.Bangalore);
		movieController.addMovie(bahubali,City.Delhi);
	}

}
