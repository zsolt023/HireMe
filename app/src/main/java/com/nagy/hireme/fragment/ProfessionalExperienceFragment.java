package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nagy.hireme.R;
import com.nagy.hireme.adapter.ProfessionalExperienceAdapter;
import com.nagy.hireme.util.DataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfessionalExperienceFragment extends Fragment {

    @BindView(R.id.prof_exp_listView)
    ListView listView;

    public ProfessionalExperienceFragment() {
        // Required empty public constructor
    }

    public static ProfessionalExperienceFragment newInstance() {
        return new ProfessionalExperienceFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_professional_experience, container, false);
        ButterKnife.bind(this, layout);

        listView.setAdapter(new ProfessionalExperienceAdapter(getContext(), DataUtil.getProfessionalExperiences()));
        return layout;
    }
}
