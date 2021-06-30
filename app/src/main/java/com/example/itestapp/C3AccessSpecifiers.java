package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C3AccessSpecifiers extends AppCompatActivity {

    TextView content_ex,output,content,error,note_tip,note_ex;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_access_specifiers);

        content_ex = findViewById(R.id.specifiers_contentEx);
        output = findViewById(R.id.output_specifiers);
        content = findViewById(R.id.access_specifier);
        error = findViewById(R.id.error_example);
        note_tip = findViewById(R.id.note_tip_specifiers);
        note_ex = findViewById(R.id.specifiers_note_ex);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content_ex.setText(Html.fromHtml(getString(R.string.specifiers_contentEx)));
        output.setText(Html.fromHtml(getString(R.string.output_specifiers)));
        content.setText(Html.fromHtml(getString(R.string.access_specifier)));
        error.setText(Html.fromHtml(getString(R.string.error_example)));
        note_tip.setText(Html.fromHtml(getString(R.string.note_tip_specifiers)));
        note_ex.setText(Html.fromHtml(getString(R.string.specifiers_note_ex)));


        //arrow left back to List of Third Card
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C3AccessSpecifiers.this, ListofThirdCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C3AccessSpecifiers.this,ListofThirdCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}