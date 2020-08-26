package com.aja.notesharing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {
    RecyclerView notesrecyclerview;
    NotesAdapter notesadapter;
    List<Integer> images;
    CardView mCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mCardView=findViewById(R.id.cardView2);
        mCardView.setBackgroundResource(R.drawable.background_cardview);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.Statusbar));


        images=new ArrayList<>();
        notesrecyclerview=findViewById(R.id.notes_recycler_view);
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
        images.add(R.drawable.fox);
        images.add(R.drawable.fox);
        images.add(R.drawable.fox);
        //Recycler View
        notesadapter=new NotesAdapter(images);
        notesrecyclerview.setAdapter(notesadapter);
        notesrecyclerview.setLayoutManager(new GridLayoutManager(this,3));
        notesrecyclerview.addItemDecoration(new GridLayoutDecoration());
    }
}