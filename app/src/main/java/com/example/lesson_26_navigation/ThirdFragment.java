package com.example.lesson_26_navigation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {

    private Button mOneBtn;
    private Button mTwoBtn;

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container,false);

        mOneBtn = view.findViewById(R.id.third_fragment_one_btn);
        mOneBtn.setOnClickListener(view1 -> {

        });

        mTwoBtn = view.findViewById(R.id.third_fragment_two_btn);
        mTwoBtn.setOnClickListener((view1 -> {

        }));

        return view;
    }
}
