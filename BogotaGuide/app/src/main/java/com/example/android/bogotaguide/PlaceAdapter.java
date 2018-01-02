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

import static com.example.android.bogotaguide.R.id.words;

/**
 * Created by User on 01/05/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {

        // Here, we initialize the Places internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_no_image, null);
            holder = new ViewHolder();
            holder.nameTextView = (TextView) convertView.findViewById(R.id.place_name);
            holder.addressTextView = (TextView) convertView.findViewById(R.id.place_address);
            holder.mainHoursTextView = (TextView) convertView.findViewById(R.id.place_main_hours);
            holder.alternativeHoursTextView = (TextView) convertView.findViewById(R.id.place_alternative_hours);
            holder.nameWebView = (TextView) convertView.findViewById(R.id.place_website);
            holder.imageView = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Place currentPlace = getItem(position);

        holder.nameTextView.setText(currentPlace.getName());
        holder.addressTextView.setText(currentPlace.getAddress());
        holder.mainHoursTextView.setText(currentPlace.getMainHours());

        if (currentPlace.getAlternativeHours() == 0) {
            holder.alternativeHoursTextView.setVisibility(View.GONE);
        } else {
            holder.alternativeHoursTextView.setText(currentPlace.getAlternativeHours());
        }

        holder.nameWebView.setText(currentPlace.getWebsite());

        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.imageView.setImageResource(currentPlace.getImageResourceID());
            // Make sure the view is visible
            holder.imageView.setVisibility(View.VISIBLE);
        } else {
            holder.imageView.setVisibility(View.GONE);
        }

        View textContainer = convertView.findViewById(words);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return convertView;
    }

    static class ViewHolder {
        private TextView nameTextView;
        private TextView addressTextView;
        private TextView mainHoursTextView;
        private TextView alternativeHoursTextView;
        private TextView nameWebView;
        private ImageView imageView;
    }
}