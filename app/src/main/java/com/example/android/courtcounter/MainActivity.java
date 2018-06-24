package com.example.android.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA =0;
    int scoreB =0;
    TextView scoreViewA, scoreViewB;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreViewA = (TextView) findViewById(R.id.team_a_scoreA);
        scoreViewA.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int score) {
        scoreViewB = (TextView) findViewById(R.id.team_a_scoreB);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
   /* public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menuMain, menu);
        return true;
    }*/
    public void scoreThree(View view){
        scoreA=scoreA+3;

        displayA(scoreA);
    }
    public void scoreTwo(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }
    public void scoreFreeThrow(View view){
        scoreA++;
        displayA(scoreA);
    }
    public void scoreThreeB(View view){
        scoreB=scoreB+3;
        displayB( scoreB);
    }
    public void scoreTwoB(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }
    public void scoreFreeThrowB(View view){
        scoreB++;
        displayB(scoreB);
    }
    public void displayA (int number){
        //TextView countViewer = (TextView)findViewById(R.id.team_a_scoreA);
        scoreViewA.setText(""+ number);
    }
    public void displayB (int number){
   // TextView countViewer2 = (TextView)findViewById(R.id.team_a_scoreB);
        scoreViewB.setText(""+ number);}

    public void resetScores(View view){
        scoreA =0;
        scoreB =0;
        displayA(scoreA);
        displayB(scoreB);

    }

}