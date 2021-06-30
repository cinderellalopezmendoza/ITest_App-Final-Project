package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1OpAssignment extends AppCompatActivity {

    TextView content,output,content1,output1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_op_assignment);

        content = findViewById(R.id.assign_content);
        output = findViewById(R.id.output_assign);
        content1 = findViewById(R.id.assign1_content);
        output1 = findViewById(R.id.output1_assign);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.assign_content)));
        output.setText(Html.fromHtml(getString(R.string.output_assign)));
        content1.setText(Html.fromHtml(getString(R.string.assign1_content)));
        output1.setText(Html.fromHtml(getString(R.string.output1_assign)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1OpAssignment.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1OpAssignment.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}