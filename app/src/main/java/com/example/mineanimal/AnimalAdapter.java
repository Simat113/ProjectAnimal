package com.example.mineanimal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private List<Animal> animals;
    private Context context;
    private LayoutInflater mLayoutInflater;

    public AnimalAdapter(Context context, List<Animal> datas) {
        this.context = context;
        this.animals = datas;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View recyclerViewItem = mLayoutInflater.inflate(R.layout.animal_recycler, parent, false);

        recyclerViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRecyclerItemClick( (RecyclerView)parent, v);
            }
        });
        return new AnimalViewHolder(recyclerViewItem);
    }


    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animal animal = this.animals.get(position);

        int imageResId = animal.getAnimalIMG();
        holder.animalImageView.setImageResource(imageResId);
        holder.animalNameView.setText(animal.getAnimalName());
    }

    @Override
    public int getItemCount() {
        return this.animals.size();
    }

    private void handleRecyclerItemClick(RecyclerView recyclerView, View itemView) {
        int itemPosition = recyclerView.getChildLayoutPosition(itemView);
        Animal animal = this.animals.get(itemPosition);

        Intent i = new Intent(context, AnimalActivity.class);
        i.putExtra("AnimalName", animal.getAnimalName());
        i.putExtra("AnimalIMG", animal.getAnimalIMG());
        this.context.startActivity(i);
    }
}
