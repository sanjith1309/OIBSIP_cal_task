package com.example.cal_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,equal,clear;
    private TextView info,result;
    private final char subtraction= '-';
    private final char divide='/';
    private final char multiplication='*';
    private final char Addition= '=';
    private final char equ='0';
    private double val1=Double.NaN;
    private double val2;
    private char Action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                Action=Addition;
                result.setText(String.valueOf(val1)+"+");
                info.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                Action=subtraction;
                result.setText(String.valueOf(val1)+"-");
                info.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                Action=divide;
                result.setText(String.valueOf(val1)+"/");
                info.setText(null);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                Action=multiplication;
                result.setText(String.valueOf(val1)+"*");
                info.setText(null);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                Action=equ;
                result.setText(result.getText().toString() + String.valueOf(val2)+"="+String.valueOf(val1));

                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0){
                    CharSequence name= info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));

                }
                else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    result.setText(null);
                    info.setText(null);
                }
            }
        });
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(info.getText().toString());

            switch(Action){
                case Addition:
                    val1=val1+val2;
                    break;
                case subtraction:
                    val1=val1-val2;
                    break;
                case divide:
                    val1=val1/val2;
                    break;
                case multiplication:
                    val1=val1*val2;
                    break;
                case equ:
                    break;

            }
        }
        else{
            val1=Double.parseDouble(info.getText().toString());
        }
    }


    private void setupUIViews(){
        one =(Button)findViewById(R.id.button9);
        two=(Button)findViewById(R.id.button10);
        three=(Button)findViewById(R.id.button11);
        four=(Button)findViewById(R.id.button5);
        five=(Button)findViewById(R.id.button6);
        zero=(Button)findViewById(R.id.button14);
        six=(Button)findViewById(R.id.button7);
        seven=(Button)findViewById(R.id.button2);
        eight=(Button)findViewById(R.id.button);
        nine=(Button)findViewById(R.id.button3);
        add=(Button)findViewById(R.id.button4);
        sub=(Button)findViewById(R.id.button8);
        mul=(Button)findViewById(R.id.button12);
        div=(Button)findViewById(R.id.button16);
        equal=(Button)findViewById(R.id.button15);
        clear=(Button)findViewById(R.id.button13);
        info=(TextView)findViewById(R.id.textView2);
        result=(TextView)findViewById(R.id.textView);

    }

}