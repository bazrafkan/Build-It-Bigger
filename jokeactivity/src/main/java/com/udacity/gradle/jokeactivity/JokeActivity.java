package com.udacity.gradle.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    private TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        mJokeTextView = findViewById(R.id.tv_joke);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (joke != null) {
            mJokeTextView.setText(joke);
        } else {
            mJokeTextView.setText(getText(R.string.joke_error_message));
        }
    }
}
