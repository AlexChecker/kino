package com.alexchecker.kino.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilmInfo {

    @SerializedName("kinopoiskId")
    @Expose
    private Integer kinopoiskId;
    @SerializedName("imdbId")
    @Expose
    private Object imdbId;
    @SerializedName("nameRu")
    @Expose
    private String nameRu;
    @SerializedName("nameEn")
    @Expose
    private Object nameEn;
    @SerializedName("nameOriginal")
    @Expose
    private String nameOriginal;
    @SerializedName("posterUrl")
    @Expose
    private String posterUrl;
    @SerializedName("posterUrlPreview")
    @Expose
    private String posterUrlPreview;
    @SerializedName("coverUrl")
    @Expose
    private String coverUrl;
    @SerializedName("logoUrl")
    @Expose
    private Object logoUrl;
    @SerializedName("reviewsCount")
    @Expose
    private Integer reviewsCount;
    @SerializedName("ratingGoodReview")
    @Expose
    private Object ratingGoodReview;
    @SerializedName("ratingGoodReviewVoteCount")
    @Expose
    private Integer ratingGoodReviewVoteCount;
    @SerializedName("ratingKinopoisk")
    @Expose
    private Double ratingKinopoisk;
    @SerializedName("ratingKinopoiskVoteCount")
    @Expose
    private Integer ratingKinopoiskVoteCount;
    @SerializedName("ratingImdb")
    @Expose
    private Double ratingImdb;
    @SerializedName("ratingImdbVoteCount")
    @Expose
    private Integer ratingImdbVoteCount;
    @SerializedName("ratingFilmCritics")
    @Expose
    private Double ratingFilmCritics;
    @SerializedName("ratingFilmCriticsVoteCount")
    @Expose
    private Integer ratingFilmCriticsVoteCount;
    @SerializedName("ratingAwait")
    @Expose
    private Object ratingAwait;
    @SerializedName("ratingAwaitCount")
    @Expose
    private Integer ratingAwaitCount;
    @SerializedName("ratingRfCritics")
    @Expose
    private Integer ratingRfCritics;
    @SerializedName("ratingRfCriticsVoteCount")
    @Expose
    private Integer ratingRfCriticsVoteCount;
    @SerializedName("webUrl")
    @Expose
    private String webUrl;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("filmLength")
    @Expose
    private Integer filmLength;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("shortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("editorAnnotation")
    @Expose
    private Object editorAnnotation;
    @SerializedName("isTicketsAvailable")
    @Expose
    private Boolean isTicketsAvailable;
    @SerializedName("productionStatus")
    @Expose
    private Object productionStatus;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ratingMpaa")
    @Expose
    private String ratingMpaa;
    @SerializedName("ratingAgeLimits")
    @Expose
    private String ratingAgeLimits;
    @SerializedName("countries")
    @Expose
    private List<Country> countries;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres;
    @SerializedName("startYear")
    @Expose
    private Object startYear;
    @SerializedName("endYear")
    @Expose
    private Object endYear;
    @SerializedName("serial")
    @Expose
    private Boolean serial;
    @SerializedName("shortFilm")
    @Expose
    private Boolean shortFilm;
    @SerializedName("completed")
    @Expose
    private Boolean completed;
    @SerializedName("hasImax")
    @Expose
    private Boolean hasImax;
    @SerializedName("has3D")
    @Expose
    private Boolean has3D;
    @SerializedName("lastSync")
    @Expose
    private String lastSync;

    public Integer getKinopoiskId() {
        return kinopoiskId;
    }

    public void setKinopoiskId(Integer kinopoiskId) {
        this.kinopoiskId = kinopoiskId;
    }

    public Object getImdbId() {
        return imdbId;
    }

    public void setImdbId(Object imdbId) {
        this.imdbId = imdbId;
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public Object getNameEn() {
        return nameEn;
    }

    public void setNameEn(Object nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameOriginal() {
        return nameOriginal;
    }

    public void setNameOriginal(String nameOriginal) {
        this.nameOriginal = nameOriginal;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getPosterUrlPreview() {
        return posterUrlPreview;
    }

    public void setPosterUrlPreview(String posterUrlPreview) {
        this.posterUrlPreview = posterUrlPreview;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Object getRatingGoodReview() {
        return ratingGoodReview;
    }

    public void setRatingGoodReview(Object ratingGoodReview) {
        this.ratingGoodReview = ratingGoodReview;
    }

    public Integer getRatingGoodReviewVoteCount() {
        return ratingGoodReviewVoteCount;
    }

    public void setRatingGoodReviewVoteCount(Integer ratingGoodReviewVoteCount) {
        this.ratingGoodReviewVoteCount = ratingGoodReviewVoteCount;
    }

    public Double getRatingKinopoisk() {
        return ratingKinopoisk;
    }

    public void setRatingKinopoisk(Double ratingKinopoisk) {
        this.ratingKinopoisk = ratingKinopoisk;
    }

    public Integer getRatingKinopoiskVoteCount() {
        return ratingKinopoiskVoteCount;
    }

    public void setRatingKinopoiskVoteCount(Integer ratingKinopoiskVoteCount) {
        this.ratingKinopoiskVoteCount = ratingKinopoiskVoteCount;
    }

    public Double getRatingImdb() {
        return ratingImdb;
    }

    public void setRatingImdb(Double ratingImdb) {
        this.ratingImdb = ratingImdb;
    }

    public Integer getRatingImdbVoteCount() {
        return ratingImdbVoteCount;
    }

    public void setRatingImdbVoteCount(Integer ratingImdbVoteCount) {
        this.ratingImdbVoteCount = ratingImdbVoteCount;
    }

    public Double getRatingFilmCritics() {
        return ratingFilmCritics;
    }

    public void setRatingFilmCritics(Double ratingFilmCritics) {
        this.ratingFilmCritics = ratingFilmCritics;
    }

    public Integer getRatingFilmCriticsVoteCount() {
        return ratingFilmCriticsVoteCount;
    }

    public void setRatingFilmCriticsVoteCount(Integer ratingFilmCriticsVoteCount) {
        this.ratingFilmCriticsVoteCount = ratingFilmCriticsVoteCount;
    }

    public Object getRatingAwait() {
        return ratingAwait;
    }

    public void setRatingAwait(Object ratingAwait) {
        this.ratingAwait = ratingAwait;
    }

    public Integer getRatingAwaitCount() {
        return ratingAwaitCount;
    }

    public void setRatingAwaitCount(Integer ratingAwaitCount) {
        this.ratingAwaitCount = ratingAwaitCount;
    }

    public Integer getRatingRfCritics() {
        return ratingRfCritics;
    }

    public void setRatingRfCritics(Integer ratingRfCritics) {
        this.ratingRfCritics = ratingRfCritics;
    }

    public Integer getRatingRfCriticsVoteCount() {
        return ratingRfCriticsVoteCount;
    }

    public void setRatingRfCriticsVoteCount(Integer ratingRfCriticsVoteCount) {
        this.ratingRfCriticsVoteCount = ratingRfCriticsVoteCount;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(Integer filmLength) {
        this.filmLength = filmLength;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Object getEditorAnnotation() {
        return editorAnnotation;
    }

    public void setEditorAnnotation(Object editorAnnotation) {
        this.editorAnnotation = editorAnnotation;
    }

    public Boolean getIsTicketsAvailable() {
        return isTicketsAvailable;
    }

    public void setIsTicketsAvailable(Boolean isTicketsAvailable) {
        this.isTicketsAvailable = isTicketsAvailable;
    }

    public Object getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(Object productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRatingMpaa() {
        return ratingMpaa;
    }

    public void setRatingMpaa(String ratingMpaa) {
        this.ratingMpaa = ratingMpaa;
    }

    public String getRatingAgeLimits() {
        return ratingAgeLimits;
    }

    public void setRatingAgeLimits(String ratingAgeLimits) {
        this.ratingAgeLimits = ratingAgeLimits;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Object getStartYear() {
        return startYear;
    }

    public void setStartYear(Object startYear) {
        this.startYear = startYear;
    }

    public Object getEndYear() {
        return endYear;
    }

    public void setEndYear(Object endYear) {
        this.endYear = endYear;
    }

    public Boolean getSerial() {
        return serial;
    }

    public void setSerial(Boolean serial) {
        this.serial = serial;
    }

    public Boolean getShortFilm() {
        return shortFilm;
    }

    public void setShortFilm(Boolean shortFilm) {
        this.shortFilm = shortFilm;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getHasImax() {
        return hasImax;
    }

    public void setHasImax(Boolean hasImax) {
        this.hasImax = hasImax;
    }

    public Boolean getHas3D() {
        return has3D;
    }

    public void setHas3D(Boolean has3D) {
        this.has3D = has3D;
    }

    public String getLastSync() {
        return lastSync;
    }

    public void setLastSync(String lastSync) {
        this.lastSync = lastSync;
    }

}