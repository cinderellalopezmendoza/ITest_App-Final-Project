package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1MemoryAddress extends AppCompatActivity {

    TextView content,example,output,note,saying;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_memory_address);

        content = findViewById(R.id.memory_address_content);
        example = findViewById(R.id.example_memory_address);
        output = findViewById(R.id.output_memory_address);
        note = findViewById(R.id.note_memory);
        saying = findViewById(R.id.saying);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.memory_address_content)));
        example.setText(Html.fromHtml(getString(R.string.example_memory_address)));
        output.setText(Html.fromHtml(getString(R.string.output_memory_address)));
        note.setText(Html.fromHtml(getString(R.string.note_memory)));
        saying.setText(Html.fromHtml(getString(R.string.saying)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1MemoryAddress.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1MemoryAddress.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}