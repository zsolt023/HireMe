package com.nagy.hireme.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nagy.hireme.R;
import com.nagy.hireme.data.Hobby;

import java.util.List;

public class HobbiesAdapter extends BaseAdapter {

    private Context context;
    private List<Hobby> data;

    static class ViewHolder {
        TextView tvText;
        ImageView ivIcon;
    }

    public HobbiesAdapter(Context context, List<Hobby> data) {
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
    public View getView(int position, final View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_hobby, null);
            HobbiesAdapter.ViewHolder holder = new HobbiesAdapter.ViewHolder();
            holder.tvText = v.findViewById(R.id.hobby_text);
            holder.ivIcon = v.findViewById(R.id.hobby_icon);
            v.setTag(holder);
        }

        Hobby data = this.data.get(position);
        if(data != null) {
            final HobbiesAdapter.ViewHolder holder = (HobbiesAdapter.ViewHolder) v.getTag();

            if(data.getTitle().contains("Android")) {
                holder.tvText.setTextColor(context.getResources().getColor(R.color.link));
                holder.tvText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                        context.startActivity(browserIntent);
                    }
                });
            }
            holder.tvText.setText(data.getTitle());
            holder.ivIcon.setImageResource(data.getResId());
        }
        return v;
    }
}
