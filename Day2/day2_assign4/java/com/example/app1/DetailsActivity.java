package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    TextView textRollno,textName, textCourse,textMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textRollno = findViewById(R.id.textRollno);
        textName = findViewById(R.id.textName);
        textCourse = findViewById(R.id.textCourse);
        textMarks = findViewById(R.id.textMarks);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("student");
        Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT).show();

        textRollno.setText("Rollno - "+student.getRollno());
        textName.setText("Name - "+student.getName());
        textCourse.setText("Course - "+student.getCourse());
        textMarks.setText("Marks - "+student.getMarks());
    }
}