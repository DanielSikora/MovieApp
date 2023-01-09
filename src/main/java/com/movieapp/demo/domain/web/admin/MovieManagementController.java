package com.movieapp.demo.domain.web.admin;

import com.movieapp.demo.domain.genre.GenreService;
import com.movieapp.demo.domain.genre.dto.GenreDto;
import com.movieapp.demo.domain.movie.MovieService;
import com.movieapp.demo.domain.movie.dto.MovieSaveDto;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * <h1>@Controller MovieManagementController</h1>
 * The program implements an MovieManagementController
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
public class MovieManagementController {
    private final MovieService movieService;
    private final GenreService genreService;

    /**
     * Constructor MovieManagementController CLass
     * @param movieService movieService
     * @param genreService genreService
     */
    public MovieManagementController(MovieService movieService, GenreService genreService) {
        this.movieService = movieService;
        this.genreService = genreService;
    }

    /**
     * addMovieForm method
     * @param model model
     * @return String
     */
    @GetMapping("/admin/dodaj-film")
    public String addMovieForm(Model model) {
        List<GenreDto> allGenres = genreService.findAllGenres();
        model.addAttribute("genres", allGenres);
        MovieSaveDto movie = new MovieSaveDto();
        model.addAttribute("movie", movie);
        return "admin/movie-form";
    }

    /**
     * addMovie method
     * @param movie movie
     * @param redirectAttributes redirectAttributes
     * @return String
     */
    @PostMapping("/admin/dodaj-film")
    public String addMovie(MovieSaveDto movie, RedirectAttributes redirectAttributes) {
        movieService.addMovie(movie);
        redirectAttributes.addFlashAttribute(
                AdminController.NOTIFICATION_ATTRIBUTE,
                "Film %s został zapisany".formatted(movie.getTitle()));
        return "redirect:/admin";
    }
}