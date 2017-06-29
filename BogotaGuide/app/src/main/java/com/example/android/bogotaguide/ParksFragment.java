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

        parks.add(new Place(R.drawable.simon_bolivar, "Simón Bolivar", "Av. Calle 53 y Av. Esmeralda",
                R.string.mainHoursSM, 0, "http://www.idrd.gov.co/sitio/idrd/?q=node/233"));
        parks.add(new Place(R.drawable.noventa_y_tres, "Parque de la 93", "Cra. 13 # 93A",
                R.string.mainHours24, 0, "http://parque93.com/"));
        parks.add(new Place(R.drawable.virrey, "Parque el Virrey",
                "Cll 87 con Cra. 7ma hasta Autopista Norte", R.string.mainHours24, 0,
                "http://www.idrd.gov.co/sitio/idrd/node/300"));
        parks.add(new Place(R.drawable.novios, "Parque de los Novios", "Calle 63 # 45-10",
                R.string.mainHoursParqueNovios, R.string.altHoursParqueNovios,
                "http://www.idrd.gov.co/sitio/idrd/content/parque-el-lago-parque-de-los-novios"));
        parks.add(new Place(R.drawable.nacional, "Parque Nacional", "Calle 35 # 3 - 50",
                R.string.mainHoursDS, 0, "http://www.idrd.gov.co/sitio/idrd/node/243"));
        parks.add(new Place(R.drawable.jardin_botanico, "Jardín Botánico",
                "Avenida Calle 63 No. 68-95", R.string.mainHoursJardinBotanico,
                R.string.altHoursJardinBotanico, "http://www.jbb.gov.co/"));
        parks.add(new Place(R.drawable.independencia, "Parque Independencia", "Cra 7 # 26 - 07",
                R.string.mainHoursSM, 0, "http://www.idrd.gov.co/sitio/idrd/node/236"));

        parks.add(new Place(R.drawable.monserrate, "Cerro Monserrate", "Cra 2 Este No. 21-48",
                R.string.websiteHours, 0, "http://www.cerromonserrate.com/en/"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), parks, R.color.parksBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}