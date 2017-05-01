package com.example.suche.travelify.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.suche.travelify.Fragment.AttractionsFragment;
import com.example.suche.travelify.Fragment.FoodFragment;
import com.example.suche.travelify.Fragment.HospitalsFragment;
import com.example.suche.travelify.Fragment.ParkFragment;
import com.example.suche.travelify.Fragment.SightSeeingFragment;
import com.example.suche.travelify.Fragment.airportFragment;
import com.example.suche.travelify.Fragment.atmFragment;
import com.example.suche.travelify.Fragment.movietheaterFragment;
import com.example.suche.travelify.Fragment.museumFragment;
import com.example.suche.travelify.Fragment.taxiStandFragment;
import com.example.suche.travelify.Fragment.templeFragment;
import com.example.suche.travelify.Fragment.trainstationFragment;
import com.example.suche.travelify.Fragment.zooFragment;
import com.example.suche.travelify.R;

/**
 * Created by Shashwat Aggarwal on 3/31/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter{


    // Count of Tabs.
    final private int PAGE_COUNT = 13;

    private Context mContext;

    // Constructor.
    public FragmentAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    // Get Fragment.
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:     return new SightSeeingFragment();
            case 1:     return new AttractionsFragment();
            case 2:     return new templeFragment();

            case 3:     return new FoodFragment();
            case 4:     return new ParkFragment();
            case 5:     return new museumFragment();
            case 6:     return new movietheaterFragment();
            case 7:     return new zooFragment();

            case 8:    return new atmFragment();
            case 9:    return new HospitalsFragment();

            case 10:    return new airportFragment();
            case 11:    return new trainstationFragment();
            case 12:    return new taxiStandFragment();
            default:    return null;
        }

    }

    // Get No of Tabs.
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position

        switch(position){
            case 0:     return mContext.getResources().getString(R.string.category_sightseeing);
            case 1:     return mContext.getResources().getString(R.string.category_attractions);
            case 2:     return mContext.getResources().getString(R.string.category_temple);

            case 3:     return mContext.getResources().getString(R.string.category_food);
            case 4:     return mContext.getResources().getString(R.string.category_park);
            case 5:     return mContext.getResources().getString(R.string.category_museum);
            case 6:     return mContext.getResources().getString(R.string.category_movie);
            case 7:     return mContext.getResources().getString(R.string.category_zoo);


            case 8:    return mContext.getResources().getString(R.string.category_atm);
            case 9:    return mContext.getResources().getString(R.string.category_hospitals);

            case 10:    return mContext.getResources().getString(R.string.category_airport);
            case 11:    return mContext.getResources().getString(R.string.category_train);
            case 12:    return mContext.getResources().getString(R.string.category_taxi);
            default:    return null;
        }

    }
}
