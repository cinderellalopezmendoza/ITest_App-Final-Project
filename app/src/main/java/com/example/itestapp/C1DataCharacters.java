package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1DataCharacters extends AppCompatActivity {

    TextView character,output,character1,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_data_characters);

        character = findViewById(R.id.character);
        output= findViewById(R.id.char_output);
        character1 = findViewById(R.id.character1);
        output1 = findViewById(R.id.char1_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        character.setText(Html.fromHtml(getString(R.string.character)));
        output.setText(Html.fromHtml(getString(R.string.char_output)));
        character1.setText(Html.fromHtml(getString(R.string.character1)));
        output1.setText(Html.fromHtml(getString(R.string.char1_output)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1DataCharacters.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }


    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1DataCharacters.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
