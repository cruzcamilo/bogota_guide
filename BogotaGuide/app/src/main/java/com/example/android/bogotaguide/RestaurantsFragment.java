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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> restaurants = new ArrayList<Place>();

        restaurants.add(new Place(getString(R.string.restaurant_name_1),
                getString(R.string.restaurant_address_1), R.string.main_hours_restaurant_1, 0,
                getString(R.string.restaurant_website_1)));
        restaurants.add(new Place(getString(R.string.restaurant_name_2),
                getString(R.string.restaurant_address_2), R.string.main_hours_restaurant_2, 0,
                getString(R.string.restaurant_website_2)));
        restaurants.add(new Place(getString(R.string.restaurant_name_3),
                getString(R.string.restaurant_address_3), R.string.main_hours_restaurant_3, 0,
                getString(R.string.restaurant_website_3)));
        restaurants.add(new Place(getString(R.string.restaurant_name_4),
                getString(R.string.restaurant_address_4), R.string.main_24_hours, 0,
                getString(R.string.restaurant_website_4)));
        restaurants.add(new Place(getString(R.string.restaurant_name_5),
                getString(R.string.restaurant_address_5), R.string.main_hours_restaurant_5,
                0, getString(R.string.restaurant_website_5)));
        restaurants.add(new Place(getString(R.string.restaurant_name_6),
                getString(R.string.restaurant_address_6), R.string.main_hours_restaurant_6,
                0, getString(R.string.restaurant_website_6)));
        restaurants.add(new Place(getString(R.string.restaurant_name_7),
                getString(R.string.restaurant_address_7), R.string.main_hours_restaurant_7,
                0, getString(R.string.restaurant_website_7)));
        restaurants.add(new Place(getString(R.string.restaurant_name_8),
                getString(R.string.restaurant_address_8), R.string.main_hours_restaurant_8,
                0, getString(R.string.restaurant_website_8)));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), restaurants, R.color.restaurantBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}