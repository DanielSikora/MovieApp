package com.movieapp.demo.domain.movie.dto;

/**
 *
 */
public class MovieDto {
    private Long id;
    private String title;
    private String originalTitle;
    private String shortDescription;
    private String description;
    private String youtubeTrailerId;
    private Integer releaseYear;
    private String genre;
    private boolean promoted;
    private String poster;

    /**
     * Constructor MovieDto Class
     * @param id id
     * @param title title
     * @param originalTitle originalTitle
     * @param shortDescription shortDescription
     * @param description description
     * @param youtubeTrailerId youtubeTrailerId
     * @param releaseYear releaseYear
     * @param genre genre
     * @param promoted promoted
     * @param poster poster
     */
    public MovieDto(Long id,
                    String title,
                    String originalTitle,
                    String shortDescription,
                    String description,
                    String youtubeTrailerId,
                    Integer releaseYear,
                    String genre,
                    boolean promoted,
                    String poster) {
        this.id = id;
        this.title = title;
        this.originalTitle = originalTitle;
        this.shortDescription = shortDescription;
        this.description = description;
        this.youtubeTrailerId = youtubeTrailerId;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.promoted = promoted;
        this.poster = poster;
    }

    /**
     * getPoster method
     * @return String
     */
    public String getPoster() {
        return poster;
    }

    /**
     * setPoster method
     * @param poster poster
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /**
     * getId method
     * @return Long
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
     * getTitle method
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle method
     * @param title title
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
}
