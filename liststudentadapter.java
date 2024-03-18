package com.example.cobarecycleview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class liststudentadapter extends RecyclerView.Adapter<datastudent>{
    Context context;
    List<student> items;

    public liststudentadapter(Context context, List<student> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public datastudent onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new datastudent(LayoutInflater.from(context).inflate(R.layout.studentview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  datastudent holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
