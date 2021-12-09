package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Masuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
    }

    public void btnmasuk (View view) {
        Intent intent = new Intent( Masuk.this, Profil1.class);
        startActivity(intent);
    }
}