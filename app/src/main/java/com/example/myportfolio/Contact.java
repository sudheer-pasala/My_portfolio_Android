package com.example.myportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Contact extends AppCompatActivity {

    TextView Email;
    TextView Address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.contact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         Email = findViewById(R.id.Email);

         Email.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                     prepopulateRecipient(view);
             }



             public void prepopulateRecipient(View view) {
                 String recipient = "pasalasaisudheer@gmail.com";
                 Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + recipient));
                 intent.putExtra(Intent.EXTRA_SUBJECT, "Hey pasala sai sudheer your profile seems Intresting");
                 intent.putExtra(Intent.EXTRA_TEXT, "Hi your profile suits for the role @role description.");
                 startActivity(intent);
             }


         });

         String adress= "1-151,Beside WaterTank,Ralladibba Street"+"\n"+"Rayabhupalapatnam ,Peddapuram Mandal"+"\n"+"Andhrapradesh, Kakinada District"+"\n"
                 +"PinCode (533437)";

            Address =  (TextView) findViewById(R.id.address);
            Address.setText(adress);


    }
}