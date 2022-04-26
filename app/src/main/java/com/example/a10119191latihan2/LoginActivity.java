package com.example.a10119191latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Nama : Kiki Mulyadi
// NIM : 10119191
// Kelas : IF-5
//Tanggal Pengerjaan : 25 April 2022

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerAkun (View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}