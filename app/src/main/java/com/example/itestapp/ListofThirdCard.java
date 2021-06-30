package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListofThirdCard extends AppCompatActivity {

    TextView oop,class_object,class_method,constructors,access,encapsulation,inheritance1,inheritance,level_inheritance,multi_inheritance,specifiers,polymorphism,files;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_third_card);


        //TextView ID
        oop = findViewById(R.id.oop);
        class_object = findViewById(R.id.classes_objects);
        class_method = findViewById(R.id.class_methods);
        constructors = findViewById(R.id.constructors);
        access = findViewById(R.id.access_specifiers);
        encapsulation = findViewById(R.id.encapsulation);
        inheritance1 = findViewById(R.id.inheritance1);
        inheritance= findViewById(R.id.inheritance);
        level_inheritance = findViewById(R.id.multilevel_inheritance);
        multi_inheritance = findViewById(R.id.multiple_inheritance);
        specifiers = findViewById(R.id.inheritance_access_specifiers);
        polymorphism = findViewById(R.id.polymorphism);
        files = findViewById(R.id.files);

        //Image ID
        back = findViewById(R.id.back_arrow);


        //onclick for oop
        oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3OopContent.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for class/object
        class_object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3ClassesObject.class);
                startActivity(toContent);
                finish();
            }
        });

        //onclick for class method
        class_method.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3ClassMethods.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for constructors
        constructors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Constructors.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for constructors
        access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3AccessSpecifiers.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for encapsulation
        encapsulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Encapsulation.class);
                startActivity(toContent);
                finish();
            }
        });



        inheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Inheritance.class);
                startActivity(toContent);
                finish();
            }
        });

        level_inheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3MultilevelInheritance.class);
                startActivity(toContent);
                finish();
            }
        });

        multi_inheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3MultipleInheritance.class);
                startActivity(toContent);
                finish();
            }
        });

        specifiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Specifiers.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for polymorphism
        polymorphism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Polymorphism.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for polymorphism
        files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofThirdCard.this, C3Files.class);
                startActivity(toContent);
                finish();
            }
        });



        //arrow left back to List of Main Activity
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListofThirdCard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //balik sa terms kapag na back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListofThirdCard.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}