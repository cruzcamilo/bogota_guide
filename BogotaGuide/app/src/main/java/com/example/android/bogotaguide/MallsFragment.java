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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> malls = new ArrayList<Place>();

        malls.add(new Place("Unicentro", "Cra. 15 # 124 - 30", R.string.mainHoursUni, 0,
                "http://www.unicentrobogota.com"));
        malls.add(new Place("Andino", "Cra. 11 # 82 - 71", R.string.mainHoursAn, R.string.altHoursAn,
                "https://www.centroandino.com.co"));
        malls.add(new Place("Santa Fe", "Calle 185 # 45 - 03", R.string.mainHoursSF,
                R.string.altHoursSF, "http://www.centrocomercialsantafe.com/bogota"));

        malls.add(new Place("Titán Plaza", "Av. Boyacá # 80 - 94", R.string.mainHoursTP, 0,
                "http://www.titanplaza.com"));
        malls.add(new Place("Gran Estación", "Av. Calle 26 # 62 - 47", R.string.mainHoursGE, 0,
                "http://www.granestacion.com.co"));
        malls.add(new Place("Plaza de las Américas", "Transversal 71 D # 6 - 94 Sur",
                R.string.mainHoursPA, 0, "https://www.plazadelasamericas.com.co/"));
        malls.add(new Place("Calima", "Av. Cra. 30 # 19",
                R.string.mainHoursPA, 0,  "http://www.calimaccbogota.com/"));
        malls.add(new Place("Plaza Central", "Cra. 65 # 11 - 50", R.string.mainHoursPC,
                0, "https://centrocomercialplazacentral.com/"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), malls, R.color.mallsBackgroundColor);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
