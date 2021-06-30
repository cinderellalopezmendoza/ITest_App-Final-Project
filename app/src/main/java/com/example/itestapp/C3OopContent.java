package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3OopContent extends AppCompatActivity {

    TextView content,content1,explain;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_oop_content);

        content = findViewById(R.id.oop_content);
        content1 = findViewById(R.id.class_object_);
        explain = findViewById(R.id.explain_classobject);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.oop_content)));
        content1.setText(Html.fromHtml(getString(R.string.class_object_)));
        explain.setText(Html.fromHtml(getString(R.string.explain_classobject)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3OopContent.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3OopContent.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
