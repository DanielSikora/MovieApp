package com.movieapp.demo.domain.web;

import com.movieapp.demo.domain.movie.MovieService;
import com.movieapp.demo.domain.movie.dto.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

/**
 * <h1>@Controller HomeController</h1>
 * The program implements an HomeController
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
public class HomeController {
    private final MovieService movieService;

    /**
     * Constructor HomeController Class
     * @param movieService movieService
     */
    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * home "/" method
     * @param model model
     * @return
     */
    @GetMapping("/")
    public String home(Model model) {
        List<MovieDto> promotedMovies = movieService.findAllPromotedMovies();
        model.addAttribute("heading", "Promowane filmy");
        model.addAttribute("description", "Filmy polecane przez nasz zespół projektowy: Ksiazek, Sikora, Ciochon.");
        model.addAttribute("movies", promotedMovies);
        return "movie-listing";
    }
}