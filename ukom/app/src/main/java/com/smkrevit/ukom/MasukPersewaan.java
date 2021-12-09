package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MasukPersewaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk_persewaan);
    }

    public void masukpersewaan (View view) {
        Intent intent = new Intent( MasukPersewaan.this, Profil2.class);
        startActivity(intent);
    }
}