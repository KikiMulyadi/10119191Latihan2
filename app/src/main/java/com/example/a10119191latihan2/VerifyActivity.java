package com.example.a10119191latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Nama : Kiki Mulyadi
// NIM : 10119191
// Kelas : IF-5
//Tanggal Pengerjaan : 25 April 2022
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void verifyCode (View view){
        Intent intent = new Intent(this, VerifyCodeActivity.class);
        startActivity(intent);
    }
}