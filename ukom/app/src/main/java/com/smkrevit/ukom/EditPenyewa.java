package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditPenyewa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_penyewa);
    }

    public void panah (View view) {
        Intent intent = new Intent( EditPenyewa.this, Profil1.class);
        startActivity(intent);
    }

    public void simpan (View view) {
        Intent intent = new Intent( EditPenyewa.this, Profil1.class);
        startActivity(intent);
    }
}