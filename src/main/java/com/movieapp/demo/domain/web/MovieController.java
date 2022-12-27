package com.movieapp.demo.domain.web;

import com.movieapp.demo.domain.movie.MovieService;
import com.movieapp.demo.domain.movie.dto.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/film/{id}")
    public String getMovie(@PathVariable long id, Model model) {
        Optional<MovieDto> optionalMovie = movieService.findMovieById(id);
        optionalMovie.ifPresent(movie -> model.addAttribute("movie", movie));
        return "movie";
    }
}
