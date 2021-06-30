package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1DataBooleans extends AppCompatActivity {

    TextView booleans,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_data_booleans);

        booleans = findViewById(R.id.booleans_content);
        output= findViewById(R.id.booleans_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        booleans.setText(Html.fromHtml(getString(R.string.booleans_content)));
        output.setText(Html.fromHtml(getString(R.string.booleans_output)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1DataBooleans.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1DataBooleans.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
