package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This project can be used for counting the score for American Football game.
 */
public class MainActivity extends AppCompatActivity {
    /*
     *Initializing both teams scores to zero
     */
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the score of Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Adds Six points to Team A.
     */
    public void SixPoints(View view)
    {
        scoreTeamA=scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }

    /**
     *Adds Three Points to Team A.
     */
    public void ThreePoints(View view)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /**
     *Adds Two Points to Team A.
     */
    public void TwoPoints(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    /**
     *Adds One Point to Team A.
     */
    public void OnePoint(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /**
     *Displays the score of Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     *Adds Six Points to Team B.
     */
    public void SixPointsB(View view)
    {
        scoreTeamB=scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    /**
     *Adds Three Points to Team B.
     */
    public void ThreePointsB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    /**
     *Adds Two Points to Team B.
     */
    public void TwoPointsB(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    /**
     *Adds One Point to Team B.
     */
    public void OnePointB(View view){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    /**
     *This method Resets the score of both teams to 0.
     */
    public void Reset(View v){
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);}
}
