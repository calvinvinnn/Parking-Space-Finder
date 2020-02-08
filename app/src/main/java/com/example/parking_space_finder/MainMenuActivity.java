package com.example.parking_space_finder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = findViewById(R.id.btn_book_now);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //explosion = (ImageView)findViewById(R.id.animation_bomb1);
                Intent i = BookActivity.makeLaunchIntent(MainMenuActivity.this);
                startActivity(i);
            }
        });

    }


    public static Intent makeLaunchIntent(Context c){
        Intent intent = new Intent(c, MainMenuActivity.class);
        return intent;
    }

}

