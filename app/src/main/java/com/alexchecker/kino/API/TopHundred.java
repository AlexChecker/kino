
package com.alexchecker.kino.API;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopHundred {

    @SerializedName("pagesCount")
    @Expose
    private Integer pagesCount;
    @SerializedName("films")
    @Expose
    private ArrayList<Film> films;

    public Integer getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

}
