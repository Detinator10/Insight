package com.damgs.insight;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsPage extends AppCompatActivity {
    private List<Contact> contacts;
    private RecyclerView recyclerview;
    private ContactAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_contacts_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setData();

    }

    private void setData() {
        loadContact((LinearLayout) (findViewById(R.id.parentlist)),"Allison","4253949946",R.drawable.ic_baseline_android_24);
        loadContact((LinearLayout) (findViewById(R.id.parentlist)),"Duaa","4253949946",R.drawable.ic_baseline_android_24);
        Log.i("alksdsakdsad","alskdlaskda");
        /*contacts.add(new Contact("Duaa","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Mitch","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Det","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Sherveen","4253949946",R.drawable.ic_baseline_android_24));
        contacts.add(new Contact("Nour","4253949946",R.drawable.ic_baseline_android_24));*/
    }

    public void loadContact(LinearLayout parent, String name, String phoneNo, int photo){
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
        View custom = inflater.inflate(R.layout.contactitem, null);
        ImageView photoIV =  (ImageView)(custom.findViewById(R.id.photoIV));
        photoIV.setImageResource(photo);
        TextView callIV = (TextView)(custom.findViewById(R.id.nameTV));
        callIV.setText(name);
        TextView nameTV = (TextView)(custom.findViewById(R.id.nameTV2));
        nameTV.setText(phoneNo);
        parent.addView(custom);
    }
}
