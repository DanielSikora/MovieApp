package com.movieapp.demo.domain.movie.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * <h1>MovieSaveDto</h1>
 * The MovieDto program implements an application that represents saved movie
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
public class MovieSaveDto {
    private String title;
    private String originalTitle;
    private String shortDescription;
    private String description;
    private String youtubeTrailerId;
    private Integer releaseYear;
    private String genre;
    private boolean promoted;
    private MultipartFile poster;

    /**
     * getTitle method
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle method
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getOriginalTitle method
     * @return String
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * originalTitle method
     * @param originalTitle originalTitle
     */
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     * getShortDescription method
     * @return String
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * setShortDescription method
     * @param shortDescription shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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

    /**
     * getYoutubeTrailerId method
     * @return String
     */
    public String getYoutubeTrailerId() {
        return youtubeTrailerId;
    }

    /**
     * setYoutubeTrailerId method
     * @param youtubeTrailerId youtubeTrailerId
     */
    public void setYoutubeTrailerId(String youtubeTrailerId) {
        this.youtubeTrailerId = youtubeTrailerId;
    }

    /**
     * getReleaseYear method
     * @return Integer
     */
    public Integer getReleaseYear() {
        return releaseYear;
    }

    /**
     * setReleaseYear method
     * @param releaseYear releaseYear
     */
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * getGenre method
     * @return String
     */
    public String getGenre() {
        return genre;
    }

    /**
     * setGenre method
     * @param genre genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * isPromoted method
     * @return boolean
     */
    public boolean isPromoted() {
        return promoted;
    }

    /**
     * setPromoted method
     * @param promoted promoted
     */
    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    /**
     * getPoster method
     * @return MultipartFile
     */
    public MultipartFile getPoster() {
        return poster;
    }

    /**
     * setPoster method
     * @param poster poster
     */
    public void setPoster(MultipartFile poster) {
        this.poster = poster;
    }
}
