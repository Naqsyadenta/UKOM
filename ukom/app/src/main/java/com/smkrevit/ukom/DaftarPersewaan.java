package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DaftarPersewaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_persewaan);
    }

    public void btnpersewaan(View view) {
        Intent intent = new Intent( DaftarPersewaan.this, Profil2.class);
        startActivity(intent);
    }
}