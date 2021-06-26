package com.example.secure;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {
    Intent encIntent;
    Intent decIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);
        setContentView(R.layout.activity_main);
        Button encBtn = findViewById(R.id.encBtn);
        Button decBtn = findViewById(R.id.decBtn);
        encBtn.setOnClickListener((View v)-> {
            encIntent = new Intent(MainActivity.this, Encrypt_activity.class);
            startActivity(encIntent);
        });
        decBtn.setOnClickListener((View v)->{
            decIntent= new Intent(MainActivity.this, Decrypt_activity.class);
            startActivity(decIntent);
        });
    }
}