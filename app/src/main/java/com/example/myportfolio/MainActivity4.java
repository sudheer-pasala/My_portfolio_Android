package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
Button UnivUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        UnivUrl = findViewById(R.id.UnivUrl);
        UnivUrl.setOnClickListener(
                v -> goToUrl());


    }


    void goToUrl(){
        Uri url = Uri.parse("https://www.bharathuniv.ac.in/");
        Intent UrlIntent= new Intent(Intent.ACTION_VIEW, url);
        startActivity(UrlIntent);
    }


}