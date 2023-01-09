package com.movieapp.demo.domain.genre.dto;

/**
 * <h1>GenreDto</h1>
 * The GenreDto program implements an application that represents genre
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
public class GenreDto {
    private Long id;
    private String name;
    private String description;

    /**
     * Constructor GenreDto Class
     * @param id id
     * @param name name
     * @param description description
     */
    public GenreDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Constructor without params
     */
    public GenreDto() {}

    /**
     * getId method
     * @return  Long
     */
    public Long getId() {
        return id;
    }

    /**
     * setId method
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getName method
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * setName method
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

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
}
