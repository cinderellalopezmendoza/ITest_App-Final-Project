package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1ForLoop extends AppCompatActivity {

     TextView content,example,output,explain,example1,output1;
     ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_for_loop);

        content = findViewById(R.id.for_loop_content);
        example = findViewById(R.id.for_loop_example);
        output = findViewById(R.id.output_forloop_example);
        explain = findViewById(R.id.explain_for_loop);
        example1 = findViewById(R.id.for_loop_example1);
        output1 = findViewById(R.id.output_forloop_example1);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.for_loop_content)));
        example.setText(Html.fromHtml(getString(R.string.for_loop_example)));
        output.setText(Html.fromHtml(getString(R.string.output_forloop_example)));
        explain.setText(Html.fromHtml(getString(R.string.explain_for_loop)));
        example1.setText(Html.fromHtml(getString(R.string.for_loop_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output_forloop_example1)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1ForLoop.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1ForLoop.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

