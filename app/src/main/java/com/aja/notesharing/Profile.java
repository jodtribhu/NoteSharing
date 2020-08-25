package com.aja.notesharing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {
    RecyclerView notesrecyclerview;
    NotesAdapter notesadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.dashboard:startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Add:startActivity(new Intent(getApplicationContext(),Add_notes.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Searches:startActivity(new Intent(getApplicationContext(),SearchNotes.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        //Recycler View
        notesrecyclerview=findViewById(R.id.notes_recycler_view);
        notesrecyclerview.setAdapter(notesadapter);
        RecyclerView.LayoutManager manager=new GridLayoutManager(this,3);
        notesrecyclerview.setLayoutManager(manager);
    }
}