package com.example.myportfolio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerSkillAdapter extends RecyclerView.Adapter<RecyclerSkillAdapter.ViewHolder> {
    Context context;
    ArrayList<skilled> skill;

    RecyclerSkillAdapter(Context context, ArrayList<skilled> skill){
        this.context=context;
        this.skill=skill;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.skill_cardview2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(skill.get(position).nameOfSkill);
        holder.imageview.setImageResource(skill.get(position).skill_image);
    }

    @Override
    public int getItemCount() {

        return skill.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.logo);
            textView = itemView.findViewById(R.id.skillname);
        }
    }
}
