package com.example.adapter2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText num1, num2;

    Button btnDivide;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);


        String[] students ={
                "Anu","arun","akhil","meera","Rahul","kiran"
        };
        ArrayAdapter<String> adapter=
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,students);

        listView.setAdapter(adapter);

        
    }
}
