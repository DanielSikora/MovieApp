package com.movieapp.demo.domain.genre;

import com.movieapp.demo.domain.genre.dto.GenreDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

/**
 * <h1>@Service GenreService</h1>
 * The GenreService program implements an application that represents GenreService
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
@Service
public class GenreService {
    private final GenreRepository genreRepository ;

    /**
     * Constructor GenreService Class
     * @param genreRepository genreRepository
     */
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    /**
     * findGenreByName method
     * @param name name
     * @return Optional GenreDto
     */
    public Optional<GenreDto> findGenreByName(String name) {
        return genreRepository.findByNameIgnoreCase(name)
                .map(GenreDtoMapper::map);
    }

    /**
     * findAllGenres method
     * @return List:GenreDto
     */
    public List<GenreDto> findAllGenres() {
        return StreamSupport.stream(genreRepository.findAll().spliterator(), false)
                .map(GenreDtoMapper::map)
                .toList();
    }

    /**
     * addGenre method
     * @param genre genre
     */
    @Transactional
    public void addGenre(GenreDto genre) {
        Genre genreToSave = new Genre();
        genreToSave.setName(genre.getName());
        genreToSave.setDescription(genre.getDescription());
        genreRepository.save(genreToSave);
    }
}