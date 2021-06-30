package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3ClassMethods extends AppCompatActivity {

    TextView content,example,output,example1,output1,example2,output2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_class_methods);


        content = findViewById(R.id.class_methods_content);
        example = findViewById(R.id.class_methods_example);
        output = findViewById(R.id.output_class_methods);
        example1 = findViewById(R.id.class_methods_example1);
        output1 = findViewById(R.id.output1_class_methods);
        example2 = findViewById(R.id.class_methods_example2);
        output2 = findViewById(R.id.output2_class_methods);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.class_methods_content)));
        example.setText(Html.fromHtml(getString(R.string.class_methods_example)));
        output.setText(Html.fromHtml(getString(R.string.output_class_methods)));
        example1.setText(Html.fromHtml(getString(R.string.class_methods_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output1_class_methods)));
        example2.setText(Html.fromHtml(getString(R.string.class_methods_example2)));
        output2.setText(Html.fromHtml(getString(R.string.output2_class_methods)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3ClassMethods.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3ClassMethods.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
