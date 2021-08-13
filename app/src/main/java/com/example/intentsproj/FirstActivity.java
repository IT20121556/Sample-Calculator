package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void firsttosecond(View view){
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();

        EditText editText1 = (EditText) findViewById(R.id.num_1);
        EditText editText2 = (EditText) findViewById(R.id.num_2);
        String MSG1 = editText1.getText().toString();
        String MSG2 = editText2.getText().toString();


        Intent intent = new Intent(this,SecondActivity.class);
        Bundle extras = new Bundle();
        extras.putString("EXTRA1",MSG1);
        extras.putString("EXTRA2",MSG2);
        intent.putExtras(extras);
        startActivity(intent);
    }
}