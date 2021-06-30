package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1OpArithmetic extends AppCompatActivity {

    TextView content,output,content1,output1,content2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_op_arithmetic);

        content = findViewById(R.id.operators_content);
        output = findViewById(R.id.output_operators);
        content1 = findViewById(R.id.operators1_content);
        output1 = findViewById(R.id.output1_operators);
        content2 = findViewById(R.id.four_topic);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.operators_content)));
        output.setText(Html.fromHtml(getString(R.string.output_operators)));
        content1.setText(Html.fromHtml(getString(R.string.operators1_content)));
        output1.setText(Html.fromHtml(getString(R.string.output1_operators)));
        content2.setText(Html.fromHtml(getString(R.string.four_topic)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1OpArithmetic.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1OpArithmetic.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
