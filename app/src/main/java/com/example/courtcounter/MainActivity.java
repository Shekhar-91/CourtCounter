package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Score calculate for Team A
     */
    public void addThree(View view) {
        pointsA = pointsA + 3;
        displayForTeamA(pointsA);
    }

    public void addTwo(View view) {
        pointsA = pointsA + 2;
        displayForTeamA(pointsA);
    }

    public void addOne(View view) {
        pointsA = pointsA + 1;
        displayForTeamA(pointsA);
    }

    /**
     * Score calculate for Team B
     */
    public void addThreeB(View view) {
        pointsB = pointsB + 3;
        displayForTeamB(pointsB);
    }

    public void addTwoB(View view) {
        pointsB = pointsB + 2;
        displayForTeamB(pointsB);
    }

    public void addOneB(View view) {
        pointsB = pointsB + 1;
        displayForTeamB(pointsB);
    }
/** RESET THE CODE */
    public void ResetScore(View view) {
        pointsA = 0;
        pointsB = 0;
        displayForTeamB(pointsB);
        displayForTeamA(pointsA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}