package com.smkrevit.ukom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigasi);
//
//        //Home
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.home:
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
//                        startActivity(new Intent(getApplicationContext(), Profil1.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                }
//                return true;
//            }
//        });
//    }
//}