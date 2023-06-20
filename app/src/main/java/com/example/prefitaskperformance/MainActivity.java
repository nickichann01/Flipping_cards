package com.example.prefitaskperformance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.ContentValues;

public class MainActivity extends AppCompatActivity {

    ImageButton imgbtn;
    Button btScore;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        database = databaseHelper.getWritableDatabase();

        imgbtn = findViewById(R.id.strt_btn);
        btScore = findViewById(R.id.btSave);
        btScore .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 100; // Replace this with your actual score
                storeScore(score);
            }
        });

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevelOne();
            }
        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void openLevelOne(){
        Intent i = new Intent(this, LevelOne.class);
        startActivity(i);
        startCountdownTimer();
    }

    //Timer
    private void startCountdownTimer() {
        Intent intent = new Intent(MainActivity.this, LevelOne.class);
        startActivity(intent);
    }

    private void storeScore(int score) {
        ContentValues values = new ContentValues();
        values.put("score", score);
        database.insert("scores", null, values);
    }
}