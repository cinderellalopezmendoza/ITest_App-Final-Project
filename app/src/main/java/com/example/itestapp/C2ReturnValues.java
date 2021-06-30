package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C2ReturnValues extends AppCompatActivity {

    TextView content_ex,output,example,output1,example2,output2;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_return_values);

        content_ex = findViewById(R.id.return_value_ex_content);
        output = findViewById(R.id.output_returnval);
        example = findViewById(R.id.returnVal_example);
        output1 = findViewById(R.id.output_returnVal);
        example2 = findViewById(R.id.returnVal_example1);
        output2 = findViewById(R.id.output1_returnVal);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content_ex.setText(Html.fromHtml(getString(R.string.return_value_ex_content)));
        output.setText(Html.fromHtml(getString(R.string.output_returnval)));
        example.setText(Html.fromHtml(getString(R.string.returnVal_example)));
        output1.setText(Html.fromHtml(getString(R.string.output_returnVal)));
        example2.setText(Html.fromHtml(getString(R.string.returnVal_example1)));
        output2.setText(Html.fromHtml(getString(R.string.output1_returnVal)));


        //arrow left back to List of SecondCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C2ReturnValues.this, ListofSecondCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C2ReturnValues.this,ListofSecondCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
