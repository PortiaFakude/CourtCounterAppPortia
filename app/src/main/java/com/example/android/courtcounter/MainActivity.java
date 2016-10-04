package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(8);
        displayForTeamB(8);
    }

    /**
     *
     * Increase the score for Team A by 3 points
     */
    public void addThreeForTeamA(View v)
    {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);
    }

    /**
     *
     * Increase the score for Team A by 2 points
     */
    public void addTwoForTeamA(View v)
    {
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
    }

    /**
     *
     * Increase the score for Team A by 1 points
     */
    public void addOneForTeamA(View v)
    {
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }
    /**
     *Displays the given score for Team A
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     *Resets the score for both teams back to 0.
     */
    public void resetScore(View v){

        displayForTeamA(0);
        displayForTeamB(0);
        ScoreTeamA = 0;
        ScoreTeamB = 0;
    }
    /**
     *
     * Increase the score for Team A by 3 points
     */
    public void addThreeForTeamB(View v)
    {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }

    /**
     *
     * Increase the score for Team A by 2 points
     */
    public void addTwoForTeamB(View v)
    {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }

    /**
     *
     * Increase the score for Team A by 1 points
     */
    public void addOneForTeamB(View v)
    {
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }


}
