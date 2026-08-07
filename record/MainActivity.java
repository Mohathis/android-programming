package com.example.toggles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2;
    Button btnToggle;

    boolean isFirstImg=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);
        btnToggle=findViewById(R.id.toggleButton5);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFirstImg){
                    img1.setVisibility(View.GONE);
                    img2.setVisibility(View.VISIBLE);
                }else {
                    img1.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.GONE);
                }

                isFirstImg=!isFirstImg;
            }
        });


    }
}
