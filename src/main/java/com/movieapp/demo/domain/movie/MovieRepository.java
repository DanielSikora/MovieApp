package com.movieapp.demo.domain.movie;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * <h1>Interface MovieRepository</h1>
 * The MovieRepository program implements an interface
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
public interface MovieRepository extends CrudRepository<Movie, Long> {
    /**
     * findAllByPromotedIsTrue method
     * @return List:Movie
     */
    List<Movie> findAllByPromotedIsTrue();

    /**
     * findAllByGenre_NameIgnoreCase method
     * @param genre genre
     * @return List:Movie
     */
    List<Movie> findAllByGenre_NameIgnoreCase(String genre);
}