package com.nagy.hireme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nagy.hireme.R;
import com.nagy.hireme.data.OtherKnowledge;

import java.util.List;

public class OtherAdapter extends BaseAdapter {

    private Context context;
    private List<OtherKnowledge> data;

    static class ViewHolder {
        TextView tvText;
    }

    public OtherAdapter(Context context, List<OtherKnowledge> data) {
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
            v = inflater.inflate(R.layout.row_android, null);
            OtherAdapter.ViewHolder holder = new OtherAdapter.ViewHolder();
            holder.tvText = v.findViewById(R.id.text);
            v.setTag(holder);
        }

        OtherKnowledge data = this.data.get(position);
        if(data != null) {
            final OtherAdapter.ViewHolder holder = (OtherAdapter.ViewHolder) v.getTag();

            holder.tvText.setText(data.getName());
        }
        return v;
    }
}
