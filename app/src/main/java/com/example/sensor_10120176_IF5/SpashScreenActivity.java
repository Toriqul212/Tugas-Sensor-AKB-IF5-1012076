package com.example.sensor_10120176_IF5;

/**
 * NAMA    : Muhammad Toriqul muslim
 * NIM     : 10120176
 * Kelas   : IF-5
 * MatKul  : Aplikasi Komputasi Bergerak
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SpashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        },1000);
    }
}