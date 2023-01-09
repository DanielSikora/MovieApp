package com.movieapp.demo.domain.genre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <h1>Genre</h1>
 * The Genre program implements an application that represents entity genre
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
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    /**
     * getDescription method
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription method
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get genre id
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set genre id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get genre name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set genre name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}