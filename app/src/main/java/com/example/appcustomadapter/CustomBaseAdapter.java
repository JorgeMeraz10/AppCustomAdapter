package com.example.appcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String PlayerList[];
    int playerImages[];
    LayoutInflater inflater;

    public  CustomBaseAdapter(Context context, String [] PlayerList, int [] images)
    {
        this.context = context;
        this.PlayerList = PlayerList;
        this.playerImages = images;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return PlayerList.length;
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
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView playerImg = (ImageView) convertView.findViewById(R.id.imageIcom);
        textView.setText(PlayerList[position]);
        playerImg.setImageResource(playerImages[position]);
        return convertView;



    }
}
