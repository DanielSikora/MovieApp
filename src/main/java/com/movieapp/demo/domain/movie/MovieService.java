package com.movieapp.demo.domain.movie;

import com.movieapp.demo.domain.genre.Genre;
import com.movieapp.demo.domain.genre.GenreRepository;
import com.movieapp.demo.domain.movie.dto.MovieDto;
import com.movieapp.demo.domain.movie.dto.MovieSaveDto;
import com.movieapp.demo.domain.storage.FileStorageService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * <h1>@Service MovieService</h1>
 * The MovieRepository program implements an MovieService Class
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
public class MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;
    private final FileStorageService fileStorageService;

    /**
     * Constructor MovieService Class
     * @param movieRepository movieRepository
     * @param genreRepository genreRepository
     * @param fileStorageService fileStorageService
     */
    public MovieService(MovieRepository movieRepository,
                        GenreRepository genreRepository,
                        FileStorageService fileStorageService) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
        this.fileStorageService = fileStorageService;
    }

    /**
     * findAllPromotedMovies method
     * @return List:MovieDto
     */
    public List<MovieDto> findAllPromotedMovies() {
        return movieRepository.findAllByPromotedIsTrue().stream()
                .map(MovieDtoMapper::map)
                .toList();
    }

    /**
     * findMovieById method
     * @param id id
     * @return Optional:MovieDto
     */
    public Optional<MovieDto> findMovieById(long id) {
        return movieRepository.findById(id).map(MovieDtoMapper::map);
    }

    /**
     * findMoviesByGenreName method
     * @param genre genre
     * @return List:MovieDto
     */
    public List<MovieDto> findMoviesByGenreName(String genre) {
        return movieRepository.findAllByGenre_NameIgnoreCase(genre).stream()
                .map(MovieDtoMapper::map)
                .toList();
    }

    /**
     * addMovie method
     * @param movieToSave movieToSave
     */
    public void addMovie(MovieSaveDto movieToSave) {
        Movie movie = new Movie();
        movie.setTitle(movieToSave.getTitle());
        movie.setOriginalTitle(movieToSave.getOriginalTitle());
        movie.setPromoted(movieToSave.isPromoted());
        movie.setReleaseYear(movieToSave.getReleaseYear());
        movie.setShortDescription(movieToSave.getShortDescription());
        movie.setDescription(movieToSave.getDescription());
        movie.setYoutubeTrailerId(movieToSave.getYoutubeTrailerId());
        Genre genre = genreRepository.findByNameIgnoreCase(movieToSave.getGenre()).orElseThrow();
        movie.setGenre(genre);
        if (movieToSave.getPoster() != null) {
            String savedFileName = fileStorageService.saveImage(movieToSave.getPoster());
            movie.setPoster(savedFileName);
        }
        movieRepository.save(movie);
    }
}