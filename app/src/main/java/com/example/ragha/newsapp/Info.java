package com.example.ragha.newsapp;

/**
 * Created by ragha on 8/12/2017.
 */

public class Info {

    String mTitle;
    String mAuthor;
    String mUrl;
    String mDate;
    String mSection;

    public Info(String title, String author, String url, String date, String section) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mDate = date;
        mSection = section;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }


    public String getmUrl() {
        return mUrl;
    }


    public String getmDate() {
        return mDate;
    }


    public String getmSection() {
        return mSection;
    }


}
