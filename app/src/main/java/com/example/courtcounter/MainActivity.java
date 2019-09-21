package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    final int POINT3 = 3;
    final int POINT2 = 2;
    final int POINT1 = 1;
    final int POINT0 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     *For adding 3 point for team A
     *
     */
    public void add3TeamA(View view){
        teamAScore += POINT3;
        displayForTeamA(teamAScore);
    }
    /**
     *For adding 2 point for team A
     *
     */
    public void add2TeamA(View view){
        teamAScore += POINT2;
        displayForTeamA(teamAScore);
    }
    /**
     *For adding 1 point for team A
     *
     */
    public void add1TeamA(View view){
        teamAScore += POINT1;
        displayForTeamA(teamAScore);
    }
    /**
     *For adding 3 point for team B
     *
     */
    public void add3TeamB(View view){
        teamBScore += POINT3;
        displayForTeamB(teamBScore);
    }
    /**
     *For adding 2 point for team B
     *
     */
    public void add2TeamB(View view){
        teamBScore += POINT2;
        displayForTeamB(teamBScore);
    }
    /**
     *For adding 1 point for team B
     *
     */
    public void add1TeamB(View view){
        teamBScore += POINT1;
        displayForTeamB(teamBScore);
    }

    public void reset0(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }


}
