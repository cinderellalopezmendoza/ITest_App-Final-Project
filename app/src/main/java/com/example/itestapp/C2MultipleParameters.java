package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2MultipleParameters extends AppCompatActivity {

    TextView content_ex,output,note;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_multiple_parameters);

        content_ex = findViewById(R.id.multiple_parameters_content);
        output = findViewById(R.id.output_multi_parameter);
        note = findViewById(R.id.note_multi_parameter);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content_ex.setText(Html.fromHtml(getString(R.string.multiple_parameters_content)));
        output.setText(Html.fromHtml(getString(R.string.output_multi_parameter)));
        note.setText(Html.fromHtml(getString(R.string.note_multi_parameter)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2MultipleParameters.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2MultipleParameters.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
