package com.smkrevit.ukom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class login_user extends AppCompatActivity implements MenuItem.OnMenuItemClickListener {

    Button button, btndaftar, btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        button = findViewById(R.id.akun);
        btndaftar = findViewById(R.id.masuk);
        btnlogin = findViewById(R.id.daftar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu loginUser = new PopupMenu(getApplicationContext(), button);
                loginUser.getMenuInflater().inflate(R.menu.login, loginUser.getMenu());
                loginUser.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.penjual:
                                button.setText("Penjual");
                                break;

                            case R.id.pembeli:
                                button.setText("Pembeli");
                                break;
                        }
                        return false;
                    }
                });
                loginUser.show();
            }
        });
    }

    public void masuk(View view) {
        if (button.getText() == "Penjual") {
            Intent intent = new Intent(login_user.this, MasukPersewaan.class);
            startActivity(intent);
        }

        if (button.getText() == "Pembeli") {
            Intent intent = new Intent(login_user.this, Masuk.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }

    public void daftar(View view) {
        if (button.getText() == "Penjual") {
            Intent intent = new Intent(login_user.this, DaftarPersewaan.class);
            startActivity(intent);
        }

        if (button.getText() == "Pembeli") {
            Intent intent = new Intent(login_user.this, Daftar.class);
            startActivity(intent);
        }
    }
}