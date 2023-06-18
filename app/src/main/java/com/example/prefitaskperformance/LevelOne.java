package com.example.prefitaskperformance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class LevelOne extends AppCompatActivity {

    ImageView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12;
    TextView score;

    //Array for images to flip
    Integer[] imagesArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};

    int image01, image02, image03, image04, image05, image06,
            image07,image08, image09, image010, image011, image012;
    int firstCard, secondCard, clickFirst, clickSecond;

    int cardNumber = 1;
    int turn = 1;
    int playerPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        score = (TextView) findViewById(R.id.score);

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

    private void doStuff(ImageView iv, int card){

        //setting the correct image to the imageview
        if(imagesArray[card] == 101){
            iv.setImageResource(image01);
        } else if(imagesArray[card] == 102){
            iv.setImageResource(image02);
        } else if(imagesArray[card] == 103){
            iv.setImageResource(image03);
        } else if(imagesArray[card] == 104){
            iv.setImageResource(image04);
        } else if(imagesArray[card] == 105){
            iv.setImageResource(image05);
        } else if(imagesArray[card] == 106){
            iv.setImageResource(image06);
        } else if(imagesArray[card] == 107){
            iv.setImageResource(image01);
        } else if(imagesArray[card] == 108){
            iv.setImageResource(image02);
        } else if(imagesArray[card] == 109){
            iv.setImageResource(image03);
        } else if(imagesArray[card] == 110){
            iv.setImageResource(image04);
        } else if(imagesArray[card] == 111){
            iv.setImageResource(image05);
        } else if(imagesArray[card] == 112){
            iv.setImageResource(image06);
        }

        //check which image is selected and it to temporary variable
        if(cardNumber == 1) {
            firstCard = imagesArray[card];
            if (firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickFirst = card;

            iv.setEnabled(false);
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
            playerPoints++;
            score.setText(playerPoints);

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

        enableAllCards();
        checkEnd();
        }

    private void enableAllCards(){
        card1.setEnabled(true);
        card2.setEnabled(true);
        card3.setEnabled(true);
        card4.setEnabled(true);
        card5.setEnabled(true);
        card6.setEnabled(true);
        card7.setEnabled(true);
        card8.setEnabled(true);
        card9.setEnabled(true);
        card10.setEnabled(true);
        card11.setEnabled(true);
        card12.setEnabled(true);
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
                    .setMessage("Congratulations your score is " + playerPoints)
                    .setCancelable(false)
                    .setPositiveButton("Next Level", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), LevelTwo.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
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
}
