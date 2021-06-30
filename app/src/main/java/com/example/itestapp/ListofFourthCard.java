package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListofFourthCard extends AppCompatActivity {

    TextView hello_world,pyramid,square,reverse,sum,convert,ood_even,leap_year,increment,table;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_fourth_card);

        //TextView ID
        hello_world = findViewById(R.id.print_hello_world);
        pyramid = findViewById(R.id.print_full_pyramid);
        square = findViewById(R.id.print_square_pattern);
        reverse = findViewById(R.id.reverse_given_num );
        sum = findViewById(R.id.sum_of_digit);
        convert = findViewById(R.id.convert_meter);
        ood_even = findViewById(R.id.odd_even);
        leap_year = findViewById(R.id.leap_year);
        increment = findViewById(R.id.program_increment);
        table = findViewById(R.id.print_multiplication_table);

        //Image ID
        back = findViewById(R.id.back_arrow);


        //onclick for hello world
        hello_world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4PrintHelloWorld.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for pyramid
        pyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4PrintFullPyramid.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for square
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4PrintSquarePattern.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for reverse number
        reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4ReverseGivenNumber.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for reverse number
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4SumofGivenDigitProgram.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for convert to meter
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4ConvertFeetToMeter.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for convert to odd even
        ood_even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4IntegerOddorEven.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for leap year
        leap_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4LeapYearOrNot.class);
                startActivity(toContent);
                finish();
            }
        });



        //onclick for increment
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4PrintIncrementNumber.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for table multiplication
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFourthCard.this, C4MultiplicationTable.class);
                startActivity(toContent);
                finish();
            }
        });



        //arrow left back to Main Activity
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListofFourthCard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //balik sa terms kapag na back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListofFourthCard.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}