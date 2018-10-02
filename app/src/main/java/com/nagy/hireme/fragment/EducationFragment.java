package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nagy.hireme.R;
import com.nagy.hireme.adapter.EducationAdapter;
import com.nagy.hireme.util.DataUtil;

public class EducationFragment extends Fragment {

    public EducationFragment() {
        // Required empty public constructor
    }

    public static EducationFragment newInstance() {
        return new EducationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_education, container, false);
        ListView listView = layout.findViewById(R.id.education_listView);
        listView.setAdapter(new EducationAdapter(getContext(), DataUtil.getEducation()));
        return layout;
    }

}
