package com.example.labexam;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.labexam.Person;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {
    private Context context;
    private int mResource;

    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        convertView = layoutInflater.inflate(mResource,parent, false);

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        Button show = convertView.findViewById(R.id.show);

        TextView person_name = convertView.findViewById(R.id.person_Name);
        TextView person_label = convertView.findViewById(R.id.label);

        imageView.setImageResource(getItem(position).getImage());

        person_name.setText(getItem(position).getName());
        person_label.setText(getItem(position).getLabel());

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0){
                    context.startActivity(new Intent(getContext(),Ceejay.class));
                }else if(position == 1){
                    context.startActivity(new Intent(getContext(),Charles.class));
                }else if(position == 2){
                    context.startActivity(new Intent(getContext(),Lance.class));
                }else if(position == 3){
                    context.startActivity(new Intent(getContext(),Karl.class));
                }else if(position == 4){
                    context.startActivity(new Intent(getContext(),Jay.class));
                }
            }
        });

        return  convertView;
    }
}
