package com.nagy.hireme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nagy.hireme.R;
import com.nagy.hireme.data.ProgLangKnowledge;

import java.util.List;

public class ProgLanguagesAdapter extends BaseAdapter {

    private Context context;
    private List<ProgLangKnowledge> data;

    static class ViewHolder {
        TextView tvText;
        TextView tvRating;
    }

    public ProgLanguagesAdapter(Context context, List data) {
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
            v = inflater.inflate(R.layout.row_prog_languages, null);
            ProgLanguagesAdapter.ViewHolder holder = new ProgLanguagesAdapter.ViewHolder();
            holder.tvText = v.findViewById(R.id.text);
            holder.tvRating = v.findViewById(R.id.rating);
            v.setTag(holder);
        }

        ProgLangKnowledge data = this.data.get(position);
        if(data != null) {
            final ProgLanguagesAdapter.ViewHolder holder = (ProgLanguagesAdapter.ViewHolder) v.getTag();

            holder.tvText.setText(data.getLanguageName());
            holder.tvRating.setText(Integer.toString(data.getRating()));
        }
        return v;
    }
}
