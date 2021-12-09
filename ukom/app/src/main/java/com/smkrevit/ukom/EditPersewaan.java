package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditPersewaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_persewaan);
    }

    public void pnhpersewaan (View view) {
        Intent intent = new Intent( EditPersewaan.this, Profil2.class);
        startActivity(intent);
    }

    public void simpan2 (View view) {
        Intent intent = new Intent( EditPersewaan.this, Profil2.class);
        startActivity(intent);
    }
}