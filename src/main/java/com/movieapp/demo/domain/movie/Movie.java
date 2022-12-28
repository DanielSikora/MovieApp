package com.movieapp.demo.domain.movie;

import com.movieapp.demo.domain.genre.Genre;

import javax.persistence.*;

/**
 * Entity class of movie table
 */
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String originalTitle;

    private String shortDescription;

    private String description;

    private String youtubeTrailerId;
    private Integer releaseYear;
    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    private Genre genre;
    private boolean promoted;

    private String poster;
    /**
     * get movie poster
     * @return
     */
    public String getPoster() {
        return poster;
    }

    /**
     * set movie poster
     * @param poster
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /**
     * get movie id
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set movie id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getmovie title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set movie title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get original movie title
     * @return
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * set original movie title
     * @param originalTitle
     */
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     * get movie release yer
     * @return
     */
    public Integer getReleaseYear() {
        return releaseYear;
    }

    /**
     * set movie release yer
     * @param releaseYear
     */
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * get movie genre
     * @return
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * set movie genre
     * @param genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * check is promoted
     * @return
     */
    public boolean isPromoted() {
        return promoted;
    }

    /**
     * set film as promoted
     * @param promoted
     */
    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubeTrailerId() {
        return youtubeTrailerId;
    }

    public void setYoutubeTrailerId(String youtubeTrailerId) {
        this.youtubeTrailerId = youtubeTrailerId;
    }
}
