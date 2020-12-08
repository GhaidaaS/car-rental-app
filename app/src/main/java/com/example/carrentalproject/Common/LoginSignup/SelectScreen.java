package com.example.carrentalproject.Common.LoginSignup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.carrentalproject.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;
import java.util.ArrayList;

public class SelectScreen extends AppCompatActivity implements Serializable {
    ListView listView;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);
        listView=findViewById(R.id.listView);


        ArrayList<Car> arrayList = new ArrayList<>();

        //adapter
        carAdapter carAdapters = new carAdapter(this,R.layout.list_row, arrayList);
        listView.setAdapter(carAdapters);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(SelectScreen.this, RentingDetails.class);
                Car car = arrayList.get(i);
                mIntent.putExtra("Name", car.getName());
                mIntent.putExtra("Type", car.getType());
                mIntent.putExtra("Price", car.getPrice());
                mIntent.putExtra("image", car.getImage());
                startActivity(mIntent);
            }
        });

        DatabaseReference mDatabase= FirebaseDatabase.getInstance().getReference();
        ValueEventListener carsListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    Car car = child.getValue(Car.class);
                    arrayList.add(car);
                    carAdapters.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // In case getting cars failed, log a message
                Log.w("TAG", "loadCars:onCancelled", error.toException());
                Toast.makeText(SelectScreen.this, "Failed to load cars.",
                        Toast.LENGTH_SHORT).show();
            }

        };
        mDatabase.child("cars").addValueEventListener(carsListener);

    }
}