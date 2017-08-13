package com.example.ragha.newsapp;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by ragha on 8/12/2017.
 */


public class NewsLoader extends AsyncTaskLoader<List<Info>> {


    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {

        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<Info> loadInBackground() {


        List<Info> News = null;
        try {
            URL url = QueryUtils.createUrl();
            String jsonResponse = QueryUtils.makeHttpRequest(url);
            News = QueryUtils.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
       }

        return News;
    }
}
