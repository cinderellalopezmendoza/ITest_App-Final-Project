package com.example.itestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListofFirstCard extends AppCompatActivity {

    TextView intro,syntax,output,print_text,new_lines,comments,variables,declare_var,declare_multivar,identifiers,constant,user_input,data_type,basic_data,numbers,booleans,characters,strings,operators,arithmetic,assign,comparison,logical,string,concatenation,num_string,length,access,booleanss,bool_values,bool_express,conditions,if_condi,else_condi,else_if,short_if,switch_condi,while_loop_condi,while_loop,do_while_loop,for_loop,break_continue,arrays,references,create_reference,memory_address,pointers;
    LinearLayout subOutput,subVariable,subDataTypes,subOperators,subStrings,subBooleans,subConditions,subWhileLoop,subReferences;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_first_card);

        //TextView ID
        intro = findViewById(R.id.intro);
        syntax = findViewById(R.id.syntax);
        output = findViewById(R.id.output);
        print_text = findViewById(R.id.print_text);
        new_lines = findViewById(R.id.new_lines);
        comments = findViewById(R.id.comments);
        variables = findViewById(R.id.variables);
        declare_var = findViewById(R.id.declare_var);
        declare_multivar = findViewById(R.id.declare_multivar);
        identifiers = findViewById(R.id.identifiers);
        constant = findViewById(R.id.constants);
        user_input = findViewById(R.id.user_input);
        data_type = findViewById(R.id.data_types);
        basic_data = findViewById(R.id.basic_data_types);
        numbers = findViewById(R.id.numbers);
        booleans = findViewById(R.id.booleans);
        characters = findViewById(R.id.characters);
        strings = findViewById(R.id.strings);
        operators = findViewById(R.id.operators);
        arithmetic = findViewById(R.id.arithmetic);
        assign = findViewById(R.id.assignment);
        comparison = findViewById(R.id.comparison);
        logical = findViewById(R.id.logical);
        string = findViewById(R.id.string);
        concatenation = findViewById(R.id.concatenation);
        num_string = findViewById(R.id.num_strings);
        length = findViewById(R.id.string_length);
        access = findViewById(R.id.access_string);
        booleanss = findViewById(R.id.booleanss);
        bool_values =findViewById(R.id.boolean_values);
        bool_express = findViewById(R.id.boolean_express);
        conditions = findViewById(R.id.conditions);
        if_condi = findViewById(R.id.if_condition);
        else_condi = findViewById(R.id.else_condition);
        else_if = findViewById(R.id.else_if);
        short_if = findViewById(R.id.short_if_else);
        switch_condi = findViewById(R.id.switch_condi);
        while_loop_condi = findViewById(R.id.while_loop_condi);
        while_loop = findViewById(R.id.while_loop);
        do_while_loop = findViewById(R.id.do_while_loop);
        for_loop = findViewById(R.id.for_loop);
        break_continue = findViewById(R.id.break_continue);
        arrays = findViewById(R.id.arrays);
        references = findViewById(R.id.references);
        create_reference = findViewById(R.id.create_references);
        memory_address = findViewById(R.id.memory_address);
        pointers = findViewById(R.id.pointers);


        //LinearLAYOUT ID
        subOutput = findViewById(R.id.output_subtopic);
        subVariable =findViewById(R.id.var_subtopic);
        subDataTypes = findViewById(R.id.data_types_subtopic);
        subOperators = findViewById(R.id.operator_subtopic);
        subStrings = findViewById(R.id.string_subtopic);
        subBooleans = findViewById(R.id.boolean_subtopic);
        subConditions = findViewById(R.id.conditions_subtopic);
        subWhileLoop = findViewById(R.id.while_loop_subtopic);
        subReferences = findViewById(R.id.references_subtopic);

        //Image ID
        back = findViewById(R.id.back_arrow);



        //onclick for intro
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofFirstCard.this, C1IntroContent.class);
                toContent.putExtra("Content", getText(R.string.intro_content));
                startActivity(toContent);
                finish();
            }
        });


        //onclick for syntax
        syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofFirstCard.this, C1SyntaxContent.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for output
        subOutput.setVisibility(View.GONE);

        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subOutput.getVisibility() == View.GONE) {
                    subOutput.setVisibility(View.VISIBLE);
                } else {
                    subOutput.setVisibility(View.GONE);
                }
            }
        });

        print_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OutputPrintText.class);
                startActivity(toContent);
                finish();
            }
        });

        new_lines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OutputNewLines.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for comment
        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofFirstCard.this, C1CommentsContent.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for variable
        subVariable.setVisibility(View.GONE);

        variables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subVariable.getVisibility() == View.GONE) {
                    subVariable.setVisibility(View.VISIBLE);
                } else {
                    subVariable.setVisibility(View.GONE);
                }
            }
        });

        declare_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1VarDeclareVar.class);
                startActivity(toContent);
                finish();
            }
        });

        declare_multivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1VarDeclareMultivar.class);
                startActivity(toContent);
                finish();
            }
        });

        identifiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1VarIdentifiers.class);
                startActivity(toContent);
                finish();
            }
        });

        constant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1VarConstants.class);
                startActivity(toContent);
                finish();
            }
        });

        // onclick for user input
        user_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofFirstCard.this, C1UserInput.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for data types
        subDataTypes.setVisibility(View.GONE);

        data_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subDataTypes.getVisibility() == View.GONE) {
                    subDataTypes.setVisibility(View.VISIBLE);
                } else {
                    subDataTypes.setVisibility(View.GONE);
                }
            }
        });

        basic_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1BasicDataTypes.class);
                startActivity(toContent);
                finish();
            }
        });

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1DataNumbers.class);
                startActivity(toContent);
                finish();
            }
        });

        booleans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1DataBooleans.class);
                startActivity(toContent);
                finish();
            }
        });

        characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1DataCharacters.class);
                startActivity(toContent);
                finish();
            }
        });

        strings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1DataStrings.class);
                startActivity(toContent);
                finish();
            }
        });

        //onclick for operators
        subOperators.setVisibility(View.GONE);

        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subOperators.getVisibility() == View.GONE) {
                    subOperators.setVisibility(View.VISIBLE);
                } else {
                    subOperators.setVisibility(View.GONE);
                }
            }
        });

        arithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OpArithmetic.class);
                startActivity(toContent);
                finish();
            }
        });

        assign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OpAssignment.class);
                startActivity(toContent);
                finish();
            }
        });

        comparison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OpComparison.class);
                startActivity(toContent);
                finish();
            }
        });

        logical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1OpLogical.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for operators
        subStrings.setVisibility(View.GONE);

        string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subStrings.getVisibility() == View.GONE) {
                    subStrings.setVisibility(View.VISIBLE);
                } else {
                    subStrings.setVisibility(View.GONE);
                }
            }
        });

        concatenation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1StringConcatenation.class);
                startActivity(toContent);
                finish();
            }
        });

        num_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1StringNumbers.class);
                startActivity(toContent);
                finish();
            }
        });

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1StringLength.class);
                startActivity(toContent);
                finish();
            }
        });

        access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1StringAccess.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for boolean
        subBooleans.setVisibility(View.GONE);

        booleanss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subBooleans.getVisibility() == View.GONE) {
                    subBooleans.setVisibility(View.VISIBLE);
                } else {
                    subBooleans.setVisibility(View.GONE);
                }
            }
        });

        bool_values.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1BoolValues.class);
                startActivity(toContent);
                finish();
            }
        });

        bool_express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1BoolExpressions.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for conditions
        subConditions.setVisibility(View.GONE);

        conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subConditions.getVisibility() == View.GONE) {
                    subConditions.setVisibility(View.VISIBLE);
                } else {
                    subConditions.setVisibility(View.GONE);
                }
            }
        });

        if_condi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1ConditionIf.class);
                startActivity(toContent);
                finish();
            }
        });

        else_condi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1ConditionElse.class);
                startActivity(toContent);
                finish();
            }
        });

        else_if.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1ConditionsElseIf.class);
                startActivity(toContent);
                finish();
            }
        });

        short_if.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1ConditionsShortIfElse.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for switch
        switch_condi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toContent = new Intent(ListofFirstCard.this, C1SwitchContent.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for while loop
        subWhileLoop.setVisibility(View.GONE);

        while_loop_condi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subWhileLoop.getVisibility() == View.GONE) {
                    subWhileLoop.setVisibility(View.VISIBLE);
                } else {
                    subWhileLoop.setVisibility(View.GONE);
                }
            }
        });

        while_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1WhileLoop.class);
                startActivity(toContent);
                finish();
            }
        });

        do_while_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1DoWhileLoop.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for for loop
        for_loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1ForLoop.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for break/continue
        break_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1BreakContinue.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for arrays
        arrays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1Arrays.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for references
        subReferences.setVisibility(View.GONE);

        references.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subReferences.getVisibility() == View.GONE) {
                    subReferences.setVisibility(View.VISIBLE);
                } else {
                    subReferences.setVisibility(View.GONE);
                }
            }
        });

        create_reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1CreateReferences.class);
                startActivity(toContent);
                finish();
            }
        });

        memory_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1MemoryAddress.class);
                startActivity(toContent);
                finish();
            }
        });


        //onclick for pointers
        pointers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContent = new Intent(ListofFirstCard.this, C1Pointers.class);
                startActivity(toContent);
                finish();
            }
        });


        //arrow left back to List of Main Activity
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListofFirstCard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    //balik sa terms kapag na back

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ListofFirstCard.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}