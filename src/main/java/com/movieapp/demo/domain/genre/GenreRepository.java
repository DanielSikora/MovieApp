package com.movieapp.demo.domain.genre;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * <h1>Interface GenreRepository</h1>
 * The Interface GenreRepository program implements an application that represents GenreRepository
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
public interface GenreRepository extends CrudRepository<Genre, Long> {
    /**
     * findByNameIgnoreCase method
     * @param name name
     * @return Genre
     */
    Optional<Genre> findByNameIgnoreCase(String name);
}