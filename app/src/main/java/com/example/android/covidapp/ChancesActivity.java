package com.example.android.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ChancesActivity extends AppCompatActivity {

    CheckBox CB1,CB2,CB3,CB4,CB5,CB6,CB7,CB8,CB9,CB10;
    Button button,reset;
    TextView text;
    int n=0, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chances);

        CB1 = findViewById(R.id.CB1);
        CB2 = findViewById(R.id.CB2);
        CB3 = findViewById(R.id.CB3);
        CB4 = findViewById(R.id.CB4);
        CB5 = findViewById(R.id.CB5);
        CB6 = findViewById(R.id.CB6);
        CB7 = findViewById(R.id.CB7);
        CB8 = findViewById(R.id.CB8);
        CB9 = findViewById(R.id.CB9);
        CB10 = findViewById(R.id.CB10);
        button= findViewById(R.id.button);
        text=findViewById(R.id.text);
        reset=findViewById(R.id.reset);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                result=n*10;
                text.setText("The chances of you being corona positive is: "+ result +"%");
                n=0;
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });
    }
    public void check(){

        if (CB1.isChecked()) {
            n++;
        }


        if (CB2.isChecked()){
            n++;
        }


        if (CB3.isChecked()) {
            n++;
        }


        if (CB4.isChecked()){
            n++;
        }


        if (CB5.isChecked()){
            n++;
        }


        if (CB6.isChecked()){
            n++;
        }


        if (CB7.isChecked()){
            n++;
        }



        if (CB8.isChecked()){
            n++;
        }


        if (CB9.isChecked()){
            n++;
        }

        if (CB10.isChecked()){
            n++;
        }

    }
    public void refresh(){
        finish();
    }

}
