package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void click3(View view){
        Button button1=(Button) findViewById(R.id.buttonPanel_1);
        scoreA=scoreA+3;
        displayForTeamA(scoreA);

    }

    public void click2(View view){
        Button button2=(Button) findViewById(R.id.buttonPanel_2);
        scoreA=scoreA+2;
        displayForTeamA(scoreA);

    }
    public void freethrow(View view){
        Button button3=(Button) findViewById(R.id.buttonPanel_3);
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }




    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void click3b(View view){
        Button button1=(Button) findViewById(R.id.buttonPanel_1b);
        scoreB=scoreB+3;
        displayForTeamB(scoreB);

    }

    public void click2b(View view){
        Button button2=(Button) findViewById(R.id.buttonPanel_2b);
        scoreB=scoreB+2;
        displayForTeamB(scoreB);

    }
    public void freethrowb(View view){
        Button button3=(Button) findViewById(R.id.buttonPanel_3b);
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        Button resetbutton=(Button)findViewById(R.id.reset_button);
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
