package com.example.labexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirdTab#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdTab extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirdTab() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThirdTab.
     */
    // TODO: Rename and change types and number of parameters
    public static ThirdTab newInstance(String param1, String param2) {
        ThirdTab fragment = new ThirdTab();
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
        View v = inflater.inflate(R.layout.fragment_third_tab, container, false);

        ListView third_tab_list = (ListView) v.findViewById(R.id.listImage);

        ArrayList<Tab_Image> arrayList = new ArrayList<>();

        arrayList.add(new Tab_Image(R.drawable.list1));
        arrayList.add(new Tab_Image(R.drawable.list2));
        arrayList.add(new Tab_Image(R.drawable.list3));
        arrayList.add(new Tab_Image(R.drawable.list4));
        arrayList.add(new Tab_Image(R.drawable.list5));

        third_tab_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    getContext().startActivity(new Intent(getContext(), List1.class));
                }else if (position == 1){
                    getContext().startActivity(new Intent(getContext(), List2.class));
                }else if (position == 2){
                    getContext().startActivity(new Intent(getContext(), List3.class));
                }else if (position == 3){
                    getContext().startActivity(new Intent(getContext(), List4.class));
                }else if (position == 4){
                    getContext().startActivity(new Intent(getContext(), List5.class));
                }
            }
        });

        Tab_ImageAdapter tab_imageAdapter = new Tab_ImageAdapter(getContext(), R.layout.tablist, arrayList);
        third_tab_list.setAdapter(tab_imageAdapter);

        return v;
    }
}