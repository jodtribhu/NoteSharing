package com.aja.notesharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void Back_to_sign_in(View view) {
        Intent to_sign_in_intent=new Intent(SignUpActivity.this,SignInActivity.class);
        startActivity(to_sign_in_intent);
    }
}