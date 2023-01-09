package com.movieapp.demo.domain.web;

import com.movieapp.demo.domain.movie.MovieService;
import com.movieapp.demo.domain.movie.dto.MovieDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;


/**
 * <h1>@Controller MovieController</h1>
 * The program implements an MovieController
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Krzysztof Ksiazek
 * @author  Daniel Sikora
 * @author  Adrian Ciochon
 * @version 1.0
 * @since   2022-11-04
 */
@Controller
public class MovieController {
    private final MovieService movieService;

    /**
     * Constructor MovieController Class
     * @param movieService movieService
     */
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    /**
     * getMovie method
     * @param id id
     * @param model model
     * @return String
     */
    @GetMapping("/film/{id}")
    public String getMovie(@PathVariable long id, Model model) {
        MovieDto movie = movieService.findMovieById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        model.addAttribute("movie", movie);
        return "movie";

    }
}