package com.nagy.hireme.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.nagy.hireme.R;
import com.nagy.hireme.adapter.HobbiesAdapter;
import com.nagy.hireme.util.DataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HobbiesFragment extends Fragment {

    @BindView(R.id.hobby_listView)
    ListView listView;

    public HobbiesFragment() {
        // Required empty public constructor
    }

    public static HobbiesFragment newInstance() {
        return new HobbiesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_hobbies, container, false);
        ButterKnife.bind(this, layout);

        listView.setAdapter(new HobbiesAdapter(getContext(), DataUtil.getHobbies()));
        return layout;
    }

}
