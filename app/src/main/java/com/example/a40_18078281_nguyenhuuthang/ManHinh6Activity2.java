package com.example.a40_18078281_nguyenhuuthang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

// Customer_Screen
public class ManHinh6Activity2 extends AppCompatActivity {
    ImageView imgBC1, imgBC2, imgBC3, imgBC4, imgBC5, imgBC6;
    Button btnXemBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh62);


        imgBC1 = findViewById(R.id.imgBanT1);
        imgBC2 = findViewById(R.id.imgBanT2);
        imgBC3 = findViewById(R.id.imgBanT3);

        btnXemBill = findViewById(R.id.btnXemBi);
//        btnXemBill.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(ManHinh6Activity2.this, ManHinh3Activity.class);
//                Toast.makeText(ManHinh6Activity2.this, "Bat man hinh 3", Toast.LENGTH_SHORT).show();
//                startActivity(intent);
//            }
//        });

        imgBC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh6Activity2.this, ManHinh7Activity.class);
                Toast.makeText(ManHinh6Activity2.this, "Bat man hinh 7", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imgBC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh6Activity2.this, ManHinh7Activity.class);
                Toast.makeText(ManHinh6Activity2.this, "Bat man hinh 7", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imgBC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ManHinh6Activity2.this, ManHinh7Activity.class);
                Toast.makeText(ManHinh6Activity2.this, "Bat man hinh 7", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}