package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1BasicDataTypes extends AppCompatActivity {

    TextView data_type,output;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_basic_data_types);

        data_type = findViewById(R.id.data_types_content);
        output= findViewById(R.id.data_types_output);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        data_type.setText(Html.fromHtml(getString(R.string.data_types_content)));
        output.setText(Html.fromHtml(getString(R.string.data_types_output)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1BasicDataTypes.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1BasicDataTypes.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


