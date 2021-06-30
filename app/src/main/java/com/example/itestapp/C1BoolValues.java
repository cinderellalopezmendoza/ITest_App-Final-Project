package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1BoolValues extends AppCompatActivity {

    TextView content,content1,output,explain;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_bool_values);

        content = findViewById(R.id.bool_content);
        content1 = findViewById(R.id.boolean_values_content);
        output = findViewById(R.id.output_bool_values);
        explain = findViewById(R.id.boolvalues_explain);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.bool_content)));
        content1.setText(Html.fromHtml(getString(R.string.boolean_values_content)));
        output.setText(Html.fromHtml(getString(R.string.output_bool_values)));
        explain.setText(Html.fromHtml(getString(R.string.boolvalues_explain)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1BoolValues.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1BoolValues.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
