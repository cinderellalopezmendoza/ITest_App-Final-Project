package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1SyntaxContent extends AppCompatActivity {

    TextView content,output,explain;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_syntax_content);

        content = findViewById(R.id.syntax_content);
        output = findViewById(R.id.output_hello);
        explain = findViewById(R.id.syntax_content1);
        back = findViewById(R.id.back_arrow);

        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.syntax_content)));
        output.setText(Html.fromHtml(getString(R.string.output_hello)));
        explain.setText(Html.fromHtml(getString(R.string.syntax_content1)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1SyntaxContent.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1SyntaxContent.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
