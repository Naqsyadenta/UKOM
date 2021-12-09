package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Daftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }

    public void daftarpembeli(View view) {
        Intent intent = new Intent( Daftar.this, MainActivity.class);
        startActivity(intent);
    }
}