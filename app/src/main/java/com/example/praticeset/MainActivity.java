package com.example.praticeset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"Java Is A Language?",
            "Java Was Created Using Python?","Does Java Have Abstract Classes ?",
            "Does Java Support Interfaces ?"
    };
    private Boolean[] answers={true,false,true,true};
    TextView textView;
    private int index=0;
    private int score=0;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView=findViewById(R.id.textView);
        textView.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length - 1) {
                    if(answers[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length - 1){
                        textView.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Score Is "+score, Toast.LENGTH_SHORT).show();
                    }
                }else
                {
                    Toast.makeText(MainActivity.this, "Restart The App To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length - 1) {
                   if(!answers[index]){
                       score++;
                   }
                   index++;
                    if(index<=questions.length - 1){
                        textView.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Score Is "+score, Toast.LENGTH_SHORT).show();
                    }
                }else
                {
                    Toast.makeText(MainActivity.this, "Restart The App To Play Again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}