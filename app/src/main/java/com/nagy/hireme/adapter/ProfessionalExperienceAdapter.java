package com.nagy.hireme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nagy.hireme.R;
import com.nagy.hireme.data.ProfessionalExperience;

import java.util.List;

public class ProfessionalExperienceAdapter extends BaseAdapter {

    private Context context;
    private List<ProfessionalExperience> data;

    static class ViewHolder {
        TextView tvTitle;
        ImageView ivExpand;
        TextView tvText;
    }

    public ProfessionalExperienceAdapter(Context context, List<ProfessionalExperience> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_professional_experience, null);
            ProfessionalExperienceAdapter.ViewHolder holder = new ProfessionalExperienceAdapter.ViewHolder();
            holder.tvTitle = v.findViewById(R.id.prof_exp_title);
            holder.ivExpand = v.findViewById(R.id.prof_exp_expand);
            holder.tvText = v.findViewById(R.id.prof_exp_text);
            v.setTag(holder);
        }

        final ProfessionalExperience data = this.data.get(position);
        if(data != null) {
            final ProfessionalExperienceAdapter.ViewHolder holder = (ProfessionalExperienceAdapter.ViewHolder) v.getTag();

            holder.tvTitle.setText(data.getTitle() + " (" + data.getInterval() + ")");
            holder.tvText.setText(data.getText());

            holder.ivExpand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(data.isExpanded()) {
                        // TODO: összerakni
                        holder.ivExpand.setImageResource(R.drawable.ic_keyboard_arrow_down_black_48dp);
                        holder.tvText.setVisibility(View.GONE);
                    } else {
                        holder.ivExpand.setImageResource(R.drawable.ic_keyboard_arrow_up_black_48dp);
                        holder.tvText.setVisibility(View.VISIBLE);
                    }
                    data.setExpanded(!data.isExpanded());
                }
            });

        }
        return v;
    }
}
