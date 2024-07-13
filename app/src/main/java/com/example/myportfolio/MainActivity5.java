package com.example.myportfolio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayList<skilled> skill= new ArrayList<skilled>();
        RecyclerView recyclerView= findViewById(R.id.recyclerview2);
        GridLayoutManager layoutManager=  new GridLayoutManager(this, 2);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if(position== skill.size()-1){
                return 2;
                }
                return 1;
            }
        });
        recyclerView.setLayoutManager(layoutManager);


        skill.add(new skilled(R.drawable.java, "Java"));
        skill.add(new skilled(R.drawable.html, "HTML"));
        skill.add(new skilled(R.drawable.css, "CSS"));
        skill.add(new skilled(R.drawable.bootstrap, "BootStrap"));
        skill.add(new skilled(R.drawable.js, "JavaScript"));
        skill.add(new skilled(R.drawable.node, "NodeJs"));
        skill.add(new skilled(R.drawable.express, "Express"));
        skill.add(new skilled(R.drawable.react, "React"));
        skill.add(new skilled(R.drawable.sql, "SQL"));
        skill.add(new skilled(R.drawable.mongo, "MongoDB"));
        skill.add(new skilled(R.drawable.android, "Android"));






        RecyclerSkillAdapter skill_Adapter= new RecyclerSkillAdapter(this, skill);
        recyclerView.setAdapter(skill_Adapter);


    }
}