package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2DefaultParameters extends AppCompatActivity {

    TextView content_ex,output,saying;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_default_parameters);

        content_ex = findViewById(R.id.default_parameter_content);
        output = findViewById(R.id.output_default_parameter);
        saying = findViewById(R.id.saying_default_parameter);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content_ex.setText(Html.fromHtml(getString(R.string.default_parameter_content)));
        output.setText(Html.fromHtml(getString(R.string.output_default_parameter)));
        saying.setText(Html.fromHtml(getString(R.string.saying_default_parameter)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2DefaultParameters.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2DefaultParameters.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

