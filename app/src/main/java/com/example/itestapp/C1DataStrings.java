package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1DataStrings extends AppCompatActivity {

    TextView string,string1,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_data_strings);

        string = findViewById(R.id.string_content);
        string1 = findViewById(R.id.string_ex);
        output= findViewById(R.id.string_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        string.setText(Html.fromHtml(getString(R.string.string_content)));
        string1.setText(Html.fromHtml(getString(R.string.string_ex)));
        output.setText(Html.fromHtml(getString(R.string.string_output)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1DataStrings.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1DataStrings.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}