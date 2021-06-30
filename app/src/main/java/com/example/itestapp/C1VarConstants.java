package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1VarConstants extends AppCompatActivity {

    TextView content,error,content1,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_var_constants);

        content = findViewById(R.id.content_constants);
        error = findViewById(R.id.constant_error);
        content1 = findViewById(R.id.content1_constants);
        output = findViewById(R.id.output_constants);
        back = findViewById(R.id.back_arrow);

        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.content_constants)));
        error.setText(Html.fromHtml(getString(R.string.constant_error)));
        content1.setText(Html.fromHtml(getString(R.string.content1_constants)));
        output.setText(Html.fromHtml(getString(R.string.output_constants)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1VarConstants.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1VarConstants.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}