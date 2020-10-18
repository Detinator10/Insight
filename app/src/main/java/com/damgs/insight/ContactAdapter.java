package com.damgs.insight;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Viewholder> {
   private List<Contact> contacts;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_contacts_page,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Contact contact = contacts.get(position);
        holder.nameTv.setText(contact.getName());
        holder.nameTv2.setText(contact.getPhoneNo());
        holder.photoIv.setImageResource(contact.getPhoto());
    }

    @Override
    public int getItemCount() {

        return contacts.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

        private ImageView photoIv,callIv;
        private TextView nameTv;
        private TextView nameTv2;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            photoIv=itemView.findViewById(R.id.photoIV);
            callIv = itemView.findViewById(R.id.callIv);
            nameTv = itemView.findViewById(R.id.nameTV);
            nameTv2 = itemView.findViewById(R.id.nameTV2);
        }
    }

}
