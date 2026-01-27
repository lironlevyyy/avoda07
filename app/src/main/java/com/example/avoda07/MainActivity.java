package com.example.avoda07;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        img = findViewById(R.id.img);
    }

    public void Clickme(View view) {
        Random r = new Random();
        int num = r.nextInt(3) + 1;

        btn.setText(String.valueOf(num));

        if (num == 1) {
            img.setImageResource(R.drawable.img1);
        } else if (num == 2) {
            img.setImageResource(R.drawable.img2);
        } else if (num == 3) {
            img.setImageResource(R.drawable.img3);
        }
    }
    }