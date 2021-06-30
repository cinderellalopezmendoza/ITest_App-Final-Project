package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListofSecondCard extends AppCompatActivity {

    TextView functions,arguments,default_parameter,multi_parameters,return_values,pass_by,overloading;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_second_card);


        //TextView ID
        functions = findViewById(R.id.functions);
        arguments = findViewById(R.id.parameter_arguments);
        default_parameter = findViewById(R.id.default_parameter);
        multi_parameters = findViewById(R.id.multiple_parameters);
        return_values = findViewById(R.id.return_values);
        pass_by = findViewById(R.id.pass_by_reference);
        overloading = findViewById(R.id.overloading);


        //Image ID
        back = findViewById(R.id.back_arrow);


        //onclick for functions
        functions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofSecondCard.this, C2Functions.class);
                startActivity(toContent);
                finish();
            }
        });



        //onclick for the subtopic of parameter
        arguments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofSecondCard.this, C2Parameters_Arguments.class);
                startActivity(toContent);
                finish();
            }
        });

        default_parameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofSecondCard.this, C2DefaultParameters.class);
                startActivity(toContent);
                finish();
            }
        });

        multi_parameters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofSecondCard.this, C2MultipleParameters.class);
                startActivity(toContent);
                finish();
            }
        });

        return_values.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofSecondCard.this, C2ReturnValues.class);
                startActivity(toContent);
                finish();
            }
        });

        pass_by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofSecondCard.this, C2PassByReference.class);
                startActivity(toContent);
                finish();
            }
        });



        //onclick for overloading
        overloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofSecondCard.this, C2FunctionOverloading.class);
                startActivity(toContent);
                finish();
            }
        });


        //arrow left back to List of Main Activity
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListofSecondCard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //balik sa terms kapag na back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListofSecondCard.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
