package com.example.a40_18078281_nguyenhuuthang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManHinh3Activity extends AppCompatActivity {
    TextView txtGia1, txtGia2, txtGia3, txtGia4;
    TextView txtKQ;
    Button btnTinhTien;

    //bien service
    private MyService myService;
    private  Boolean isConnect = false;
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder service) {
            MyService.MyBinder binder = (MyService.MyBinder) service;
            myService = binder.getService();
            isConnect = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isConnect = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh3);

        txtGia1 = findViewById(R.id.txtGia1);
        txtGia2 = findViewById(R.id.txtGia2);
        txtGia3 = findViewById(R.id.txtGia3);
        txtGia4 = findViewById(R.id.txtGia4);

        txtKQ = findViewById(R.id.txtKQ);
        btnTinhTien = findViewById(R.id.btnTinhTien);

        //kich hoat service
        Intent intent = new Intent(ManHinh3Activity.this, MyService.class);
        bindService(intent,mServiceConnection,BIND_AUTO_CREATE);

        btnTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txtGia1.getText().toString();
                String b = txtGia2.getText().toString();
                String c = txtGia3.getText().toString();
                String d = txtGia4.getText().toString();

                txtKQ.setText(myService.TinhTong(Double.parseDouble(a),Double.parseDouble(b),Double.parseDouble(c),Double.parseDouble(d))+"");

            }
        });

    }
}