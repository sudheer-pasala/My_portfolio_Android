package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Personal_Info extends AppCompatActivity {
Button btn2, btn3;
    TextView detailsofme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.personal_info);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String detail = "Name: Pasala.sai Sudheer"+"\n " +"Gender: Male"+ " \n"+"D.O.B : 23/12/2003" ;
        detailsofme = findViewById(R.id.detailsofme);
        detailsofme.setText(detail);
        btn2= findViewById(R.id.btn_Git);
        btn3= findViewById(R.id.btn_linkedin);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GitUrl();
            }

            private void GitUrl() {

                Uri url1 = Uri.parse("https://github.com/sudheer-pasala");
                Intent UrlIntent = new Intent(Intent.ACTION_VIEW, url1);
                startActivity(UrlIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Linkedinurl();
            }

            private void Linkedinurl() {
                Uri url2 = Uri.parse("https://www.linkedin.com/in/sai-sudheer-pasala-1aba4a271/");
                Intent UrlIntent= new Intent(Intent.ACTION_VIEW, url2);
                startActivity(UrlIntent);
            }
        });


    }
}