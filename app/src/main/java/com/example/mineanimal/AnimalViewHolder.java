package com.example.mineanimal;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    ImageView animalImageView;
    TextView animalNameView;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);

        this.animalImageView = (ImageView) itemView.findViewById(R.id.animalImage);
        this.animalNameView = (TextView) itemView.findViewById(R.id.animalName);
    }

}
