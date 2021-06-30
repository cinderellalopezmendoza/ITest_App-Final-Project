package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3Polymorphism extends AppCompatActivity {

    TextView content,example,remember,example1,output1,why_when;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_polymorphism);


        content = findViewById(R.id.polymorphism_content);
        example = findViewById(R.id.polymorphism_example);
        remember = findViewById(R.id.remember_polymorphism);
        example1 = findViewById(R.id.polymorphism_example1);
        output1 = findViewById(R.id.polymorphism_output1);
        why_when = findViewById(R.id.why_use_polymorphism);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.polymorphism_content)));
        example.setText(Html.fromHtml(getString(R.string.polymorphism_example)));
        remember.setText(Html.fromHtml(getString(R.string.remember_polymorphism)));
        example1.setText(Html.fromHtml(getString(R.string.polymorphism_example1)));
        output1.setText(Html.fromHtml(getString(R.string.polymorphism_output1)));
        why_when.setText(Html.fromHtml(getString(R.string.why_use_polymorphism)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3Polymorphism.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3Polymorphism.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

