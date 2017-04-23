package com.example.suche.travelify.Networking;

import android.net.Uri;

import com.example.suche.travelify.StartScreen;

/**
 * Created by Shashwat Uttam on 4/4/2017.
 */

public class UrlUtils {

    private static final String LOG_TAG = UrlUtils.class.getSimpleName();

    private UrlUtils(){
    }

    //private static String key = "AIzaSyChQ-8VvW6H9rOlXA4o7mhunVdsTfkM9UY";  //agg
    private static String key = "AIzaSyDiBvamlXvfV-8x3JBEwq9pyZYd5sbkGW8";  //uttam
    //private static final String BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json";
    private static final String BASE_URL = "https://maps.googleapis.com/maps/api/place/textsearch/json";
    private static final String DETAIL_URL = "https://maps.googleapis.com/maps/api/place/details/json";
    private static String radius = "10000";

    //types
    private static String[] types = {"attractions","restaurants","shopping_malls","hospitals"};
    public static String createUrl(int type){

        String placename;
        if(StartScreen.usegps==1){
            placename = QueryUtils.fetchlocality(StartScreen.latitude,StartScreen.longitude);
            if(placename == null){
                return null;
            }
        }
        else{
            placename = StartScreen.placename;
        }
        String location = Double.toString(StartScreen.latitude)+","+Double.toString(StartScreen.longitude);

        Uri baseuri = Uri.parse(BASE_URL);
        Uri.Builder uribuilder = baseuri.buildUpon();
        uribuilder.appendQueryParameter("query",types[type]+" in "+placename);
        uribuilder.appendQueryParameter("key",key);

        return uribuilder.toString();
    }

    public static String createDetailsUrl(String placeid){
        Uri baseuri = Uri.parse(DETAIL_URL);
        Uri.Builder uribuilder = baseuri.buildUpon();
        uribuilder.appendQueryParameter("placeid",placeid);
        uribuilder.appendQueryParameter("key",key);
        return uribuilder.toString();
    }

}
