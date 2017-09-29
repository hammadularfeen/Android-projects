package com.example.newlifenetwork.counterapp;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button six = (Button)findViewById(R.id.six);
        Button four = (Button)findViewById(R.id.four);
        Button single = (Button)findViewById(R.id.single);
        Button dble = (Button)findViewById(R.id.two);
        Button triple = (Button)findViewById(R.id.triple);
        Button noball = (Button)findViewById(R.id.noball);
        Button wide = (Button)findViewById(R.id.wide);
        Button out = (Button)findViewById(R.id.out);
        Button dotball = (Button)findViewById(R.id.dotball);
        final TextView runs = (TextView)findViewById(R.id.score);
        final TextView balls = (TextView)findViewById(R.id.balls);
        final TextView wickets = (TextView)findViewById(R.id.outs);
        final TextView overs = (TextView)findViewById(R.id.overs);



        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+6;
                String run1 = String.valueOf(run);
                runs.setText(run1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+4;
                String run1 = String.valueOf(run);
                runs.setText(run1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+1;
                String run1 = String.valueOf(run);
                runs.setText(run1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        dble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+2;
                String run1 = String.valueOf(run);
                runs.setText(run1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        triple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+3;
                String run1 = String.valueOf(run);
                runs.setText(run1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        dotball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int runout = Integer.parseInt(wickets.getText().toString())+1;
                String runout1 = String.valueOf(runout);
                wickets.setText(runout1);
                int bal2 = Integer.parseInt(overs.getText().toString())+1;
                String ball1 = String.valueOf(bal2);
                int bal = Integer.parseInt(balls.getText().toString())+1;
                String ball = String.valueOf(bal);
                if(bal>5){
                    overs.setText(ball1);
                    balls.setText("0");
                }else{
                    balls.setText(ball);
                }
            }
        });
        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+1;
                String run1 = String.valueOf(run);
                runs.setText(run1);
            }
        });
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int run = Integer.parseInt(runs.getText().toString())+1;
                String run1 = String.valueOf(run);
                runs.setText(run1);
            }
        });

    }
}
