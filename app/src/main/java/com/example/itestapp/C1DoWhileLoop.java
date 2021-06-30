package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1DoWhileLoop extends AppCompatActivity {

    TextView content,example,output,note;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_do_while_loop);

        content = findViewById(R.id.do_while_loop_content);
        example = findViewById(R.id.do_while_example);
        output = findViewById(R.id.output_do_while_example);
        note = findViewById(R.id.note_do_while);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.do_while_loop_content)));
        example.setText(Html.fromHtml(getString(R.string.do_while_example)));
        output.setText(Html.fromHtml(getString(R.string.output_do_while_example)));
        note.setText(Html.fromHtml(getString(R.string.note_do_while)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1DoWhileLoop.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1DoWhileLoop.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


