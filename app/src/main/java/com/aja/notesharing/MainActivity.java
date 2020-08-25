package com.aja.notesharing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.profile);

bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.dashboard:startActivity(new Intent(getApplicationContext(),Dashboard.class));
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


    }
}