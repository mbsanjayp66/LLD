package com.sanjay.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
	Map<City,List<Theatre>>cityVsTheatre;
	List<Theatre>allTheatres;
	
	public TheatreController() {
		cityVsTheatre = new HashMap<>();
		allTheatres = new ArrayList<>();
	}
}
