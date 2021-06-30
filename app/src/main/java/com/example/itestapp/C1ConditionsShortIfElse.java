package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1ConditionsShortIfElse extends AppCompatActivity {

    TextView content,example,output,example1,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_conditions_short_if_else);

        content = findViewById(R.id.short_if_content);
        example = findViewById(R.id.short_if_example);
        output = findViewById(R.id.output_short_if_example);
        example1 = findViewById(R.id.short_if_example1);
        output1 = findViewById(R.id.output_short_if_example1);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.short_if_content)));
        example.setText(Html.fromHtml(getString(R.string.short_if_example)));
        output.setText(Html.fromHtml(getString(R.string.output_short_if_example)));
        example1.setText(Html.fromHtml(getString(R.string.short_if_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output_short_if_example1)));



        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1ConditionsShortIfElse.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1ConditionsShortIfElse.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


