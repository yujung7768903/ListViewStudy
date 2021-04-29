package com.example.listviewstudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    ArrayList<MovieData> movieData = new ArrayList<>();
    //총 몇 개 인지
    @Override
    public int getCount() {
        return movieData.size();
    }
    //아이템 반환(MovieData 안에 있는 아이템들을 하나씩 보내줌)
    @Override
    public Object getItem(int position) {
        return movieData.get(position);
    }
    //인덱스 번호
    @Override
    public long getItemId(int position) {
        return position;
    }
    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.movie_layout, (ViewGroup) convertView,false);

        ImageView poster = convertView.findViewById(R.id.poster);
        TextView title = convertView.findViewById(R.id.title);
        TextView category = convertView.findViewById(R.id.category);
        TextView release = convertView.findViewById(R.id.release);
        TextView character = convertView.findViewById(R.id.character);

        MovieData movie = movieData.get(position);
        
        return null;
    }
}
