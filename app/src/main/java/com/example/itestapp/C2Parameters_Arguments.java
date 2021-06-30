package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2Parameters_Arguments extends AppCompatActivity {

    TextView content,example,output,saying;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_parameters__arguments);

        content = findViewById(R.id.parameter_arguments_content);
        example = findViewById(R.id.parameter_arguments_example);
        output = findViewById(R.id.output_parameter_arguments);
        saying = findViewById(R.id.saying_parameter);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.parameter_arguments_content)));
        example.setText(Html.fromHtml(getString(R.string.parameter_arguments_example)));
        output.setText(Html.fromHtml(getString(R.string.output_parameter_arguments)));
        saying.setText(Html.fromHtml(getString(R.string.saying_parameter)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2Parameters_Arguments.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2Parameters_Arguments.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


