package com.example.android.bogotaguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private int[] imageResId = {
            R.drawable.museums,
            R.drawable.parks,
            R.drawable.restaurants,
            R.drawable.malls
    };


    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1){
            return new ParksFragment();
        } else if (position == 2){
            return new RestaurantsFragment();
        } else {
            return new MallsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_malls);
        }
    }

    @Override
    public int getCount() {

        return 4;
    }
}

