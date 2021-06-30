package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C4IntegerOddorEven extends AppCompatActivity {

    TextView program;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4_integer_oddor_even);


        program = findViewById(R.id.program_odd_even);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        program.setText(Html.fromHtml(getString(R.string.program_odd_even)));


        //arrow left back to List of Fourth Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C4IntegerOddorEven.this, ListofFourthCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C4IntegerOddorEven.this,ListofFourthCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
