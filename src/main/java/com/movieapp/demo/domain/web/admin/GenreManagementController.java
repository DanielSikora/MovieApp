package com.movieapp.demo.domain.web.admin;

import com.movieapp.demo.domain.genre.GenreService;
import com.movieapp.demo.domain.genre.dto.GenreDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <h1>@Controller GenreManagementController</h1>
 * The program implements an GenreManagementController
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
public class GenreManagementController {
    private final GenreService genreService;

    /**
     * Constructor GenreManagementController Class
     * @param genreService genreService
     */
    public GenreManagementController(GenreService genreService) {
        this.genreService = genreService;
    }

    /**
     * addGenreForm method
     * @param model model
     * @return String
     */
    @GetMapping("/admin/dodaj-gatunek")
    public String addGenreForm(Model model) {
        GenreDto genre = new GenreDto();
        model.addAttribute("genre", genre);
        return "admin/genre-form";
    }

    /**
     * addGenre method
     * @param genre genre
     * @param redirectAttributes redirectAttributes
     * @return String
     */
    @PostMapping("/admin/dodaj-gatunek")
    public String addGenre(GenreDto genre, RedirectAttributes redirectAttributes) {
        genreService.addGenre(genre);
        redirectAttributes.addFlashAttribute(
                AdminController.NOTIFICATION_ATTRIBUTE,
                "Gatunek %s został zapisany".formatted(genre.getName()));
        return "redirect:/admin";
    }
}