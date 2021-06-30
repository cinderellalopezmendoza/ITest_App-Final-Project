package com.example.itestapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    View tutorial,function,classes,howTo,exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorial = findViewById(R.id.tutorial);
        function = findViewById(R.id.function);
        classes = findViewById(R.id.classes);
        howTo = findViewById(R.id.howto);
        exercise = findViewById(R.id.exercise);

        //onclick
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });

        function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });

        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });

        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListofFourthCard.class);
                startActivity(intent);
                finish();
            }
        });

          exercise.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
            startActivity(intent);
            finish();
        }
    });
}

        @Override
        public void onBackPressed() {

            if(backPressedTime + 2000 > System.currentTimeMillis()){
                backToast.cancel();
                super.onBackPressed();
                return;
            }else{
                backToast = Toast.makeText(getBaseContext(),"Press Back Again to Exit",Toast.LENGTH_SHORT);
                backToast.show();
            }

            backPressedTime = System.currentTimeMillis();

        }
    }
