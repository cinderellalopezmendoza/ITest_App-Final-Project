package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1OutputPrintText extends AppCompatActivity {

    TextView content,output,note,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_output_print_text);

        content = findViewById(R.id.print_text_content);
        output = findViewById(R.id.output_print_text);
        note = findViewById(R.id.note_content);
        output1 = findViewById(R.id.output_print_text1);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.print_text_content)));
        output.setText(Html.fromHtml(getString(R.string.output_print_text)));
        note.setText(Html.fromHtml(getString(R.string.note_content)));
        output1.setText(Html.fromHtml(getString(R.string.output_print_text1)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(C1OutputPrintText.this, ListofFirstCard.class);
            startActivity(intent);
            finish();
        }
    });
}

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1OutputPrintText.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
