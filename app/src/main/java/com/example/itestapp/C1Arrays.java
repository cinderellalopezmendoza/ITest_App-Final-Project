package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1Arrays extends AppCompatActivity {

     TextView content,example,output,note,content_ex,output1;
     ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_arrays);

        content = findViewById(R.id.array_content);
        example = findViewById(R.id.example_array);
        output = findViewById(R.id.output_access_array);
        note = findViewById(R.id.note_array);
        content_ex = findViewById(R.id.change_array_example);
        output1 = findViewById(R.id.output_change_array);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.array_content)));
        example.setText(Html.fromHtml(getString(R.string.example_array)));
        output.setText(Html.fromHtml(getString(R.string.output_access_array)));
        note.setText(Html.fromHtml(getString(R.string.note_array)));
        content_ex.setText(Html.fromHtml(getString(R.string.change_array_example)));
        output1.setText(Html.fromHtml(getString(R.string.output_change_array)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1Arrays.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1Arrays.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}