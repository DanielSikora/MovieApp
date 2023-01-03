package com.movieapp.demo.domain.genre;

import com.movieapp.demo.domain.genre.dto.GenreDto;

public class GenreDtoMapper {
    static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
