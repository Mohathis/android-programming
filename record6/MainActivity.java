package com.example.grid_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    EditText e1,e2;

    TextView t1,rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextText);
        e2=findViewById(R.id.editTextText2);


        b1=findViewById(R.id.button7);
        b2=findViewById(R.id.button5);
        b3=findViewById(R.id.button8);
        b4=findViewById(R.id.button9);



        t1=findViewById(R.id.textView);
        rslt=findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double n1 = Double.parseDouble(e1.getText().toString());
                Double n2 = Double.parseDouble(e2.getText().toString());
                Double cal = n1 + n2;
                rslt.setText("sum:" + cal);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(e1.getText().toString());
                Double n2 = Double.parseDouble(e2.getText().toString());
                Double cal = n1 - n2;
                rslt.setText("sub:" + cal);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(e1.getText().toString());
                Double n2 = Double.parseDouble(e2.getText().toString());
                Double cal = n1 * n2;
                rslt.setText("mul:"+ cal);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(e1.getText().toString());
                Double n2 = Double.parseDouble(e2.getText().toString());
                Double cal = n1 / n2;
                rslt.setText("div:" + cal);
            }
        });
    }
}
