package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText editRollno, editName, editMarks, editCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editRollno = findViewById(R.id.editRollno);
        editName = findViewById(R.id.editName);
        editMarks = findViewById(R.id.editMarks);
        editCourse = findViewById(R.id.editCourse);
    }
    public void save(View view) {
        String rollno = editRollno.getText().toString();
        String name = editName.getText().toString();
        String course = editCourse.getText().toString();
        String marks = editMarks.getText().toString();
        Student student = new Student();
        student.setRollno(Integer.parseInt(rollno));
        student.setName(name);
        student.setCourse(course);
        student.setMarks(Double.parseDouble(marks));

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("student",student);
        startActivity(intent);
    }

    public void reset(View view) {
       editRollno.setText("");
       editName.setText("");
       editCourse.setText("");
       editMarks.setText("");
    }
}