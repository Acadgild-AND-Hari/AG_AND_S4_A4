package com.hari.aag.androidversions.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hari.aag.androidversions.R;

/**
 * Created by Hari Nivas Kumar R P on 12/14/2016.
 */

public class AndroidVersionsAdapter extends BaseAdapter {
    private Context context;
    private final int[] androidVersionResourceIds = {
            R.drawable.alpha, R.drawable.beta,
            R.drawable.cupcake, R.drawable.donut,
            R.drawable.eclair, R.drawable.froyo,
            R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.ice_cream_sandwich, R.drawable.jelly_bean,
            R.drawable.kitkat, R.drawable.lollipop,
            R.drawable.marshmallow, R.drawable.nougat
    };
    private final String[] androidVersionNames = {
            "Alpha", "Beta",
            "Cupcake", "Donut",
            "Eclair", "Froyo",
            "Gingerbread", "Honeycomb",
            "IceCreamSandwich", "JellyBean",
            "KitKat", "Lollipop",
            "Marshmallow", "Nougat"
    };

    public AndroidVersionsAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return androidVersionResourceIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            convertView = ((Activity) context).getLayoutInflater()
                    .inflate(R.layout.android_version_item_layout, parent, false);

            holder = new ViewHolder();
            holder.imageIV = (ImageView) convertView.findViewById(R.id.id_image);
            holder.titleTV = (TextView) convertView.findViewById(R.id.id_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imageIV.setImageResource(androidVersionResourceIds[position]);
        holder.imageIV.setContentDescription("Image for " + androidVersionNames[position]);
        holder.titleTV.setText(androidVersionNames[position]);
        return convertView;
    }

    private static class ViewHolder {
        ImageView imageIV;
        TextView titleTV;
    }
}
