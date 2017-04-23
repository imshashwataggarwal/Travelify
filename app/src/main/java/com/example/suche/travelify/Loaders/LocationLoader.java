package com.example.suche.travelify.Loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.example.suche.travelify.Model.BasicLocation;
import com.example.suche.travelify.Networking.QueryUtils;
import com.example.suche.travelify.Networking.UrlUtils;

import java.util.List;

/**
 * Created by Shashwat Uttam on 4/2/2017.
 */

public class LocationLoader extends AsyncTaskLoader<List<BasicLocation>> {

    private String url;
    private int type;

    public LocationLoader(Context context, int a){
        super(context);
        type = a;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<BasicLocation> loadInBackground() {
        url = UrlUtils.createUrl(type);
        if(url==null)
            return null;
        List<BasicLocation> locations = QueryUtils.fetchLocationdata(url);

        return locations;
    }
}
