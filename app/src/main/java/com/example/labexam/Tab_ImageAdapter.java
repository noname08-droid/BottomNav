package com.example.labexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Tab_ImageAdapter extends ArrayAdapter<Tab_Image> {

    private Context context;
    private int mResource;

    public Tab_ImageAdapter(@NonNull Context context, int resource, @NonNull List<Tab_Image> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        convertView = inflater.inflate(mResource,parent,false);

        ImageView tabImage = convertView.findViewById(R.id.tabImage);

        tabImage.setImageResource(getItem(position).getImageTab());

        return convertView;
    }
}
