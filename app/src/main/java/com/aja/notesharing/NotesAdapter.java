package com.aja.notesharing;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesHolder> {

    @NonNull
    @Override
    public NotesAdapter.NotesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_single_item,parent,false);
        return new NotesHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.NotesHolder holder, int position) {
        holder.notesimage.setImageResource(R.drawable.fox);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class NotesHolder extends RecyclerView.ViewHolder{
        ImageView notesimage;
        public NotesHolder(@NonNull View itemView) {
            super(itemView);
            notesimage=itemView.findViewById(R.id.note_picture);
        }
    }
}
