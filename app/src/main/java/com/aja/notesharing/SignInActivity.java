package com.aja.notesharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

    }

    public void createaccount(View view) {
        Intent intent=new Intent(SignInActivity.this,SignUpActivity.class);
        startActivity(intent);
    }

    public void SignIn(View view) {
        Intent mainintent=new Intent(SignInActivity.this,MainActivity.class);
        startActivity(mainintent);

    }
}