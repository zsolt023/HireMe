package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nagy.hireme.R;

public class LanguageFragment extends Fragment {

    public LanguageFragment() {
        // Required empty public constructor
    }

    public static LanguageFragment newInstance() {
        return new LanguageFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_language, container, false);
    }

}
