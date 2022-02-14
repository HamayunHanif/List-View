package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.PersonViewHolder>{
    private List<persons> personslist;
    public RecyclerAdapter(List<persons> personslist){this.personslist = personslist;}

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,null);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        persons person = personslist.get(position);
        holder.txt.setText(person.getTxt());
        holder.img.setImageResource(person.getImg());

    }

    @Override
    public int getItemCount() {
        return personslist.size();
    }
    public static class PersonViewHolder extends RecyclerView.ViewHolder
    {
        public TextView txt;
        public ImageView img;
        public PersonViewHolder(View itemView){
            super((itemView));
            txt = itemView.findViewById(R.id.brandtext);
            img = itemView.findViewById(R.id.logopic);
        }

    }
}
