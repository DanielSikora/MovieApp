package com.movieapp.demo.domain.genre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity class of genre table
 */
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

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
