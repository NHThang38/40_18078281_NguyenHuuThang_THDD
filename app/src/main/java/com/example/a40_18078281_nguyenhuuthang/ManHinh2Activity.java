package com.example.a40_18078281_nguyenhuuthang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

//Employee_Screen
public class ManHinh2Activity extends AppCompatActivity {
    ImageView imgB1, imgB2, imgB3, imgB4, imgB5, imgB6;
    Button btnDangXuat;
    GoogleSignInClient mGoogleSignInClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        imgB1 = findViewById(R.id.imgBanT1);
        imgB2 = findViewById(R.id.imgBanT2);
        imgB3 = findViewById(R.id.imgBanT3);
        imgB4 = findViewById(R.id.imgBanT4);
        imgB5 = findViewById(R.id.imgBanCus5);
        imgB6 = findViewById(R.id.imgBanCus6);


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        btnDangXuat = findViewById(R.id.btnDangXuat);
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    // ...
                    case R.id.btnDangXuat:
                        signOut();
                        break;
                    // ...
                }
            }
        });
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
    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Intent intent=new Intent(ManHinh2Activity.this, MainActivity.class);
                        Toast.makeText(ManHinh2Activity.this, "Dang Xuat Thanh Cong", Toast.LENGTH_SHORT).show();
                        startActivity(intent);

                    }
                });
    }
}