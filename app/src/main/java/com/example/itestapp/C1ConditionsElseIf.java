package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1ConditionsElseIf extends AppCompatActivity {

    TextView content,example,output,explain;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_conditions_else_if);

        content = findViewById(R.id.elseif_content);
        example = findViewById(R.id.elseif_example);
        output = findViewById(R.id.output_elseif_example);
        explain = findViewById(R.id.elseif_explained);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.elseif_content)));
        example.setText(Html.fromHtml(getString(R.string.elseif_example)));
        output.setText(Html.fromHtml(getString(R.string.output_elseif_example)));
        explain.setText(Html.fromHtml(getString(R.string.elseif_explained)));



        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1ConditionsElseIf.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1ConditionsElseIf.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

