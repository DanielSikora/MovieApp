package com.movieapp.demo.domain.web;

import com.movieapp.demo.domain.genre.GenreService;
import com.movieapp.demo.domain.genre.dto.GenreDto;
import com.movieapp.demo.domain.movie.MovieService;
import com.movieapp.demo.domain.movie.dto.MovieDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * <h1>@Controller GenreController</h1>
 * The program implements an GenreController
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
public class GenreController {
    private final GenreService genreService;
    private final MovieService movieService;

    /**
     * Constructor GenreController Class
     * @param genreService genreService
     * @param movieService movieService
     */
    public GenreController(GenreService genreService, MovieService movieService) {
        this.genreService = genreService;
        this.movieService = movieService;
    }

    /**
     * getGenre
     * @param name name
     * @param model model
     * @return String
     */
    @GetMapping("/gatunek/{name}")
    public String getGenre(@PathVariable String name, Model model) {
        GenreDto genre = genreService.findGenreByName(name)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        List<MovieDto> movies = movieService.findMoviesByGenreName(name);
        model.addAttribute("heading", genre.getName());
        model.addAttribute("description", genre.getDescription());
        model.addAttribute("movies", movies);
        return "movie-listing";


    }

    /**
     * getGenreList method
     * @param model model
     * @return String
     */
    @GetMapping("/gatunki-filmowe")
    public String getGenreList(Model model) {
        List<GenreDto> genres = genreService.findAllGenres();
        model.addAttribute("genres", genres);
        return "genre-listing";
    }
}