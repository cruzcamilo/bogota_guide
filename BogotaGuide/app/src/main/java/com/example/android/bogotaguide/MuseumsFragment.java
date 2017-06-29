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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<Place>();

        museums.add(new Place("Museo Nacional", "Cra 7a #28-66", R.string.mainHours1,
                R.string.alternativeHours1, "http://www.museonacional.gov.co" ));
        museums.add(new Place("Museo de Arte del Banco de la República", "Calle 11 # 4-21",
                R.string.mainHours2, R.string.alternativeHours1,
                "http://banrepcultural.org/coleccion-de-arte-banco-de-la-republica/"));
        museums.add(new Place("MAMBO", "Calle 24 #6 - 00", R.string.mainHours1,
                R.string.alternativeHours2, "http://www.mambogota.com"));
        museums.add(new Place("Museo Colonial", "Carrera 6 No. 9 - 77", R.string.mainHours3,
                R.string.alternativeHours3, "http://www.museocolonial.gov.co"));
        museums.add(new Place("Casa de Moneda", "Calle 11 # 4-93", R.string.mainHours2,
                R.string.alternativeHours2, "http://www.banrepcultural.org/museos-y-colecciones/casa-de-moneda"));
        museums.add(new Place("Museo Botero", "Calle 11 # 4 - 14", R.string.mainHours2,
                R.string.alternativeHours1, "http://www.banrepcultural.org/museo-botero"));
        museums.add(new Place("Museo del Oro", "Cra 6 # 15-82", R.string.mainHours4,
                R.string.alternativeHours4, "http://www.banrepcultural.org/museo-del-oro"));
        museums.add(new Place("Museo de Bogotá", "Cra. 4 # 10-18", R.string.mainHours1,
                R.string.alternativeHours4, "http://museodebogota.gov.co/"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), museums, R.color.museumBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}