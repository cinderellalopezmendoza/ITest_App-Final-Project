package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1OutputNewLines extends AppCompatActivity {

    TextView content,output,tip_ex,output1,note,output2,reminder;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_output_new_lines);

        content = findViewById(R.id.new_line_content);
        output = findViewById(R.id.output_new_line);
        tip_ex = findViewById(R.id.tip_ex__content);
        output1 = findViewById(R.id.output_new_line1);
        note = findViewById(R.id.note_ex__content);
        output2 = findViewById(R.id.output_new_line2);
        reminder = findViewById(R.id.reminder_content);
        back = findViewById(R.id.back_arrow);

        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.new_line_content)));
        output.setText(Html.fromHtml(getString(R.string.output_new_line)));
        tip_ex.setText(Html.fromHtml(getString(R.string.tip_ex__content)));
        output1.setText(Html.fromHtml(getString(R.string.output_new_line1)));
        note.setText(Html.fromHtml(getString(R.string.note_ex__content)));
        output2.setText(Html.fromHtml(getString(R.string.output_new_line2)));
        reminder.setText(Html.fromHtml(getString(R.string.reminder_content)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1OutputNewLines.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1OutputNewLines.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
