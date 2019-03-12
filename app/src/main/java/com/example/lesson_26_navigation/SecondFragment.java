package com.example.lesson_26_navigation;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private Button mOneBtn;
    private Button mTwoBtn;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container,false);

        mOneBtn = view.findViewById(R.id.second_fragment_one_btn);
        mOneBtn.setOnClickListener(view1 -> {

        });

        mTwoBtn = view.findViewById(R.id.second_fragment_two_btn);
        mTwoBtn.setOnClickListener((view1 -> {

        }));

        return view;
    }

}
