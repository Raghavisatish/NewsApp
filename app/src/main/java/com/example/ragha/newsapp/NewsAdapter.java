package com.example.ragha.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ragha on 8/12/2017.
 */

public class NewsAdapter extends ArrayAdapter<Info> {

    public NewsAdapter(Context context) {
        super(context, -1, new ArrayList<Info>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if (listItemView == null) {
            listItemView
                    = LayoutInflater.from(getContext()).inflate(R.layout.news_info, parent, false);
        }

        Info currentNews = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getmTitle());
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentNews.getmAuthor());
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentNews.getmDate());
        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getmSection());

        return listItemView;
    }
}
