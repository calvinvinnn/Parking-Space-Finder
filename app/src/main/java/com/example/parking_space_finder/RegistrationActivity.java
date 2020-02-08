package com.example.parking_space_finder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.example.parking_space_finder.model.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    private ParkingManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Customer c = new Customer();
                Car car = new Car();
                manager = ParkingManager.getInstance();
                String userName;
                String phoneNumber;
                String address;
                String emailAddress;
                String firstName;
                String lastName;
                String cardNumber;
                String cvv;
                String expiryDate;
                String password;
                String carMake;
                String carColor;
                String carPlate;

                EditText userInput = findViewById(R.id.edittxt_name);
                userName = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_phone);
                phoneNumber = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_address);
                address = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_type);
                carMake = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_color);
                carColor = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_license_plate);
                carPlate = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_email);
                emailAddress = userInput.getText().toString();

                userInput = findViewById(R.id.edittxt_password);
                password = userInput.getText().toString();

                car.setColor(carColor);
                car.setLicencePlate(carPlate);
                car.setMake(carMake);
                c.setUserName(userName);
                c.setAddress(address);
                c.setPhoneNumber(phoneNumber);
                c.setCar(car);
                c.setFirstName("jfe");
                c.setLastName("asdwq");
                c.setEmailAddress(emailAddress);
                //c.setCardNumber(cardNumber);
                //c.setCvv(cvv);
                //c.setExpiryDate(expiryDate);
                manager.addCustomer(c);


                Intent i = MainMenuActivity.makeLaunchIntent(RegistrationActivity.this);
                startActivity(i);
            }
        });
    }

    public static Intent makeLaunchIntent(Context c){
        Intent intent = new Intent(c, RegistrationActivity.class);
        return intent;
    }


}
