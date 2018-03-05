package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, faultsTeamA = 0, cornersTeamA = 0;
    int scoreTeamB = 0, faultsTeamB = 0, cornersTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putInt("scoreA", scoreTeamA );
        outState.putInt("faultsA", faultsTeamA);
        outState.putInt("cornersA", cornersTeamA);
        outState.putInt("scoreB", scoreTeamB);
        outState.putInt("faultsB", faultsTeamB);
        outState.putInt("cornersB", cornersTeamB);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        scoreTeamA = savedInstanceState.getInt("scoreA");
        faultsTeamA = savedInstanceState.getInt("faultsA");
        cornersTeamA = savedInstanceState.getInt("cornersA");
        scoreTeamB = savedInstanceState.getInt("scoreB");
        faultsTeamB = savedInstanceState.getInt("faultsB");
        cornersTeamB = savedInstanceState.getInt("cornersB");
        super.onRestoreInstanceState(savedInstanceState);

        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA);
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB);
    }

    /**
     * This method is called when the Team A Goal button is clicked
     */
    public void goalA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA);
    }

    /**
     * This method is called when the Team A Fault button is clicked
     */
    public void faultA (View view) {
        faultsTeamA++;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA);
    }


    /**
     * This method is called when the Team A Corner button is clicked
     */
    public void cornerA(View view) {
        cornersTeamA++;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA);
    }

    /**
     * This method is called when the Team B Goal button is clicked
     */
    public void goalB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB);
    }

    /**
     * This method is called when the Team B Fault button is clicked
     */
    public void faultB (View view) {
        faultsTeamB++;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB);
    }


    /**
     * This method is called when the Team B Corner button is clicked
     */
    public void cornerB(View view) {
        cornersTeamB++;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB);
    }

    /**
     * This method is called when the Reset button is clicked
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        faultsTeamA = 0;
        cornersTeamA = 0;
        scoreTeamB = 0;
        faultsTeamB = 0;
        cornersTeamB = 0;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA);
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB);
    }

    /**
     * Displays the given scores for Team A
     */
    public void displayForTeamA(int score,int faults, int corners) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = findViewById(R.id.team_a_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView =  findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
    }

    /**
     * Displays the given scores for Team B
     */
    public void displayForTeamB(int score,int faults, int corners) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = findViewById(R.id.team_b_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView = findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
    }


}
