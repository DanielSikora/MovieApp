package domain.web;

import domain.movie.MovieService;
import domain.movie.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping(path="/home")
public class HomeController {
    private final MovieService movieService;

    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(path="/v1")
    public ResponseEntity<String> home() {
//        List<MovieDto> promotedMovies = movieService.findAllPromotedMovies();
//        model.addAttribute("heading", "Promowane filmy");
//        model.addAttribute("description", "Filmy polecane przez nasz zespół");
//        model.addAttribute("movies", promotedMovies);
        return ResponseEntity.ok().build();
    }
}
