package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.javajokes.Jokes;

public class Joke {
    private String joke;

    public void getRandomJoke() {
        joke = Jokes.getRandomJoke();
    }

    public String getJoke() {
        return joke;
    }
}
