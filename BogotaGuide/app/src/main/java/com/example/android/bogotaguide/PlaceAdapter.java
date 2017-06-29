package com.example.android.bogotaguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 01/05/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {


    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> words, int colorResourceId) {

        // Here, we initialize the Word's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_no_image, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentPlace.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.place_address);
        addressTextView.setText(currentPlace.getAddress());


        TextView mainHoursTextView = (TextView) listItemView.findViewById(R.id.place_main_hours);
        mainHoursTextView.setText(currentPlace.getMainHours());

        TextView alternativeHoursTextView = (TextView) listItemView.findViewById(R.id.place_alternative_hours);


        if(currentPlace.getAlternativeHours() == 0){
            alternativeHoursTextView.setVisibility(View.GONE);
        } else{
            alternativeHoursTextView.setText(currentPlace.getAlternativeHours());
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and
        // set the image to image
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView nameWebView = (TextView) listItemView.findViewById(R.id.place_website);
        nameWebView.setText(currentPlace.getWebsite());

        View textContainer = listItemView.findViewById(R.id.words);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}