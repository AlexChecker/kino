
package com.alexchecker.kino.API;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Film {

    @SerializedName("filmId")
    @Expose
    private Integer filmId;
    @SerializedName("nameRu")
    @Expose
    private String nameRu;
    @SerializedName("nameEn")
    @Expose
    private Object nameEn;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("filmLength")
    @Expose
    private Object filmLength;
    @SerializedName("countries")
    @Expose
    private List<Country> countries;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("ratingVoteCount")
    @Expose
    private Integer ratingVoteCount;
    @SerializedName("posterUrl")
    @Expose
    private String posterUrl;
    @SerializedName("posterUrlPreview")
    @Expose
    private String posterUrlPreview;
    @SerializedName("ratingChange")
    @Expose
    private Object ratingChange;


    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Object getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(Object filmLength) {
        this.filmLength = filmLength;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getRatingVoteCount() {
        return ratingVoteCount;
    }

    public void setRatingVoteCount(Integer ratingVoteCount) {
        this.ratingVoteCount = ratingVoteCount;
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

    public Object getRatingChange() {
        return ratingChange;
    }

    public void setRatingChange(Object ratingChange) {
        this.ratingChange = ratingChange;
    }

}
