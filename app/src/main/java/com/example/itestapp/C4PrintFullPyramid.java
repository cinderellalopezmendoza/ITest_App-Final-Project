package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C4PrintFullPyramid extends AppCompatActivity {

    TextView program;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4_print_full_pyramid);

        program = findViewById(R.id.program_pyramid);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        program.setText(Html.fromHtml(getString(R.string.program_pyramid)));


        //arrow left back to List of Fourth Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C4PrintFullPyramid.this, ListofFourthCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C4PrintFullPyramid.this,ListofFourthCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
