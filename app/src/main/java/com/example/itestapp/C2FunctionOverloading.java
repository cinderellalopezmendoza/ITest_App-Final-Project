package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2FunctionOverloading extends AppCompatActivity {

    TextView content,example,output,saying,example1,output1,note;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_function_overloading);

        content = findViewById(R.id.overloading_content);
        example = findViewById(R.id.overloading_example);
        output = findViewById(R.id.output_overload);
        saying = findViewById(R.id.say_overloading);
        example1 = findViewById(R.id.overloading_example1);
        output1 = findViewById(R.id.output1_overload);
        note = findViewById(R.id.note_overloading);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.overloading_content)));
        example.setText(Html.fromHtml(getString(R.string.overloading_example)));
        output.setText(Html.fromHtml(getString(R.string.output_overload)));
        saying.setText(Html.fromHtml(getString(R.string.say_overloading)));
        example1.setText(Html.fromHtml(getString(R.string.overloading_example1)));
        output1.setText(Html.fromHtml(getString(R.string.output1_overload)));
        note.setText(Html.fromHtml(getString(R.string.note_overloading)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2FunctionOverloading.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2FunctionOverloading.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


