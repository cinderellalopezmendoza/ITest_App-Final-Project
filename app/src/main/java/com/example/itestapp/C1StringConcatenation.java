package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1StringConcatenation extends AppCompatActivity {

    TextView content,output,content1,output1,content2,output2,say;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_string_concatenation);

        content = findViewById(R.id.concatenation_content);
        output = findViewById(R.id.output_concatenation);
        content1 = findViewById(R.id.concatenation1);
        output1 = findViewById(R.id.output1_concatenation);
        content2 = findViewById(R.id.append);
        output2 = findViewById(R.id.output_append);
        say = findViewById(R.id.plus_append);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.concatenation_content)));
        output.setText(Html.fromHtml(getString(R.string.output_concatenation)));
        content1.setText(Html.fromHtml(getString(R.string.concatenation1)));
        output1.setText(Html.fromHtml(getString(R.string.output1_concatenation)));
        content2.setText(Html.fromHtml(getString(R.string.append)));
        output2.setText(Html.fromHtml(getString(R.string.output_append)));
        say.setText(Html.fromHtml(getString(R.string.plus_append)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1StringConcatenation.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1StringConcatenation.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
