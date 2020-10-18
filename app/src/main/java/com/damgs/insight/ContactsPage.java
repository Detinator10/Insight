package com.damgs.insight;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsPage extends AppCompatActivity {
    private List<Contact> contacts;
    private RecyclerView recyclerview;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
        setData();

    }

    private void setData() {
        contacts.add(new Contact("Allison","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Duaa","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Mitch","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Det","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Sherveen","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Nour","4253949946",R.drawable.ic_baseline_android_24));
        adapter.notifyDataSetChanged();
    }

    private void init(){
        contacts = new ArrayList<>();
        recyclerview = findViewById(R.id.contactRecycleView);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ContactAdapter(contacts);
        recyclerview.setAdapter(adapter);
    }
}
