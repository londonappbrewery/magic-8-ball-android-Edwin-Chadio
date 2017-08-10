package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballImageView = (ImageView) findViewById(R.id.imageView);
        Button randomButton = (Button) findViewById(R.id.random_button);
        final Random random = new Random();
        final int[] imageArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

      randomButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int number = random.nextInt(4);
              ballImageView.setImageResource(imageArray[number]);
          }
      });
        };
    }
