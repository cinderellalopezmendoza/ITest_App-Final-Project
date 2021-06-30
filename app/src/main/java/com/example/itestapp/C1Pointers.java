package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1Pointers extends AppCompatActivity {

    TextView content,example,output,content1,example1,output1,explain,tip,ways;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_pointers);

        content = findViewById(R.id.pointers_content);
        example = findViewById(R.id.example_pointers);
        output = findViewById(R.id.output_pointers);
        content1 = findViewById(R.id.pointers_content1);
        example1 = findViewById(R.id.example1_pointers);
        output1 = findViewById(R.id.output1_pointers);
        explain = findViewById(R.id.example_explain);
        tip = findViewById(R.id.tip_pointer);
        ways = findViewById(R.id.ways_declare_pointer);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.pointers_content)));
        example.setText(Html.fromHtml(getString(R.string.example_pointers)));
        output.setText(Html.fromHtml(getString(R.string.output_pointers)));
        content1.setText(Html.fromHtml(getString(R.string.pointers_content1)));
        example1.setText(Html.fromHtml(getString(R.string.example1_pointers)));
        output1.setText(Html.fromHtml(getString(R.string.output1_pointers)));
        explain.setText(Html.fromHtml(getString(R.string.example_explain)));
        tip.setText(Html.fromHtml(getString(R.string.tip_pointer)));
        ways.setText(Html.fromHtml(getString(R.string.ways_declare_pointer)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1Pointers.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1Pointers.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}