package com.example.cobarecycleview;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class datastudent  extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView nameView,nimView;

    public datastudent(@NonNull View studentview) {
        super(studentview);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        nimView = itemView.findViewById(R.id.nim);
    }
}

