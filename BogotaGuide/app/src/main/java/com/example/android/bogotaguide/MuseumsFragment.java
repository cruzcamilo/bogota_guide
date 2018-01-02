package com.example.android.bogotaguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<Place>();

        museums.add(new Place(getString(R.string.museum_name_1), getString(R.string.museum_address_1),
                R.string.main_hours_1, R.string.alt_hours_1,
                getString(R.string.museum_website_1) ));
        museums.add(new Place(getString(R.string.museum_name_2), getString(R.string.museum_address_2),
                R.string.main_hours_2, R.string.alt_hours_1,
                getString(R.string.museum_website_2)));
        museums.add(new Place(getString(R.string.museum_name_3), getString(R.string.museum_address_3),
                R.string.main_hours_1, R.string.alt_hours_2,
                getString(R.string.museum_website_3)));
        museums.add(new Place(getString(R.string.museum_name_4), getString(R.string.museum_address_4),
                R.string.main_hours_3, R.string.alt_hours_3,
                getString(R.string.museum_website_4)));
        museums.add(new Place(getString(R.string.museum_name_5), getString(R.string.museum_address_5),
                R.string.main_hours_2,  R.string.alt_hours_2,
                getString(R.string.museum_website_5)));
        museums.add(new Place(getString(R.string.museum_name_6), getString(R.string.museum_address_6),
                R.string.main_hours_2, R.string.alt_hours_1,
                getString(R.string.museum_website_6)));
        museums.add(new Place(getString(R.string.museum_name_7), getString(R.string.museum_address_7),
                R.string.main_hours_4, R.string.alt_hours_4,
                getString(R.string.museum_website_7)));
        museums.add(new Place(getString(R.string.museum_name_8), getString(R.string.museum_address_8),
                R.string.main_hours_1, R.string.alt_hours_4,
                getString(R.string.museum_website_8)));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), museums, R.color.museumBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}