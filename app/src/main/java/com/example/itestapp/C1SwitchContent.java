package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1SwitchContent extends AppCompatActivity {

     TextView content,example,output,content1,say,example1,output1,note;
     ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_switch_content);

        content = findViewById(R.id.switch_content);
        example = findViewById(R.id.switch_example);
        output = findViewById(R.id.output_switch);
        content1 = findViewById(R.id.switch_break);
        say = findViewById(R.id.switch_say);
        example1 = findViewById(R.id.default_example);
        output1 = findViewById(R.id.default_output);
        note = findViewById(R.id.switch_note);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.switch_content)));
        example.setText(Html.fromHtml(getString(R.string.switch_example)));
        output.setText(Html.fromHtml(getString(R.string.output_switch)));
        content1.setText(Html.fromHtml(getString(R.string.switch_break)));
        say.setText(Html.fromHtml(getString(R.string.switch_say)));
        example1.setText(Html.fromHtml(getString(R.string.default_example)));
        output1.setText(Html.fromHtml(getString(R.string.default_output)));
        note.setText(Html.fromHtml(getString(R.string.switch_note)));



        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1SwitchContent.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1SwitchContent.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}