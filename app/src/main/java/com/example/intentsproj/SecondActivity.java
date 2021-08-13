package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Bundle EXTRA = intent.getExtras();
        String msg1 = EXTRA.getString("EXTRA1");
        String msg2 = EXTRA.getString("EXTRA2");

        EditText editText1 = (EditText) findViewById(R.id.num_3);
        EditText editText2 = (EditText) findViewById(R.id.num_4);

        editText1.setText(msg1);
        editText2.setText(msg2);

    }
    public void ADD(View view){
        EditText editText1 = (EditText) findViewById(R.id.num_3);
        EditText editText2 = (EditText) findViewById(R.id.num_4);
        TextView textView1 = (TextView) findViewById(R.id.txt_5);

        Float val1 = Float.parseFloat(editText1.getText().toString());
        Float val2 = Float.parseFloat(editText2.getText().toString());
        float ans = val1 + val2;

        textView1.setText(val1+"+"+val2+"="+ans);
    }
    public void SUB(View view){
        EditText editText1 = (EditText) findViewById(R.id.num_3);
        EditText editText2 = (EditText) findViewById(R.id.num_4);
        TextView textView1 = (TextView) findViewById(R.id.txt_5);

        Float val1 = Float.parseFloat(editText1.getText().toString());
        Float val2 = Float.parseFloat(editText2.getText().toString());
        float ans = val1 - val2;

        textView1.setText(val1+"-"+val2+"="+ans);
    }
    public void MULTI(View view){
        EditText editText1 = (EditText) findViewById(R.id.num_3);
        EditText editText2 = (EditText) findViewById(R.id.num_4);
        TextView textView1 = (TextView) findViewById(R.id.txt_5);

        Float val1 = Float.parseFloat(editText1.getText().toString());
        Float val2 = Float.parseFloat(editText2.getText().toString());
        float ans = val1 * val2;

        textView1.setText(val1+"*"+val2+"="+ans);
    }
    public void DIVID(View view){
        EditText editText1 = (EditText) findViewById(R.id.num_3);
        EditText editText2 = (EditText) findViewById(R.id.num_4);
        TextView textView1 = (TextView) findViewById(R.id.txt_5);

        Float val1 = Float.parseFloat(editText1.getText().toString());
        Float val2 = Float.parseFloat(editText2.getText().toString());
        float ans = val1 / val2;

        textView1.setText(val1+"/"+val2+"="+ans);
    }

}