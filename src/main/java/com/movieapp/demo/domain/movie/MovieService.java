package com.movieapp.demo.domain.movie;

import com.movieapp.demo.domain.movie.dto.MovieDto;
import com.movieapp.demo.domain.movie.dto.MovieSaveDto;
import com.movieapp.demo.domain.storage.FileStorageService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class MovieService {


    private final FileStorageService fileStorageService;

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository,
                        FileStorageService fileStorageService) {
        this.movieRepository = movieRepository;
        this.fileStorageService = fileStorageService;
    }

    public List<MovieDto> findAllPromotedMovies() {
        return movieRepository.findAllByPromotedIsTrue().stream()
                .map(MovieDtoMapper::map)
                .toList();
    }

    public Optional<MovieDto> findMovieById(long id) {
        return movieRepository.findById(id).map(MovieDtoMapper::map);
    }

//    public List<MovieDto> findMoviesByGenreName(String genre) {
//        return movieRepository.findAllByGenre_NameIgnoreCase(genre).stream()
//                .map(MovieDtoMapper::map)
//                .toList();
//    }

    public void addMovie(MovieSaveDto movieToSave) {
        Movie movie = new Movie();
        movie.setTitle(movieToSave.getTitle());
        movie.setOriginalTitle(movieToSave.getOriginalTitle());
        movie.setPromoted(movieToSave.isPromoted());
        movie.setReleaseYear(movieToSave.getReleaseYear());
        movie.setShortDescription(movieToSave.getShortDescription());
        movie.setDescription(movieToSave.getDescription());
        movie.setYoutubeTrailerId(movieToSave.getYoutubeTrailerId());

        if (movieToSave.getPoster() != null) {
            String savedFileName = fileStorageService.saveImage(movieToSave.getPoster());
            movie.setPoster(savedFileName);
        }
        movieRepository.save(movie);
    }
}
