package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3MultipleInheritance extends AppCompatActivity {

    TextView content,example,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_multiple_inheritance);

        content = findViewById(R.id.multiple_inheritance_content);
        example = findViewById(R.id.multiple_inheritance_example);
        output = findViewById(R.id.multiple_inheritance_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.multiple_inheritance_content)));
        example.setText(Html.fromHtml(getString(R.string.multiple_inheritance_example)));
        output.setText(Html.fromHtml(getString(R.string.multiple_inheritance_output)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3MultipleInheritance.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3MultipleInheritance.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

