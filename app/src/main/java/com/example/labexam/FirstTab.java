package com.example.labexam;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.text.DecimalFormat;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstTab#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class FirstTab extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View view;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstTab.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstTab newInstance(String param1, String param2) {
        FirstTab fragment = new FirstTab();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public FirstTab() {
        // Required empty public constructor
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
        View v = inflater.inflate(R.layout.fragment_first_tab, container, false);

         EditText firstNum = (EditText) v.findViewById(R.id.firstNum);
        EditText secondNum = (EditText) v.findViewById(R.id.secondNum);
        EditText thirdNum = (EditText) v.findViewById(R.id.thirdNum);
        TextView result = (TextView) v.findViewById(R.id.result);

//        ((InputMethodManager)getContext().getSystemService(Context.INPUT_METHOD_SERVICE)).
//                toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);


        Button ans = (Button) v.findViewById(R.id.ans);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        Double first = Double.parseDouble(firstNum.getText().toString());
        Double second = Double.parseDouble(secondNum.getText().toString());
        Double third = Double.parseDouble(thirdNum.getText().toString());

        Double add = first + second + third;
        Double average = add/3;

        DecimalFormat df = new DecimalFormat("#.##");
        String twoDigitNum = df.format(average);

        result.setText("Average: " + String.valueOf(twoDigitNum));
            }
        });
        return v;
    }

}