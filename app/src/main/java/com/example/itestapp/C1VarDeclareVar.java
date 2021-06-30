package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C1VarDeclareVar extends AppCompatActivity {

    TextView content,declare_syntax,V_output1,syntax2,V_output2,syntax3,V_output3,data,display,output_display,add,output_add;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_var_declare_var);

        content = findViewById(R.id.variable_content);
        declare_syntax = findViewById(R.id.syntax_var1);
        V_output1= findViewById(R.id.output_syntax_var);
        syntax2 = findViewById(R.id.syntax_var2);
        V_output2 = findViewById(R.id.output_syntax_var2);
        syntax3 = findViewById(R.id.syntax_var3);
        V_output3 = findViewById(R.id.output_syntax_var3);
        data = findViewById(R.id.data_types);
        display = findViewById(R.id.display_var);
        output_display =findViewById(R.id.output_display_var);
        add = findViewById(R.id.adding_var);
        output_add = findViewById(R.id.output_add_var);
        back = findViewById(R.id.back_arrow);


        //get content from string.xml
        content.setText(Html.fromHtml(getString(R.string.variable_content)));
        declare_syntax.setText(Html.fromHtml(getString(R.string.syntax_var1)));
        V_output1.setText(Html.fromHtml(getString(R.string.output_syntax_var)));
        syntax2.setText(Html.fromHtml(getString(R.string.syntax_var2)));
        V_output2.setText(Html.fromHtml(getString(R.string.output_syntax_var2)));
        syntax3.setText(Html.fromHtml(getString(R.string.syntax_var3)));
        V_output3.setText(Html.fromHtml(getString(R.string.output_syntax_var3)));
        data.setText(Html.fromHtml(getString(R.string.data_types)));
        display.setText(Html.fromHtml(getString(R.string.display_var)));
        output_display.setText(Html.fromHtml(getString(R.string.output_display_var)));
        add.setText(Html.fromHtml(getString(R.string.adding_var)));
        output_add.setText(Html.fromHtml(getString(R.string.output_add_var)));


        //arrow left back to List of FirstCard
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(C1VarDeclareVar.this, ListofFirstCard.class);
                startActivity(intent);
                finish();
            }
        });
    }

    //balik sa terms kapag ni back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(C1VarDeclareVar.this,ListofFirstCard.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}

