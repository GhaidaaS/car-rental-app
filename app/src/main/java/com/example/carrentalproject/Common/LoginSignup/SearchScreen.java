package com.example.carrentalproject.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carrentalproject.R;

public class SearchScreen extends AppCompatActivity {
    String stert_dayS;
    String stert_hourS;
    String end_dayS;
    String end_hourS;

    TextView stert_day;
    TextView stert_hour;
    TextView end_day;
    TextView end_hour;
    Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_search_screen);
        stert_day =findViewById(R.id.start_day);
        stert_hour =findViewById(R.id.start_hour);
        end_day =findViewById(R.id.end_day);
        end_hour =findViewById(R.id.end_hour);


        stert_dayS=stert_day.getText().toString();
        stert_hourS=stert_hour.getText().toString();
        end_dayS=end_day.getText().toString();
        end_hourS=end_hour.getText().toString();
    }
    public void SelectPage(View view) {
        if (view==findViewById(R.id.search))
        startActivity(new Intent(getApplicationContext(),SelectScreen.class));

    }

    public String stert_daySa() {
        return stert_dayS; }
    public String stert_hourSa()
    { return stert_hourS; }
    public String end_daySa()
    { return end_dayS; }
    public String end_hourSa()
    { return end_hourS; }
}