package com.example.suche.travelify.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.suche.travelify.Fragment.AttractionsFragment;
import com.example.suche.travelify.Fragment.FoodFragment;
import com.example.suche.travelify.Fragment.HospitalsFragment;
import com.example.suche.travelify.Fragment.SightSeeingFragment;
import com.example.suche.travelify.R;

/**
 * Created by Shashwat Aggarwal on 3/31/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter{


    // Count of Tabs.
    final private int PAGE_COUNT = 4;

    private Context mContext;

    // Constructor.
    public FragmentAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    // Get Fragment.
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightSeeingFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new HospitalsFragment();
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
        if (position == 0){
            return mContext.getResources().getString(R.string.category_sightseeing);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_attractions);
        } else {
            return mContext.getResources().getString(R.string.category_hospitals);
        }
    }
}
