package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3Constructors extends AppCompatActivity {

    TextView content,example,output,note,example1,output1,example2,output2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_constructors);

        content = findViewById(R.id.constructors_content);
        example = findViewById(R.id.constructors_example);
        output = findViewById(R.id.output_constructors);
        note = findViewById(R.id.note_constructors);
        example1 = findViewById(R.id.constructors_example1);
        output1 = findViewById(R.id.output1_constructors);
        example2 = findViewById(R.id.constructors_example2);
        output2 = findViewById(R.id.output2_constructors);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.constructors_content)));
        example.setText(Html.fromHtml(getString(R.string.constructors_example)));
        output.setText(Html.fromHtml(getString(R.string.output_constructors)));
        note.setText(Html.fromHtml(getString(R.string.note_constructors)));
        example1.setText(Html.fromHtml(getString(R.string.constructors_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output1_constructors)));
        example2.setText(Html.fromHtml(getString(R.string.constructors_example2)));
        output2.setText(Html.fromHtml(getString(R.string.output2_constructors)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3Constructors.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3Constructors.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}