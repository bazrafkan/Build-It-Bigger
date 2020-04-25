package com.udacity.gradle.javajokes.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Joke implements Serializable {

    @SerializedName("status")
    private int status;

    @SerializedName("response")
    private String response;

    @SerializedName("joke")
    private String joke;

    @SerializedName("type")
    private String type;

    public Joke() {
    }

    public Joke(int status, String response, String joke, String type) {
        this.status = status;
        this.response = response;
        this.joke = joke;
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public String getResponse() {
        return response;
    }

    public String getJoke() {
        return joke;
    }

    public String getType() {
        return type;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public void setType(String type) {
        this.type = type;
    }
}
