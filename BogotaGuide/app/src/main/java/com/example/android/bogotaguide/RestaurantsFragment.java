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

        restaurants.add(new Place("Piqueteadero Doña Segunda", "Cra 51 # 73", R.string.mainHoursDS, 0,
                "http://365bogota.com/mercados/piqueteadero-dona-segunda"));
        restaurants.add(new Place("Restaurante Doña Elvira", "Cl. 50 #20-26",
                R.string.mainHoursDE, 0, "http://www.restaurantedonaelvira.com/"));
        restaurants.add(new Place("Restaurante Las Ojonas", "Cra. 27a #24-12",
                R.string.mainHoursLO, 0, "www.restaurantemagolitalasojonas.com"));

        restaurants.add(new Place("Cañón Del Chicamocha", "Cll 57 No. 19-09", R.string.mainHours24, 0,
                "http://www.cocinasemana.com/restaurantes/sucursal/canon-del-chicamocha/29969"));
        restaurants.add(new Place("Refugio Marino", "Cll 50a N°13-62", R.string.mainHoursRM, 0,
                "https://bogota.restorando.com.co/restaurante/refugio-marino"));
        restaurants.add(new Place("Pescadero Benjamin Bohorquez", "Av. 12 sur # 16-65",
                R.string.mainHoursBB, 0,
                "http://guiamultimedia.com.co/cliente.php?item=3&id=9&lang=1"));
        restaurants.add(new Place("Asadero Capachos", "Cll 18 # 4-68",
                R.string.mainHoursAC, 0,  "http://www.asaderocapachos.com"));
        restaurants.add(new Place("La Esquina Vegetariana", "Cra 11 69 #26", R.string.mainHoursEV,
                0, "https://www.atrapalo.com.co/restaurantes/la-esquina-vegetariana_f32428.html"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), restaurants, R.color.restaurantBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}