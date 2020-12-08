package com.example.carrentalproject.Common.LoginSignup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.carrentalproject.R;

import java.util.ArrayList;


public class carAdapter extends ArrayAdapter<Car> {
    private Context mContext;
    private int mResource;
    public carAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Car> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource= resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent, false);
        ImageView imageView =convertView.findViewById(R.id.image);
        TextView txtname =convertView.findViewById(R.id.carName1);
        TextView txttype =convertView.findViewById(R.id.carType1);
        TextView txtprice =convertView.findViewById(R.id.carPrice1);

        Car car = getItem(position); // current car object
        txtname.setText(car.getName()); // setting car name
        txttype.setText(car.getType()); // setting car type
        txtprice.setText(car.getPrice()); // setting car price

        // setting car image, by getting the image from drawable
        int imageResource = mContext.getResources().getIdentifier(car.getImage(), null, mContext.getPackageName());
        Drawable res = mContext.getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);

        return convertView;
    }
}
