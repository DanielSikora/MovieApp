package com.movieapp.demo.domain.genre;

import com.movieapp.demo.domain.genre.dto.GenreDto;

/**
 * <h1>GenreDtoMapper</h1>
 * The GenreDtoMapper program implements an application that represents GenreDtoMapper
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
public class GenreDtoMapper {
    /**
     * map method
     * @param genre genre
     * @return
     */
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}