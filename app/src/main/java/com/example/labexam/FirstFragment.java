package com.example.labexam;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        ListView listV = (ListView)v.findViewById(R.id.listView1);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Student List");

        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.ceejay,
                "Ceejay B.", "Software Engineer"));

        arrayList.add(new Person(R.drawable.catallo,
                "Charles Benedict D.", "Software Engineer"));

        arrayList.add(new Person(R.drawable.deguzman,
                "Lance Gio M.", "Software Engineer"));

        arrayList.add(new Person(R.drawable.legaspi,
                "Karl Angelo G.", "Software Engineer"));

        arrayList.add(new Person(R.drawable.biasbas,
                "Jay Ivan A.", "Software Engineer"));

        PersonAdapter personAdapter = new PersonAdapter(getContext(),R.layout.list_item,arrayList);

        listV.setAdapter(personAdapter);

        return v;
    }
}