package com.example.prefitaskperformance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class LevelOne extends AppCompatActivity {

    //For the timer
    private CountDownTimer countDownTimer;

    ImageView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12;
    TextView score, timer;

    //Array for images to flip
    Integer[] imagesArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int image01, image02, image03, image04, image05, image06,
            image07, image08, image09, image010, image011, image012;
    int firstCard, secondCard, clickFirst, clickSecond;

    int cardNumber = 1;
    int playerPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        timer = findViewById(R.id.time);
        countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                timer.setText("" + seconds);
            }

            @Override
            public void onFinish() {
                timer.setText("Time is over");
                navigateToNextActivity();
            }
        }.start();

        score = (TextView) findViewById(R.id.scores);

        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);
        card3 = (ImageView) findViewById(R.id.card3);
        card4 = (ImageView) findViewById(R.id.card4);
        card5 = (ImageView) findViewById(R.id.card5);
        card6 = (ImageView) findViewById(R.id.card6);
        card7 = (ImageView) findViewById(R.id.card7);
        card8 = (ImageView) findViewById(R.id.card8);
        card9 = (ImageView) findViewById(R.id.card9);
        card10 = (ImageView) findViewById(R.id.card10);
        card11 = (ImageView) findViewById(R.id.card11);
        card12 = (ImageView) findViewById(R.id.card12);

        card1.setTag("0");
        card2.setTag("1");
        card3.setTag("2");
        card4.setTag("3");
        card5.setTag("4");
        card6.setTag("5");
        card7.setTag("6");
        card8.setTag("7");
        card9.setTag("8");
        card10.setTag("9");
        card11.setTag("10");
        card12.setTag("11");

        frontOfCardsResources();

        //Shuffling the images
        Collections.shuffle(Arrays.asList(imagesArray));

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card1, theCard);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card2, theCard);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card3, theCard);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card4, theCard);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card5, theCard);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card6, theCard);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card7, theCard);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card8, theCard);
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card9, theCard);
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card10, theCard);
            }
        });

        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card11, theCard);
            }
        });

        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(card12, theCard);
            }
        });

        //For full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void doStuff(ImageView img, int card){

        //setting the correct image to the imageview
        if(imagesArray[card] == 101){
            img.setImageResource(image01);
        } else if(imagesArray[card] == 102){
            img.setImageResource(image02);
        } else if(imagesArray[card] == 103){
            img.setImageResource(image03);
        } else if(imagesArray[card] == 104){
            img.setImageResource(image04);
        } else if(imagesArray[card] == 105){
            img.setImageResource(image05);
        } else if(imagesArray[card] == 106){
            img.setImageResource(image06);
        } else if(imagesArray[card] == 201){
            img.setImageResource(image01);
        } else if(imagesArray[card] == 202){
            img.setImageResource(image02);
        } else if(imagesArray[card] == 203){
            img.setImageResource(image03);
        } else if(imagesArray[card] == 204){
            img.setImageResource(image04);
        } else if(imagesArray[card] == 205){
            img.setImageResource(image05);
        } else if(imagesArray[card] == 206){
            img.setImageResource(image06);
        }

        //check which image is selected and it to temporary variable
        if(cardNumber == 1) {
            firstCard = imagesArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickFirst = card;

            img.setEnabled(false);
        } else if ((cardNumber == 2)) {
            secondCard = imagesArray[card];
            if (secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickSecond = card;

            card1.setEnabled(false);
            card2.setEnabled(false);
            card3.setEnabled(false);
            card4.setEnabled(false);
            card5.setEnabled(false);
            card6.setEnabled(false);
            card7.setEnabled(false);
            card8.setEnabled(false);
            card9.setEnabled(false);
            card10.setEnabled(false);
            card11.setEnabled(false);
            card12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            }, 1000);
        }
    }
    private void calculate(){

        if (firstCard == secondCard){
            if (clickFirst == 0){
                card1.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 1){
                card2.setVisibility(View.INVISIBLE);
            } else if (clickFirst == 2){
                card3.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 3){
                card4.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 4){
                card5.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 5){
                card6.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 6){
                card7.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 7){
                card8.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 8){
                card9.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 9){
                card10.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 10){
                card11.setVisibility(View.INVISIBLE);
            }else if (clickFirst == 11){
                card12.setVisibility(View.INVISIBLE);
            }

            if (clickSecond == 0){
                card1.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 1){
                card2.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 2){
                card3.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 3){
                card4.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 4){
                card5.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 5){
                card6.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 6){
                card7.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 7){
                card8.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 8){
                card9.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 9){
                card10.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 10){
                card11.setVisibility(View.INVISIBLE);
            }else if (clickSecond == 11){
                card12.setVisibility(View.INVISIBLE);
            }

            //Add points if correct
            playerPoints += 5;
            score.setText(" " + playerPoints);

            } else {
            int[] cardIds = {
                    R.id.card1, R.id.card2, R.id.card3, R.id.card4, R.id.card5, R.id.card6,
                    R.id.card7, R.id.card8, R.id.card9, R.id.card10, R.id.card11, R.id.card12
            };

            for (int id : cardIds) {
                ImageView card = findViewById(id);
                card.setImageResource(R.drawable.bk2);
            }
        }
        if (card1.getVisibility() == View.INVISIBLE &&
                card2.getVisibility() == View.INVISIBLE &&
                card3.getVisibility() == View.INVISIBLE &&
                card4.getVisibility() == View.INVISIBLE &&
                card5.getVisibility() == View.INVISIBLE &&
                card6.getVisibility() == View.INVISIBLE &&
                card7.getVisibility() == View.INVISIBLE &&
                card8.getVisibility() == View.INVISIBLE &&
                card9.getVisibility() == View.INVISIBLE &&
                card10.getVisibility() == View.INVISIBLE &&
                card11.getVisibility() == View.INVISIBLE &&
                card12.getVisibility() == View.INVISIBLE) {
            countDownTimer.cancel(); // Stop the timer
            }

        enableAllCards();
        checkEnd();
        }

    private void enableAllCards() {
        Stream.of(card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12)
                .forEach(card -> card.setEnabled(true));
    }

    private void checkEnd(){
        if(card1.getVisibility() == View.INVISIBLE &&
                card2.getVisibility() == View.INVISIBLE &&
                card3.getVisibility() == View.INVISIBLE &&
                card4.getVisibility() == View.INVISIBLE &&
                card5.getVisibility() == View.INVISIBLE &&
                card6.getVisibility() == View.INVISIBLE &&
                card7.getVisibility() == View.INVISIBLE &&
                card8.getVisibility() == View.INVISIBLE &&
                card9.getVisibility() == View.INVISIBLE &&
                card10.getVisibility() == View.INVISIBLE &&
                card11.getVisibility() == View.INVISIBLE &&
                card12.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(LevelOne.this);
            alertDialogBuilder
                    .setMessage("Congratulations! Your score is " + playerPoints + ". Next Level is Medium!")
                    .setCancelable(false)
                    .setPositiveButton("Next Level", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(LevelOne.this, LevelTwo.class);
                            intent.putExtra("score", playerPoints); // Pass the score to the next activity
                            startActivity(intent);
                            dialogInterface.dismiss();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(LevelOne.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources(){
        image01 = R.drawable.image1;
        image02 = R.drawable.image2;
        image03 = R.drawable.image3;
        image04 = R.drawable.image4;
        image05 = R.drawable.image5;
        image06 = R.drawable.image6;
        image07 = R.drawable.image1_1;
        image08 = R.drawable.image2_1;
        image09 = R.drawable.image3_1;
        image010 = R.drawable.image4_1;
        image011 = R.drawable.image5_1;
        image012 = R.drawable.image6_1;
    }

    //Timer
    private void navigateToNextActivity() {
        Intent intent = new Intent(LevelOne.this, LevelTwo.class);
        startActivity(intent);
        finish(); // Optional: Close this activity if not needed anymore
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (countDownTimer != null) {
            //this will ensure the timer will stop if the given time is over.
            countDownTimer.cancel();
        }
    }
}