package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2Functions extends AppCompatActivity {

    TextView content,example,output,example1,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_functions);

        content = findViewById(R.id.function_content);
        example = findViewById(R.id.funtion_example);
        output = findViewById(R.id.output_function);
        example1 = findViewById(R.id.funtion_example1);
        output1 = findViewById(R.id.output1_function);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.function_content)));
        example.setText(Html.fromHtml(getString(R.string.funtion_example)));
        output.setText(Html.fromHtml(getString(R.string.output_function)));
        example1.setText(Html.fromHtml(getString(R.string.funtion_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output1_function)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2Functions.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2Functions.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

