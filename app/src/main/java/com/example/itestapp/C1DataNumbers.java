package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1DataNumbers extends AppCompatActivity {

    TextView numeric_int,output,numeric_float,output1,numeric_double,output2,versus,scientific,output3;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_data_numbers);

        numeric_int = findViewById(R.id.numeric_int);
        output= findViewById(R.id.int_output);
        numeric_float = findViewById(R.id.numeric_float);
        output1 = findViewById(R.id.float_output);
        numeric_double = findViewById(R.id.numeric_double);
        output2 = findViewById(R.id.double_output);
        versus = findViewById(R.id.floatvsdouble);
        scientific = findViewById(R.id.scientific_number);
        output3 = findViewById(R.id.scientific_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        numeric_int.setText(Html.fromHtml(getString(R.string.numeric_int)));
        output.setText(Html.fromHtml(getString(R.string.int_output)));
        numeric_float.setText(Html.fromHtml(getString(R.string.numeric_float)));
        output1.setText(Html.fromHtml(getString(R.string.float_output)));
        numeric_double.setText(Html.fromHtml(getString(R.string.numeric_double)));
        output2.setText(Html.fromHtml(getString(R.string.double_output)));
        versus.setText(Html.fromHtml(getString(R.string.floatvsdouble)));
        scientific.setText(Html.fromHtml(getString(R.string.scientific_number)));
        output3.setText(Html.fromHtml(getString(R.string.scientific_output)));



        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1DataNumbers.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1DataNumbers.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
