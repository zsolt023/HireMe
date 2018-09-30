package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nagy.hireme.R;

public class ReferencesFragment extends Fragment {

    public ReferencesFragment() {
        // Required empty public constructor
    }

    public static ReferencesFragment newInstance() {
        return new ReferencesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_references, container, false);
    }

}
