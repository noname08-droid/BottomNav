package com.example.labexam;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
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
        View v = inflater.inflate(R.layout.fragment_second, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Staggered Grid View");

        RecyclerView mRecycle = (RecyclerView) v.findViewById(R.id.mRecycle);
        mRecycle.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        // put image here from drawable

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.image1));
        postItems.add(new PostItem(R.drawable.image2));
        postItems.add(new PostItem(R.drawable.image3));
        postItems.add(new PostItem(R.drawable.image4));
        postItems.add(new PostItem(R.drawable.image5));
        postItems.add(new PostItem(R.drawable.image6));
        postItems.add(new PostItem(R.drawable.image7));
        postItems.add(new PostItem(R.drawable.image8));
        postItems.add(new PostItem(R.drawable.image9));
        postItems.add(new PostItem(R.drawable.image10));
        postItems.add(new PostItem(R.drawable.image11));
        postItems.add(new PostItem(R.drawable.image12));
        postItems.add(new PostItem(R.drawable.image13));
        postItems.add(new PostItem(R.drawable.image14));
        postItems.add(new PostItem(R.drawable.image15));
        postItems.add(new PostItem(R.drawable.image16));
        postItems.add(new PostItem(R.drawable.image17));
        postItems.add(new PostItem(R.drawable.image18));
        postItems.add(new PostItem(R.drawable.image19));
        postItems.add(new PostItem(R.drawable.image20));
        postItems.add(new PostItem(R.drawable.image21));
        postItems.add(new PostItem(R.drawable.image22));
        postItems.add(new PostItem(R.drawable.image23));
        postItems.add(new PostItem(R.drawable.image24));
        postItems.add(new PostItem(R.drawable.image25));
        postItems.add(new PostItem(R.drawable.image26));
        postItems.add(new PostItem(R.drawable.image27));
        postItems.add(new PostItem(R.drawable.image28));
        postItems.add(new PostItem(R.drawable.image29));
        postItems.add(new PostItem(R.drawable.image30));

        mRecycle.setAdapter(new ImageAdapter(postItems));

        return v;
    }
}