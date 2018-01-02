package com.example.android.bogotaguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> malls = new ArrayList<Place>();

        malls.add(new Place(getString(R.string.mall_name_1), getString(R.string.mall_address_1),
                R.string.main_hours_mall_1, 0, getString(R.string.mall_website_1)));
        malls.add(new Place(getString(R.string.mall_name_2), getString(R.string.mall_address_2),
                R.string.main_hours_mall_2, R.string.alt_hours_mall_2,
                getString(R.string.mall_website_2)));
        malls.add(new Place(getString(R.string.mall_name_3), getString(R.string.mall_address_3),
                R.string.main_hours_mall_3, R.string.alt_hours_mall_3,
                getString(R.string.mall_website_3)));
        malls.add(new Place(getString(R.string.mall_name_4), getString(R.string.mall_address_4),
                R.string.main_hours_mall_4, 0, getString(R.string.mall_website_4)));
        malls.add(new Place(getString(R.string.mall_name_5), getString(R.string.mall_address_5),
                R.string.main_hours_mall_5, 0, getString(R.string.mall_website_5)));
        malls.add(new Place(getString(R.string.mall_name_6), getString(R.string.mall_address_6),
                R.string.main_hours_mall_6, 0, getString(R.string.mall_website_6)));
        malls.add(new Place(getString(R.string.mall_name_7), getString(R.string.mall_address_7),
                R.string.main_hours_mall_6, 0, getString(R.string.mall_website_7)));
        malls.add(new Place(getString(R.string.mall_name_8), getString(R.string.mall_address_8),
                R.string.main_hours_mall_8, 0, getString(R.string.mall_website_8)));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), malls, R.color.mallsBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}