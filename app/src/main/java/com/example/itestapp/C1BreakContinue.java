package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1BreakContinue extends AppCompatActivity {

    TextView content,output,content1,output1,example,output2,example1,output3;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_break_continue);

        content = findViewById(R.id.break_content_example);
        output = findViewById(R.id.output_break_example);
        content1 = findViewById(R.id.continue_content_example);
        output1 = findViewById(R.id.output_continue_example);
        example = findViewById(R.id.break_example);
        output2 = findViewById(R.id.output_break_example1);
        example1 = findViewById(R.id.continue_example);
        output3 = findViewById(R.id.output_continue_example1);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.break_content_example)));
        output.setText(Html.fromHtml(getString(R.string.output_break_example)));
        content1.setText(Html.fromHtml(getString(R.string.continue_content_example)));
        output1.setText(Html.fromHtml(getString(R.string.output_continue_example)));
        example.setText(Html.fromHtml(getString(R.string.break_example)));
        output2.setText(Html.fromHtml(getString(R.string.output_break_example1)));
        example1.setText(Html.fromHtml(getString(R.string.continue_example)));
        output3.setText(Html.fromHtml(getString(R.string.output_continue_example1)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1BreakContinue.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1BreakContinue.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
