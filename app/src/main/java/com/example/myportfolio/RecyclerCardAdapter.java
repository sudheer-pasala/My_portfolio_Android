package com.example.myportfolio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCardAdapter  extends RecyclerView.Adapter<RecyclerCardAdapter.ViewHolder> {

Context context;
ArrayList<CardModel> list;
onItemClickListner recyclerItem;

RecyclerCardAdapter(Context context, ArrayList<CardModel> list, onItemClickListner recyclerItem){
    this.context= context;
    this.list=list;
    this.recyclerItem=recyclerItem;

}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.txtlabel.setText(list.get(position).label);
    holder.img.setImageResource(list.get(position).img);
        holder.itemView.setOnClickListener(v -> recyclerItem.onItemClick(v, position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
    TextView txtlabel;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.Rimg);
            txtlabel = itemView.findViewById(R.id.text);

        }
    }
}