package com.nagy.hireme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nagy.hireme.R;
import com.nagy.hireme.data.Education;

import java.util.List;

public class EducationAdapter extends BaseAdapter {

    private Context context;
    private List<Education> data;

    static class ViewHolder {
        TextView tvType;
        TextView tvName;
        TextView tvInterval;
    }

    public EducationAdapter(Context context, List<Education> data) {
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
            v = inflater.inflate(R.layout.row_education, null);
            EducationAdapter.ViewHolder holder = new EducationAdapter.ViewHolder();

            holder.tvType = v.findViewById(R.id.row_ed_type);
            holder.tvName = v.findViewById(R.id.row_ed_name);
            holder.tvInterval = v.findViewById(R.id.row_ed_interval);
            v.setTag(holder);
        }

        Education data = this.data.get(position);
        if(data != null) {
            final EducationAdapter.ViewHolder holder = (EducationAdapter.ViewHolder) v.getTag();

            holder.tvType.setText(data.getType());
            holder.tvName.setText(data.getName());
            holder.tvInterval.setText(data.getInterval());
        }
        return v;
    }
}
