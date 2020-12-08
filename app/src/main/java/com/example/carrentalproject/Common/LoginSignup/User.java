package com.example.carrentalproject.Common.LoginSignup;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
        public String id;
        public String name;
        public String password;
        public String phone;

        public User() {
            // Default constructor required for calls to DataSnapshot.getValue(User.class)
        }

        public User(String ID, String FullName, String Password, String Phone) {
            this.id = ID;
            this.name = FullName;
            this.password = Password;
            this.phone = Phone;
        }
}
