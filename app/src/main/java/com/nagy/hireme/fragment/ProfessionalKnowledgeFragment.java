package com.nagy.hireme.fragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.nagy.hireme.R;
import com.nagy.hireme.adapter.AndroidAdapter;
import com.nagy.hireme.adapter.OtherAdapter;
import com.nagy.hireme.adapter.ProgLanguagesAdapter;
import com.nagy.hireme.util.DataUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfessionalKnowledgeFragment extends Fragment {

    @BindView(R.id.prof_knowledge_radioGroup)
    RadioGroup radioGroup;

    @BindView(R.id.prof_knowledge_listView)
    ListView listView;

    @OnClick(R.id.prof_knowledge_info)
    public void onInfoClicked() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Info")
                .setMessage("A nyelvek mellett található számok 1-5-ös skálán jelölik, hogy " +
                        "véleményem szerint milyen szintű az adott téren az ismeretem. (1-rossz, 5-kiváló)")
                .setPositiveButton("Ok", null)
                .show();
    }

    public ProfessionalKnowledgeFragment() {
        // Required empty public constructor
    }

    public static ProfessionalKnowledgeFragment newInstance() {
        return new ProfessionalKnowledgeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_professional_knowledge, container, false);
        ButterKnife.bind(this, layout);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.prof_knowledge_prog_lang:
                        listView.setAdapter(new ProgLanguagesAdapter(getContext(), DataUtil.getProgLanguages()));
                        break;
                    case R.id.prof_knowledge_android:
                        listView.setAdapter(new AndroidAdapter(getContext(), DataUtil.getAndroidKnowledge()));
                        break;
                    case R.id.prof_knowledge_other:
                        listView.setAdapter(new OtherAdapter(getContext(), DataUtil.getOtherKnowledge()));
                        break;
                }
            }
        });

        RadioButton rbFirst = layout.findViewById(R.id.prof_knowledge_prog_lang);
        rbFirst.setChecked(true);
        return layout;
    }

}
