package com.example.carrentalproject.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.carrentalproject.R;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
    }

    public void signinPage(View view){
        startActivity(new Intent(getApplicationContext(),SigninScreen.class));
    }
    public void signupPage(View view){
        startActivity(new Intent(getApplicationContext(),SignupScreen.class));
    }

}