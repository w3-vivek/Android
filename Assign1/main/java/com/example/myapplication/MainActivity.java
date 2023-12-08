package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText editEmail, editPass;
    CheckBox cBox, cppBox, javaBox;
    RadioButton radioMale, radioFemale;
    private static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.editEmail);
        editPass = findViewById(R.id.editPass);
        cBox = findViewById(R.id.cBox);
        cppBox = findViewById(R.id.cppBox);
        javaBox = findViewById(R.id.javaBox);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        Log.e(tag, "onCreate() start");
    }

    public void save(View view) {
        Log.e(tag, editEmail.getText().toString());
        Log.e(tag, editPass.getText().toString());

        if (cBox.isChecked())
            Log.e(tag, "Fav Lang is C");
        if (cppBox.isChecked())
            Log.e(tag, "Fav Lang is Cpp");
        if (javaBox.isChecked())
            Log.e(tag, "Fav Lang is Java");

        if (radioMale.isChecked())
            Log.e(tag, "Gender is Male");
        if (radioFemale.isChecked())
            Log.e(tag, "Gender is Female");
    }

    public void reset(View view) {
        editEmail.setText("");
        editPass.setText("");
        cppBox.setChecked(false);
        cBox.setChecked(false);
        javaBox.setChecked(false);

        radioFemale.setChecked(false);
        radioMale.setChecked(false);
    }
}