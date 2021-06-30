package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2PassByReference extends AppCompatActivity {


    TextView content,example,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_pass_by_reference);

        content = findViewById(R.id.pass_by_reference_content);
        example = findViewById(R.id.pass_by_example);
        output = findViewById(R.id.output_pass_by);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.pass_by_reference_content)));
        example.setText(Html.fromHtml(getString(R.string.pass_by_example)));
        output.setText(Html.fromHtml(getString(R.string.output_pass_by)));



        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2PassByReference.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2PassByReference.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
