package com.aja.notesharing;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesHolder> {

    List<Integer> images;
    public NotesAdapter(List<Integer> notesimages) {
        images=notesimages;
    }

    @NonNull
    @Override
    public NotesAdapter.NotesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_single_item,parent,false);
        return new NotesHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.NotesHolder holder, int position) {
        holder.notes.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

     class NotesHolder extends RecyclerView.ViewHolder{
        ImageView notes;
        public NotesHolder(@NonNull View itemView) {
            super(itemView);
            notes=itemView.findViewById(R.id.notesView);
        }
    }
}
