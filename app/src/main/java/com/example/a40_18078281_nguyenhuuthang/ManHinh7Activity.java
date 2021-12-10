package com.example.a40_18078281_nguyenhuuthang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManHinh7Activity extends AppCompatActivity {
    Button btnXemBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh7);
        btnXemBill = findViewById(R.id.btnXemBi);

        btnXemBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh7Activity.this, ManHinh3Activity.class);
                startActivity(intent);
                Toast.makeText(ManHinh7Activity.this, "Bat man hinh 3", Toast.LENGTH_SHORT).show();
            }
        });
    }
}