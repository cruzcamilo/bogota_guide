package com.example.android.bogotaguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> parks = new ArrayList<Place>();

        parks.add(new Place(R.drawable.simon_bolivar, getString(R.string.park_name_1),
                getString(R.string.park_address_1), R.string.main_hours_park_1, 0,
                getString(R.string.park_website_1)));
        parks.add(new Place(R.drawable.noventa_y_tres, getString(R.string.park_name_2),
                getString(R.string.park_address_2), R.string.main_24_hours, 0,
                getString(R.string.park_website_2)));
        parks.add(new Place(R.drawable.virrey, getString(R.string.park_name_3),
                getString(R.string.park_address_3), R.string.main_24_hours, 0,
                getString(R.string.park_website_3)));
        parks.add(new Place(R.drawable.novios, getString(R.string.park_name_4),
                getString(R.string.park_address_4), R.string.main_hours_park_4,
                R.string.alt_hours_park_4,
                getString(R.string.park_website_4)));
        parks.add(new Place(R.drawable.nacional, getString(R.string.park_name_5),
                getString(R.string.park_address_5), R.string.main_hours_restaurant_1, 0,
                getString(R.string.park_website_5)));
        parks.add(new Place(R.drawable.jardin_botanico, getString(R.string.park_name_6),
                getString(R.string.park_address_6), R.string.main_hours_park_6,
                R.string.alt_hours_park_6, getString(R.string.park_website_6)));
        parks.add(new Place(R.drawable.independencia, getString(R.string.park_name_7),
                getString(R.string.park_address_7), R.string.main_hours_park_1, 0,
                getString(R.string.park_website_7)));
        parks.add(new Place(R.drawable.monserrate, getString(R.string.park_name_8),
                getString(R.string.park_address_8),  R.string.websiteHours, 0,
                getString(R.string.park_website_8)));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), parks, R.color.parksBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}