package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText g1;
    EditText g2;
    EditText g3;
    EditText g4;
    EditText g5;
    TextView gpa;
    LinearLayout mn;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g1 = findViewById(R.id.grade1);
        g2 = findViewById(R.id.grade2);
        g3 = findViewById(R.id.grade3);
        g4 = findViewById(R.id.grade4);
        g5 = findViewById(R.id.grade5);
        gpa = findViewById(R.id.gpa);
        mn = findViewById(R.id.activity_main);
        cal = findViewById(R.id.calculate);


    }

    public void calculateClick(View view) {
            if(TextUtils.isEmpty(g1.getText().toString()) ||TextUtils.isEmpty(g2.getText().toString()) ||TextUtils.isEmpty(g3.getText().toString()) ||TextUtils.isEmpty(g4.getText().toString()) ||TextUtils.isEmpty(g5.getText().toString()) ){
                Toast.makeText(getApplicationContext(),"BAD INPUT: fields cant be empty",Toast.LENGTH_SHORT).show();
            }
            else {
                int grade = 0;
                String gradeStr = g1.getText().toString();
                grade += Integer.parseInt(gradeStr);
                gradeStr = g2.getText().toString();
                grade += Integer.parseInt(gradeStr);
                gradeStr = g3.getText().toString();
                grade += Integer.parseInt(gradeStr);
                gradeStr = g4.getText().toString();
                grade += Integer.parseInt(gradeStr);
                gradeStr = g5.getText().toString();
                grade += Integer.parseInt(gradeStr);
                grade = grade / 5;
                if (grade < 60) mn.setBackgroundColor(Color.RED);
                if (grade > 60 && grade < 80) mn.setBackgroundColor(Color.YELLOW);
                if (grade > 79) mn.setBackgroundColor(Color.GREEN);
                gpa.setText("GPA: " + grade);
                cal.setText("Clear");
            }


    }


}