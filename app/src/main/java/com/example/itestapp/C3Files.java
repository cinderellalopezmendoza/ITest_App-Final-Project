package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3Files extends AppCompatActivity {

    TextView content,content_ex,why,example,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_files);


        content = findViewById(R.id.files_content);
        content_ex = findViewById(R.id.create_file_ex);
        why  = findViewById(R.id.close_file);
        example = findViewById(R.id.read_file_example);
        output = findViewById(R.id.output_read_file);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.files_content)));
        content_ex.setText(Html.fromHtml(getString(R.string.create_file_ex)));
        why.setText(Html.fromHtml(getString(R.string.close_file)));
        example.setText(Html.fromHtml(getString(R.string.read_file_example)));
        output.setText(Html.fromHtml(getString(R.string.output_read_file)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3Files.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3Files.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}