package com.example.carrentalproject.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.carrentalproject.R;

public class SigninScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin_screen);
    }

    public void signupPage(View view) {
        startActivity(new Intent(getApplicationContext(),SignupScreen.class));

    }
    public void SearchPage(View view) {
        startActivity(new Intent(getApplicationContext(),SearchScreen.class));

    }

}
