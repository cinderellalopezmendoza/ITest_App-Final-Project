package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3ClassesObject extends AppCompatActivity {

    TextView content,explain,example,output,example1,output1;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_classes_object);

        content = findViewById(R.id.classes_objects_content);
        explain = findViewById(R.id.classes_objects_explain);
        example = findViewById(R.id.classes_objects_example);
        output = findViewById(R.id.object_output_example);
        example1 = findViewById(R.id.classes_objects_example1);
        output1 = findViewById(R.id.object_output_example1);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.classes_objects_content)));
        explain.setText(Html.fromHtml(getString(R.string.classes_objects_explain)));
        example.setText(Html.fromHtml(getString(R.string.classes_objects_example)));
        output.setText(Html.fromHtml(getString(R.string.object_output_example)));
        example1.setText(Html.fromHtml(getString(R.string.classes_objects_example1)));
        output1.setText(Html.fromHtml(getString(R.string.object_output_example1)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3ClassesObject.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3ClassesObject.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
