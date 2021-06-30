package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1CommentsContent extends AppCompatActivity {

    TextView content,single_line,C_outputB,single_line1,C_outputE,multi_line,C_outputMulti,say;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_comments_content);

        content = findViewById(R.id.comment_content);
        single_line = findViewById(R.id.single_line_comment);
        C_outputB = findViewById(R.id.output_single_comment);
        single_line1 = findViewById(R.id.single_line_end_comment);
        C_outputE = findViewById(R.id.output_single_line_end);
        multi_line = findViewById(R.id.multi_line_comment);
        C_outputMulti = findViewById(R.id.output_multi_comment);
        say = findViewById(R.id.say);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.comment_content)));
        single_line.setText(Html.fromHtml(getString(R.string.single_line_comment)));
        C_outputB.setText(Html.fromHtml(getString(R.string.output_single_comment)));
        single_line1.setText(Html.fromHtml(getString(R.string.single_line_end_comment)));
        C_outputE.setText(Html.fromHtml(getString(R.string.output_single_line_end)));
        multi_line.setText(Html.fromHtml(getString(R.string.multi_line_comment)));
        C_outputMulti.setText(Html.fromHtml(getString(R.string.output_multi_comment)));
        say.setText(Html.fromHtml(getString(R.string.say)));



        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1CommentsContent.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1CommentsContent.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

