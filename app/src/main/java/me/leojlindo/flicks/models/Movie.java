package me.leojlindo.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    // values from API

    private String title;
    private String overview;
    private String posterPath; // not full url (only path)

    //initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
    }
    //make getters by right clicking, generate, select variables

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }
}
