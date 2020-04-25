package com.udacity.gradle.javajokes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.udacity.gradle.javajokes.models.Joke;
import com.udacity.gradle.javajokes.utils.NetworkUtils;

import java.net.URL;

public class Jokes {
    final static String JOKE_URL = "https://jokes.guyliangilsing.me/retrieveJokes.php?type=random";

    public static String getRandomJoke() {
        try {
            URL url = new URL(JOKE_URL);
            String result = NetworkUtils.getResponseFromHttpUrl(url);
            if (result != null) {
                Joke joke = parseJSON(result);
                if (joke != null) {
                    return joke.getJoke();
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    private static Joke parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        Joke jokeResponse = gson.fromJson(response, Joke.class);
        return jokeResponse;
    }
}
