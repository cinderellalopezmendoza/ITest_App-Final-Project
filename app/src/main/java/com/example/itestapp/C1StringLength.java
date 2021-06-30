package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1StringLength extends AppCompatActivity {

    TextView content,output,tip_ex,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_string_length);

        content = findViewById(R.id.length_content);
        output = findViewById(R.id.output_length);
        tip_ex = findViewById(R.id.length_tip);
        output1 = findViewById(R.id.output1_length);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.length_content)));
        output.setText(Html.fromHtml(getString(R.string.output_length)));
        tip_ex.setText(Html.fromHtml(getString(R.string.length_tip)));
        output1.setText(Html.fromHtml(getString(R.string.output1_length)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1StringLength.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1StringLength.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
