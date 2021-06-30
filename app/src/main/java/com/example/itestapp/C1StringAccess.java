package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1StringAccess extends AppCompatActivity {

    TextView content,output,note,content1,output1,change,output2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_string_access);

        content = findViewById(R.id.access_content);
        output = findViewById(R.id.output_access);
        note = findViewById(R.id.note);
        content1 = findViewById(R.id.access1_content);
        output1 = findViewById(R.id.output1_access);
        change = findViewById(R.id.change_string);
        output2 = findViewById(R.id.change1_string);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.access_content)));
        output.setText(Html.fromHtml(getString(R.string.output_access)));
        note.setText(Html.fromHtml(getString(R.string.note)));
        content1.setText(Html.fromHtml(getString(R.string.access1_content)));
        output1.setText(Html.fromHtml(getString(R.string.output1_access)));
        change.setText(Html.fromHtml(getString(R.string.change_string)));
        output2.setText(Html.fromHtml(getString(R.string.change1_string)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1StringAccess.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1StringAccess.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
