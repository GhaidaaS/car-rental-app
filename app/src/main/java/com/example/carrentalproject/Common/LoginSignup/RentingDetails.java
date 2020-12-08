package com.example.carrentalproject.Common.LoginSignup;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carrentalproject.R;

public class RentingDetails extends AppCompatActivity {
    TextView carname;
    TextView cartype;
    TextView carprice;
    TextView done;
    ImageView imagecar;
    TextView stert_dT;
    TextView stert_hT;
    TextView end_dT;
    TextView end_hT;
    SearchScreen searchScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_renting_details);
        carname = findViewById(R.id.carName1);
        cartype = findViewById(R.id.carType1);
        carprice = findViewById(R.id.carPrice1);
        done = findViewById(R.id.BDetails);
        imagecar = findViewById(R.id.image);
        stert_dT=findViewById(R.id.start_d);
        stert_hT=findViewById(R.id.start_h);
        end_dT=findViewById(R.id.end_d);
        end_hT=findViewById(R.id.end_h);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            carname.setText(mBundle.getString("Name"));
            cartype.setText(mBundle.getString("Type"));
            carprice.setText(mBundle.getString("Price"));

            // setting car image
            int imageResource = getResources().getIdentifier(mBundle.getString("image"), null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            imagecar.setImageDrawable(res);
        }


        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }
    public void SearchPage(View view) {
        startActivity(new Intent(getApplicationContext(),SearchScreen.class));

    }

}
