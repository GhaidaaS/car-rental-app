package com.example.carrentalproject.Common.LoginSignup;
import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;

@IgnoreExtraProperties
public class Car implements Serializable {
    String image;
    String name;
    String type;
    String price;

    public Car() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Car(String image, String name, String type, String price) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
