package com.example.labexam;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirdFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThirdFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThirdFragment newInstance(String param1, String param2) {
        ThirdFragment fragment = new ThirdFragment();
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
        View v = inflater.inflate(R.layout.fragment_third, container, false);

        ListView third_list_view = (ListView) v.findViewById(R.id.third_list_view);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("List View");

        ArrayList<P_Language> arrayList = new ArrayList<>();

        P_LanguageAdapter p_languageAdapter = new P_LanguageAdapter(getContext(), R.layout.third_list, arrayList);

        arrayList.add(new P_Language( "JavaScript"));
        arrayList.add(new P_Language( "Java"));
        arrayList.add(new P_Language( "Python"));
        arrayList.add(new P_Language( "C++"));
        arrayList.add(new P_Language( "TypeScript"));
        arrayList.add(new P_Language( "Rust"));
        arrayList.add(new P_Language( "Scheme"));
        arrayList.add(new P_Language( "Kotlin"));
        arrayList.add(new P_Language( "C#"));
        arrayList.add(new P_Language( "Perl"));
        arrayList.add(new P_Language( "PHP"));
        arrayList.add(new P_Language( "Scala"));
        arrayList.add(new P_Language( "Swift"));
        arrayList.add(new P_Language( "MATLAB"));
        arrayList.add(new P_Language( "SQL"));
        arrayList.add(new P_Language( "R Programming Language"));
        arrayList.add(new P_Language( "*Golang (Go)"));
        arrayList.add(new P_Language( "HTML"));
        arrayList.add(new P_Language( "CSS"));
        arrayList.add(new P_Language( "Ruby"));

        third_list_view.setAdapter(p_languageAdapter);;

        return v;
    }
}