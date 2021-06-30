package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1BoolExpressions extends AppCompatActivity {

    TextView content,output,example,output1,example1,output2,example2,output3;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_bool_expressions);

        content = findViewById(R.id.boolean_express_content);
        output = findViewById(R.id.output_bool_express);
        example = findViewById(R.id.boolean_example);
        output1 = findViewById(R.id.output1_bool_express);
        example1 = findViewById(R.id.boolean_example1);
        output2 = findViewById(R.id.output2_bool_express);
        example2 = findViewById(R.id.boolean_example2);
        output3 = findViewById(R.id.output3_bool_express);
        back = findViewById(R.id.back_arrow);

        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.boolean_express_content)));
        output.setText(Html.fromHtml(getString(R.string.output_bool_express)));
        example.setText(Html.fromHtml(getString(R.string.boolean_example)));
        output1.setText(Html.fromHtml(getString(R.string.output1_bool_express)));
        example1.setText(Html.fromHtml(getString(R.string.boolean_example1)));
        output2.setText(Html.fromHtml(getString(R.string.output2_bool_express)));
        example2.setText(Html.fromHtml(getString(R.string.boolean_example2)));
        output3.setText(Html.fromHtml(getString(R.string.output3_bool_express)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1BoolExpressions.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1BoolExpressions.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

