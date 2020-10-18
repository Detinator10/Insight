package com.damgs.insight;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class InfoPage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_screen);
        //getting bottom navigation view and attaching the listener
       // navigation.setOnNavigationItemSelectedListener(this);

        Button button = findViewById(R.id.contactsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveToContacts();
            }
        });
    }

    public void MoveToContacts(){
        Intent intent = new Intent(InfoPage.this, ContactsPage.class);
        startActivity(intent);
    }




}
