package com.example.a40_18078281_nguyenhuuthang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

//Employee_Screen
public class ManHinh2Activity extends AppCompatActivity {
    ImageView imgB1, imgB2, imgB3, imgB4, imgB5, imgB6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        imgB1 = findViewById(R.id.imgBanCus1);
        imgB2 = findViewById(R.id.imgBanCus2);
        imgB3 = findViewById(R.id.imgBanCus3);
        imgB4 = findViewById(R.id.imgBanCus4);
        imgB5 = findViewById(R.id.imgBanCus5);
        imgB6 = findViewById(R.id.imgBanCus6);

        imgB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh2Activity.this, ManHinh3Activity.class);
                Toast.makeText(ManHinh2Activity.this, "Bat man hinh 3", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imgB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh2Activity.this, ManHinh3Activity.class);
                Toast.makeText(ManHinh2Activity.this, "Bat man hinh 3", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imgB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh2Activity.this, ManHinh3Activity.class);
                Toast.makeText(ManHinh2Activity.this, "Bat man hinh 3", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


    }
}