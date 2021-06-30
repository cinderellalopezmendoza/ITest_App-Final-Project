package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1StringNumbers extends AppCompatActivity {

    TextView warning,example,output,example2,output1,error;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_string_numbers);

        warning = findViewById(R.id.warning);
        example = findViewById(R.id.number_string);
        output = findViewById(R.id.output_string);
        example2 = findViewById(R.id.number1_strings);
        output1= findViewById(R.id.output1_string);
        error = findViewById(R.id.error);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        warning.setText(Html.fromHtml(getString(R.string.warning)));
        example.setText(Html.fromHtml(getString(R.string.number_string)));
        output.setText(Html.fromHtml(getString(R.string.output_string)));
        example2.setText(Html.fromHtml(getString(R.string.number1_strings)));
        output1.setText(Html.fromHtml(getString(R.string.output1_string)));
        error.setText(Html.fromHtml(getString(R.string.error)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1StringNumbers.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1StringNumbers.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
