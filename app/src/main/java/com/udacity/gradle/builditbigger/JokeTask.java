package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;

import com.udacity.gradle.javajokes.Jokes;

public class JokeTask extends AsyncTask<Void, Void, String> {
    public interface AsyncJokeTaskResult {
        void onPreExecute();

        void onPostExecute(String result);
    }

    public AsyncJokeTaskResult delegate;

    public JokeTask(AsyncJokeTaskResult delegate) {
        this.delegate = delegate;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        this.delegate.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {
        return Jokes.getRandomJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        delegate.onPostExecute(result);
    }
}
