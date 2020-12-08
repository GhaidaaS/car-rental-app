package com.example.carrentalproject.Common.LoginSignup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carrentalproject.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupScreen extends AppCompatActivity {
    //Variables
    EditText regFullName, regPhoneNo, regPassword, regID;
    Button regBtn, regToLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
//Hooks to all xml elements in activity_sign_up.xml
        regFullName = findViewById(R.id.tname);
        regPhoneNo = findViewById(R.id.tphone);
        regPassword = findViewById(R.id.tpassword);
        regID = findViewById(R.id.tid);
        regBtn = findViewById(R.id.bgo);
        regToLoginBtn = findViewById(R.id.bback);
    }//onCreate Method End
    public void SinginPage(View view) {
        startActivity(new Intent(getApplicationContext(),SigninScreen.class));


    }

    //Save data in FireBase
    public void SearchPage(View view) {
        startActivity(new Intent(getApplicationContext(),SearchScreen.class));
//Get all the values
        String name = regFullName.getText().toString();
        String ID = regID.getText().toString();
        String phoneNo = regPhoneNo.getText().toString();
        String password = regPassword.getText().toString();

        DatabaseReference mDatabase= FirebaseDatabase.getInstance().getReference();
        mDatabase.child("users").child(ID).setValue(new User(ID, name, password, phoneNo));



    }

}
