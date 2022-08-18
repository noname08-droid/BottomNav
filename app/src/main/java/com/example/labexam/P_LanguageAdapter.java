package com.example.labexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class P_LanguageAdapter extends ArrayAdapter<P_Language> {

    private Context context;
    private int mResource;

    public P_LanguageAdapter(@NonNull Context context, int resource, @NonNull List<P_Language> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        convertView = inflater.inflate(mResource,parent, false);

        TextView p_language = convertView.findViewById(R.id.p_Language);
        p_language.setText(getItem(position).getP_language());

        return convertView;
    }
}
