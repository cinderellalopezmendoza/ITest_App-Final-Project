package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1WhileLoop extends AppCompatActivity {

    TextView content,example,output,note;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_while_loop);

        content = findViewById(R.id.while_loop_content);
        example = findViewById(R.id.while_example);
        output = findViewById(R.id.output_while_example);
        note = findViewById(R.id.note_while);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.while_loop_content)));
        example.setText(Html.fromHtml(getString(R.string.while_example)));
        output.setText(Html.fromHtml(getString(R.string.output_while_example)));
        note.setText(Html.fromHtml(getString(R.string.note_while)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1WhileLoop.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1WhileLoop.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
