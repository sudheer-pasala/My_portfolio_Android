package com.example.myportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity implements onItemClickListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ArrayList<CardModel> list = new ArrayList<>();
       RecyclerView recyclerView= findViewById(R.id.recyclerview);
       LinearLayoutManager layoutManager = new LinearLayoutManager(this);

       recyclerView.setLayoutManager(layoutManager);


    list.add(new CardModel(R.drawable.personalinfo_icon,"Personal-Info"));
    list.add(new CardModel(R.drawable.education,"Education"));
    list.add(new CardModel(R.drawable.skills,"Skills"));
    list.add(new CardModel(R.drawable.projects,"Projects"));
    list.add(new CardModel(R.drawable.certificate,"certifications"));
    list.add(new CardModel(R.drawable.resume,"Resume"));
    list.add(new CardModel(R.drawable.contact,"Contact"));


        RecyclerCardAdapter adapter =new RecyclerCardAdapter(this, list,this);
            recyclerView.setAdapter(adapter);




    }

    @Override
    public void onItemClick(View view, int position) {

        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, Personal_Info.class);
                break;
            case 1:
                intent = new Intent(this, MainActivity4.class);
                break;
            case 2:
                intent = new Intent(this, MainActivity5.class);
                break;
            case 3:
                intent = new Intent(this, Projects.class);
                break;
            case 4:
                intent = new Intent(this, Certifications.class);
                break;
            case 5:
                intent = new Intent(this, Resume.class);
                break;
            case 6:
                intent = new Intent(this, Contact.class);
                break;

            // Add cases for other positions
            default:
                intent = new Intent(this, MainActivity3.class);
        }
        startActivity(intent);

    }
}