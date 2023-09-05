package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText myText;
    private Button myButton;
    private TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText=findViewById(R.id.editText);
        myButton=findViewById(R.id.btnOpenActivity2);
        myTextView=findViewById(R.id.resultText);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String mytool= myText.getText().toString();
                myTextView.setText(mytool);
                Toast toast=Toast. makeText(getApplicationContext(),mytool,Toast. LENGTH_LONG);
                toast. setMargin(50,50);
                toast. show();
            }
        });
    }
}