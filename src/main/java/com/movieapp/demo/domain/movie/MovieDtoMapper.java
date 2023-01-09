package com.movieapp.demo.domain.movie;


import com.movieapp.demo.domain.movie.dto.MovieDto;
/**
 * <h1>MovieDtoMapper</h1>
 * The MovieDtoMapper program implements an application that represents movie
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
class MovieDtoMapper {
    /**
     * map method
     * @param movie movie
     * @return
     */
    static MovieDto map(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getOriginalTitle(),
                movie.getShortDescription(),
                movie.getDescription(),
                movie.getYoutubeTrailerId(),
                movie.getReleaseYear(),
                movie.getGenre().getName(),
                movie.isPromoted(),
                movie.getPoster()
        );
    }
}