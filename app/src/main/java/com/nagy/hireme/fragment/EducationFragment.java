package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nagy.hireme.R;

public class EducationFragment extends Fragment {

    public EducationFragment() {
        // Required empty public constructor
    }

    public static EducationFragment newInstance() {
        return new EducationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_education, container, false);
    }

}
