package com.example.intent;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView e1, e2,e3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        e1 = findViewById(R.id.textView);
        e2 = findViewById(R.id.textView2);
        e3 = findViewById(R.id.textView3);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("age");
        String text2 = extra.getString("place");

        e1.setText(text);
        e2.setText(text1);
        e3.setText(text2);

    }
}

