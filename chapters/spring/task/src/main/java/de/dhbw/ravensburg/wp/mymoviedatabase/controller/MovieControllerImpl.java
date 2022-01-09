package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.ArtistService;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieService;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieControllerImpl implements MovieController {

    private final MovieService movieService;
    private final ArtistService artistService;

    @Autowired
    public MovieControllerImpl(MovieService movieService, ArtistService artistService) {
        this.movieService = movieService;
        this.artistService = artistService;
    }

    @Override
    public String getName() {
        return "MovieControllerImpl";
    }

    @Override
    public String getServiceName() {
        return this.movieService.getName();
    }

    @Override
    public String getArtistServiceName() {
        return this.artistService.getName();
    }

}
