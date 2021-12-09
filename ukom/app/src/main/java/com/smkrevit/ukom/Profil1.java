package com.smkrevit.ukom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profil1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil1);

    }

    //        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigasi);
//
//        //Home
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.home:
//                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                    case R.id.keranjang:
//                        startActivity(new Intent(getApplicationContext(), Keranjang.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                    case R.id.riwayat:
//                        startActivity(new Intent(getApplicationContext(), Riwayat.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                    case R.id.pesanan:
//                        startActivity(new Intent(getApplicationContext(), Pesanan.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                    case R.id.profil:
//                        return true;
//                }
//                return true;
//            }
//        });
//    }
//
    public void pensil(View view) {
        Intent intent = new Intent(Profil1.this, FormulirPenyewaan.class);
        startActivity(intent);
    }
}