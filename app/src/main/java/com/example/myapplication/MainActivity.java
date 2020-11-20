package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button registration;
    TextView name, lastname, age;
    String massage;
    int Age = 18;
    String Name, Lastname;

    public void Registration(View view){
        registration = (Button) findViewById(R.id.Registration);
        name = (TextView) findViewById(R.id.editTextTextPersonName);
        lastname = (TextView) findViewById(R.id.editTextTextPersonName2);
        age = (TextView) findViewById(R.id.Number);
        EditText editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText Number = (EditText) findViewById(R.id.Number);
        Toast.makeText(this, massage, Toast.LENGTH_SHORT).show();
        int number = Integer.parseInt(Number.getText().toString());

        if (editTextTextPersonName.getText().toString().isEmpty())
        {
            massage = "please enter your name";
        }
        else if (editTextTextPersonName2.getText().toString().isEmpty())
        {
            massage = "please enter your last name";
        }
        else if (Number.getText().toString().isEmpty())
        {
            massage = "please enter your age";
        }
        else if(number < Age)
        {
            massage = "you're age is too low";
        }
        else
            {
            massage = "you're registered";
            }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}