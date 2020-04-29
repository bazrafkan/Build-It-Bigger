package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class JokeTaskAndroidTest {
    @Test
    public void testGetJokeResponse() {
        JokeTask jokeTask;
        jokeTask = new JokeTask(new JokeTask.AsyncJokeTaskResult() {
            @Override
            public void onPreExecute() {

            }

            @Override
            public void onPostExecute(String result) {
                assertNotNull(result);
            }
        });
        jokeTask.execute();

    }
}
