package com.example.lesson_26_navigation;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {


    private Button mOneBtn;
    private Button mTwoBtn;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container,false);

        mOneBtn = view.findViewById(R.id.first_fragment_one_btn);
        mOneBtn.setOnClickListener(view1 -> {

        });

        mTwoBtn = view.findViewById(R.id.first_fragment_two_btn);
        mTwoBtn.setOnClickListener((view1 -> {

        }));

        return view;
    }

}
