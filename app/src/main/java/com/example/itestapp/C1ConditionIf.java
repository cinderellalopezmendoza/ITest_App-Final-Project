package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1ConditionIf extends AppCompatActivity {

     TextView content,note,example,output,example1,output1,explain;
     ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_condition_if);

        content = findViewById(R.id.condition_content);
        note = findViewById(R.id.note_condition);
        example = findViewById(R.id.if_example);
        output = findViewById(R.id.output_if_example);
        example1 = findViewById(R.id.if_example1);
        output1 = findViewById(R.id.output_if_example1);
        explain = findViewById(R.id.if_explained);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.condition_content)));
        note.setText(Html.fromHtml(getString(R.string.note_condition)));
        example.setText(Html.fromHtml(getString(R.string.if_example)));
        output.setText(Html.fromHtml(getString(R.string.output_if_example)));
        example1.setText(Html.fromHtml(getString(R.string.if_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output_if_example1)));
        explain.setText(Html.fromHtml(getString(R.string.if_explained)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1ConditionIf.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1ConditionIf.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


